package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

import br.com.fiap.bo.UsuarioBO;

@ManagedBean
public class GraficoBean {
	
	private PieChartModel graficoPizza;
	private UsuarioBO bo;
	private LineChartModel graficoLinha;
	
	@PostConstruct
	private void init(){
		
		bo = new UsuarioBO();		
		graficoPizza = new PieChartModel();
		graficoLinha =  new LineChartModel();
	
		graficoPizza.set("Abaixo de média", bo.contarUsuarioPorNivel(1) + bo.contarUsuarioPorNivel(2));
		graficoPizza.set("Normal", bo.contarUsuarioPorNivel(3));
		graficoPizza.set("Acima da Média", bo.contarUsuarioPorNivel(4) + bo.contarUsuarioPorNivel(5));
	
		graficoPizza.setLegendPosition("e");
		graficoPizza.setShowDataLabels(true);
	
		
		
		graficoLinha.setLegendPosition("e");
		graficoLinha.setShowDatatip(true);
		graficoLinha.setAnimate(true);
	
	
	
	}

	
	
	
	
	
	
	public PieChartModel getGraficoPizza() {
		return graficoPizza;
	}

	public void setGraficoPizza(PieChartModel graficoPizza) {
		this.graficoPizza = graficoPizza;
	}

	
	
}
