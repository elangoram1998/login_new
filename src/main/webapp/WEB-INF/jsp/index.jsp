<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<head>
<style>
body
{
text-align:center;
padding:20px;
}
input[type=submit]
{
color:white;
background-color:green;
padding:10px;
}
</style>
</head>
<h1>Login Page</h1>
<form action="login">
<input type="text" name="username"/><br>
<input type="text" name="password"/><br>
<input type="submit" value="Login">
<a href="register">New user?</a>
</form>
</body>
</html>
