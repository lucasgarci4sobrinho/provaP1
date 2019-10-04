<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medico</title>
<link rel="stylesheet" type="text/css" href="medico.css" >

</head>
<body>
	<h1>Área do Médico</h1>
	<a id="cadastrar" href="index.jsp">Deslogar</a>
	
	<br></br>
	
	<form>
	<label for = "story"> Prontuário do paciente</label> 
	<p>
	
	<textarea id = "story" name = "story" rows="5" required="required"></textarea>
	
	
	</p>
	<input type="number" name="CPF" placeholder="Digite o CPF do paciente." />		
	<a href="medico.jsp"><button>Salvar</button></a>
	
</form>

</body>
</html>

