<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<tags:template titulo="Cadastro de Video Game">	
	<h1>Cadastro</h1>
		<form action="cadastrar" method="post">
			<div class="form-group">
				<label for="id-marca">Marca</label>
				<input type="text" name="marca" id="id-marca" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-modelo">Modelo</label>
				<input type="text" name="modelo" id="id-modelo" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-valor">Valor</label>
				<input type="number" name="marca" id="id-valor" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-travado">Travado</label>
				<input type="checkbox" name="travado" id="id-travado" class="form-control">
			</div>
			<input type="submit" value="Cadastrar" class="btn btn-primary">
		</form>
</tags:template>