<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is help page</title>
</head>
<body>
<h1>Help page </h1>
<% String name = (String)request.getAttribute("name"); %>

<h1>Hello my name is ${name }

 
 </h1>
</body>
</html>