package br.com.fiap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Veiculo;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {
	
	//Simular o banco de dados
	private static List<Veiculo> banco = new ArrayList<>();

	@GetMapping("cadastrar") //Abre a tela do formulário
	public String abrirForm(){
		return "veiculo/cadastro";
	}
	
	@PostMapping("cadastrar")//Parametro do formulario acttion
	//Processa as informações do formunario
	public ModelAndView processarForm(Veiculo veiculo){
		System.out.println("Veiculo: " + veiculo.getMarca() + 
						   "\tModelo: " + veiculo.getModelo() + 
						   "\tAno: " + veiculo.getAno() + 
						   "\tPlaca: " + veiculo.getPlaca() + 
						   "\tCor: " + veiculo.getCor());
		//Cadastrar no banco
		banco.add(veiculo);
		//Retorno		
		ModelAndView retorno = new ModelAndView("veiculo/cadastroSucesso");
		retorno.addObject("v", veiculo);
		return retorno;
	}
	
	@GetMapping("listar")
	public ModelAndView listarVeiculos(){		
		ModelAndView retorno = new ModelAndView("veiculo/listaVeiculo");
		retorno.addObject("veiculos",banco);
		return retorno;
		
	}

}
