<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String nome = (String)session.getAttribute("nome");
	String opcoes = (String)session.getAttribute("opcoes");
	%>
	<%
	out.print ("nome:" + nome);
	out.print ("opções:" + opcoes);
	%>
</body>
</html>