<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<body bgcolor="skyblue">

<br><br><br><br><br>
<center>${msg}</center>
<center>
	<form action="loginServlet" method="post">
	<table><tr>
		<td>Enter UserName : <input type="text" name="userName" required="required"></td></tr> <br>
		<tr><td>Enter PassWord : <input type="password" name="passWord" required="required"></td></tr><br>
		</table>
		<input type="submit" value="LogIn">
	</form>
	<a href = "register.jsp"><input type="submit" value = "Register"></a>
	<a href = "forget.jsp"><input type="submit" value = "Forget"></a>
</center>
</body>
</html>