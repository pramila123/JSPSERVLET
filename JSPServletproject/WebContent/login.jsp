<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue">Login Page</h1><hr>
<p style="color:red">${msg } </p>
<form action="userlogin" method="post">
UserName <input type="text" name="username"><br><br>
Password <input type="password" name="password"><br><br>
<input type="submit" value="submit">
</form>
<a href="signupuser">SignUp</a>
</body>
</html>