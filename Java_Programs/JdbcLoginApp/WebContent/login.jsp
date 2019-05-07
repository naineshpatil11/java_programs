<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="login" method="post">
	<h2>Login Page</h2>
	<table>
	<tr><td>User Name <input type="text" name="username"></td><br></tr>
	<tr><td>Password <input type="password" name="password"></td></tr>
	</table>
	
	<input type="submit" value="LOGIN">
	</form>
	
	<a href="forgot.jsp"> <input type="submit" value="FORGOT PASSWORD">  </a>
</center>
</body>
</html>