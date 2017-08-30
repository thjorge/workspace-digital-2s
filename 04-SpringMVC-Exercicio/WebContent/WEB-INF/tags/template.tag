<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="titulo" required="true" %>
<%@attribute name="script" fragment="true" %>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${titulo }</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
	<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</head>
<body>	
	<div class="container">	
		<jsp:doBody/>
	</div>
	<p style="text-align: center;">Todos os Direitos Reservados &copy; - 2017</p>
</body>
</html>