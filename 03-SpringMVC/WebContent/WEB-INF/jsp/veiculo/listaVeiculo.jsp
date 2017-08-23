<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:templete titulo="Lista de Veiculo">
	<h2>Lista de Veículos</h2>
	<table class="table">
		<tr>
			<th>Marca</th>
			<th>Modelo</th>
			<th>Ano</th>
			<th>Placa</th>
			<th>Cor</th>
		</tr>
		<c:forEach items="${veiculos }" var="v">
			<tr>
				<td>${v.marca}</td>
				<td>${v.modelo}</td>
				<td>${v.ano}</td>
				<td>${v.placa}</td>
				<td>${v.cor}</td>
			</tr>		
		</c:forEach>	
	</table>	
</tags:templete>
