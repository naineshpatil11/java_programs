<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body align="center">
	<h1>Login Page</h1>
	<div class="bg">
	<form action="login" method="post">
		<table align="center">
			<tr>
				<td>Enter UserName<sup>*</sup></td>
				<td>:</td>
				<td><input type="text" name="uname"
					placeholder="max 5-20 characters"></td>
			</tr>
			<tr>
				<td>Enter Password<sup>*</sup></td>
				<td>:</td>
				<td><input type="password" name="password"
					placeholder="max 5-15 characters">
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><input type="submit" value="login">
			</tr>
		</table>
		
	</form>
	
	<a href="Registration.jsp" align="center"><input type="submit"
			value="New User Register here??"></a>
			
			 <a href="ForgotPassword.jsp" align="center"><input type="submit"
			value="ForgotPassword"></a>
			</div>
</body>
<style type="text/css">
table {
	color: green
}

sup {
	color: red
}

h1 {
	color: black
}
body {
  background-color: lightblue;
}
</style>
</html>