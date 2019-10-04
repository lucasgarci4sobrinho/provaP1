<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" >
<meta charset="UTF-8">

</head>
<body>
	
		<h1>Hospital P1</h1>
		<a id="cadastrar" href="Cadastro.jsp">Cadastre-se aqui!</a>
		<fieldset id="frm-login">
			<legend>Entre aqui como Médico:</legend>
			<form action="Medico.jsp" method="post">
				<input type="text" name="login" placeholder="Digite seu login." />
				<input type="password" name="senha" placeholder="Digite sua senha." />
			<button>Entrar</button>
			</form>	
			
			
			<legend>Entre aqui como Secretaria:</legend>
			<form action="Secretaria.jsp" method="post">
				<input type="text" name="login 2" placeholder="Digite seu login." />
				<input type="password" name="senha 2" placeholder="Digite sua senha." />

			<b href="Secretaria.jsp"><button>Entrar</button></b>
			 
			</form>
		</fieldset>
</body>
</html>	