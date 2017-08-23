<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<tags:templete titulo="Cadastro de Veículo">
	<h4><br>Cadastro</h4>
	<form action="cadastrar" method="post">
	<div>
		<label for="id-marca">Marca</label>
		<input type="text" name="marca" id="id-marca" class="form-control">
	</div>
	<div>
		<label for="id-modelo">Modelo</label>
		<input type="text" name="modelo" id="id-modelo" class="form-control">
	</div>
	<div>
		<label for="id-ano">Ano</label>
		<input type="text" name="ano" id="id-ano" class="form-control">
	</div>
	<div>
		<label for="id-placa">Placa</label>
		<input type="text" name="placa" id="id-placa" class="form-control">
	</div>
	<div>
		<label for="id-cor">Cor</label>
		<input type="text" name="cor" id="id-cor" class="form-control">
	</div>
	</br>
	<input type="submit" value="Cadastrar" class="btn btn-success">
	<input type="reset" value="Limpar" class="btn btn-dark">
	</form>
</tags:templete>