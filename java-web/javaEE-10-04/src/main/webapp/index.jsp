<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="pesquisa">
		<label>nome:</label><br>
		<input type="text" id="nome" name="nome"><br><br>
		<input type="checkbox" id="opcao" name="opcao" value ="rock">
		<label for="opcao">gênero rock</label><br>
		<input type="checkbox" id="opcao" name="opcao" value ="funk">
		<label for="opcao">gênero funk</label><br>
		<input type="checkbox" id="opcao" name="opcao" value ="sertanejo">
		<label for="opcao">gênero sertanejo</label><br>
		<input type="checkbox" id="opcao" name="opcao" value ="pop">
		<label for="opcao">gênero pop</label><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>