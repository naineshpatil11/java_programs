<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

< align="center">
		<form action="register" method="post" onsubmit="return validation();">
			<table align="center" border="1">
				<tr>
					<td colspan="2" align="center"><b>User Registration</b></td>
				</tr>
				<tr>
					<td>Username* :</td>
					<td><input type="text" name="username" required></td>
				</tr>
				<tr>
					<td>Password* :</td>
					<td><input type="password" name="password" required></td>
				</tr>
				
				<tr>
					<td>First Name* :</td>
					<td><input type="text" name="firstName" required></td>
				</tr>
				<tr>
					<td>Last Name* :</td>
					<td><input type="text" name="lastName" required></td>
				</tr>
				<tr>
					<td>Date of Birth* :</td>
					<td><input type="date" name="dob" required></td>
				</tr>
				<tr>
					<td>Mobile Number :</td>
					<td><input type="number" name="phoneNo"></td>
				</tr>
				<tr>
					<td>Email Id :</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="Register User"></td>
					<td align="center"><input type="reset" name="Reset"></td>
				</tr>
			</table>
		</form>
<div name = "eresult" style="col"></div>
function validation()
{
	var name = document.getElementByName("username").value;
	if(username.length < 2)
	{
		document.getElementByName("eresult").innerHTML="Name must be at least 2 charecter";
		return false;		
	}
}
</body>
</html>