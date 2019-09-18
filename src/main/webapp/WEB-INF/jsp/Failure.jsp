<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body
{
text-align:center;
padding:20px;
}
input[type=text],input[type=password]
{
padding:10px;
}
input[type=submit]
{
color:white;
background-color:green;
padding:10px;
}
</style>
<title></title>
</head>
<body>
<h1>Login Page</h1>
<form action="login">
<h1 style="color:red">${error }</h1><br>
UserName:<input type="text" name="username"/><br>
Password:<input type="text" name="password"/><br>
<input type="submit" value="Login">
<a href="register">New user?</a>
</form>
</body>
</html>