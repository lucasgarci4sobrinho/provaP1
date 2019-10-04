<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="secretaria.css" >

<title>Bem Vindo!</title>
</head>
<body>
	
	<header>
     <h1>Bem vinda Secretaria(o)!</h1>
    </header>
   
    <fieldset>
    <header>
     <h2>Cadastro do Paciente</h2>
    </header>
    
		<form action="Paciente" method="get">
		<input type="text" name="Nome" placeholder="Digite o Nome" required/>
		<input type="number" name="Idade" placeholder="Digite Idade" required/>
		<input type="number" name="Telefone" placeholder="Digite o Telefone" required/>
		<input type="number" name="CPF" placeholder="Digite o CPF" required/>
		
		<select>
             <option value="sexo">Masculino</option>
             <option value="sexo">Femenino</option>
                 
             </select>
		
		
		<header>
          <h3>Agendar data do Paciente</h3>
   		</header>
		
		<div class="Dia">
   		<select>
	      <option>01</option>
	      <option>02</option>
	      <option>03</option>
	      <option>04</option>
	      <option>05</option>
	      <option>06</option>
	      <option>07</option>
	      <option>08</option>
	      <option>09</option>
	      <option>10</option>
	      <option>11</option>
	      <option>12</option>
	      <option>13</option>
	      <option>14</option>
	      <option>15</option>
	      <option>16</option>
	      <option>17</option>
	      <option>18</option>
	      <option>19</option>
	      <option>20</option>
	      <option>21</option>
	      <option>22</option>
	      <option>23</option>
	      <option>24</option>
	      <option>25</option>
	      <option>26</option>
	      <option>27</option>
	      <option>28</option>
	      <option>29</option>
	      <option>30</option>
	      <option>31</option>
	      
	     
   		</select>
		</div>
		
		
		<div class="Mes">
   		<select>
	      <option>01</option>
	      <option>02</option>
	      <option>03</option>
	      <option>04</option>
	      <option>05</option>
	      <option>06</option>
	      <option>07</option>
	      <option>08</option>
	      <option>09</option>
	      <option>10</option>
	      <option>11</option>
	      <option>12</option>
	   	</select>
		</div>

		<div class="Ano">
   		<select>
	      <option>2019</option>
	      <option>2020</option>
	     
   		</select>
		</div>
		
		
		
	
		<button>Salvar</button>
		</form>
</fieldset>

</body>
</html>



