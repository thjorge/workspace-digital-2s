<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<tags:templete titulo="sucesso">

	<h3>Cadastro com sucesso!</h3>
	
	<h5> Veiculo: ${v.marca }</br>Modelo: ${v.modelo }</br>	Ano: ${v.ano }</br>Placa: ${v.placa }</br>Cor: ${v.cor }</h5>
</tags:templete>
