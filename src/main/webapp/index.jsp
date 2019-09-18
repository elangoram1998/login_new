<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<style>
body
{
padding:20px;
background-repeat: no-repeat;
background-size:1350px 560px;
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
div {
  background-color: lightgrey;
  width: 500px;
  padding: 50px;
  margin-left: 300px;
  text-align:center;

}
</style>
</head>
<body background="https://www.incimages.com/uploaded_files/image/970x450/getty_470013530_381053.jpg"> 
<div>
<h1>Welcome to my website</h1>
<form action="login">
UserName:<input type="text" name="username"/><br><br>
Password:<input type="password" name="password"/><br><br>
<input type="submit" value="Login"><br><br>
New user? <a href="register">click here to register</a>
</form>
</div>
</body>
</html>
