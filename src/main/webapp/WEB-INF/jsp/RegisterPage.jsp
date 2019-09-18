<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body
{
text-align:center;
padding:20px;
}
input[type=text],input[type=email]
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
</head>
<body>
<h1>Registration Page</h1>
<form:form action="savedata">
FirstName:<form:input path="firstName"/><br><br>
LastName:<form:input path="lastName"/><br><br>
EmailID:<form:input type="email" path="emailId"/><br><br>
UserID:<form:input path="userId"/><br><br>
Password:<form:input path="password"/><br><br>
<input type="submit" value="Register">
</form:form>
</body>
</html>