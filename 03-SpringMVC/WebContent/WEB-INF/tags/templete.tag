<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="titulo" required="true" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${titulo }</title>
<link rel="stylesheet" type="text/css" 
		href="<c:url value="/resources/css/bootstrap.min.css"/>">
<script type="text/javascript" 
		src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" 
		src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand">Spring MVC</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="cadastrar">Cadastrar <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="listar">Listar</a>
      </li>      
    </ul> 
    </div>
</nav>
<body>
	<div class="container">	
		<jsp:doBody/>
		<p>Todos os Direitos Resvados &copy; - 2017</p>
	</div>	
</body>
</html>
