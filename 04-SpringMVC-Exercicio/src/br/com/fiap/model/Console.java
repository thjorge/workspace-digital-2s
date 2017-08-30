package br.com.fiap.model;


public class Console {

	private int codigo;
	private String marca;
	private String modelo;
	private double valor;
	private Boolean travado;	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Boolean getTravado() {
		return travado;
	}
	public void setTravado(Boolean travado) {
		this.travado = travado;
	}
	
	
	
}
