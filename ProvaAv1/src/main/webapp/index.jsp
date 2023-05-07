<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>
		Olá seja bem vindo ao sistema:!
	</h1>
	<div>
		Por favor preencha com atenção.
	</div>
	<br>
	<form method="post" action="/Prova/RequisicaoDogApi">
		<label>nome do cachoro:</label>
		<input type="text" id="nomeCachorro" name="nomeCachorro"><br><br>
		<label>nome do responsável:</label>
		<input type="text" id="nomeResponsavel" name="nomeResponsavel"><br><br>
		<label>escolha uma das raças:</label>
		<input list="racas" name="raca" id="raca">
		<datalist id="racas">
			<option value="pug">
			<option value="pitbull">
			<option value="poodle">
			<option value="shihtzu">
			<option value="beagle">
			<option value="borzoi">
		</datalist>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>