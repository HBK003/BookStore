<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
User Register
<br>
<form action="register">
	E-mail : <input type="email" name = "email"><br>
	Password : <input type="password" name = "password"> <br>
	<input type = "submit" value  ="Register">
</form>
User Login
<br>
<form action="login">
	E-mail : <input type="email" name = "email"><br>
	Password : <input type="password" name = "password"> <br>
	<input type = "submit" value  ="Login">
</form>

Admin Login
<br>
<form action="admin">
	<input type = "submit" value  ="Admin">
</form>
</body>
</html>