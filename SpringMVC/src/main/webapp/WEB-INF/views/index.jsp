<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage!!!!!!!!!!!</title>
</head>
<body>

<% 
	 String name = (String)request.getAttribute("name");
%>
<h1> This home page.............</h1>

<h1>Name is <%=name %></h1>

</body>
</html>