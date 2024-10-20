<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Sign In Here!</h2>
	<form action="userLogin" method="post">
		<fieldset>
			<input type="email" name="userEmail" placeholder="UserEmail"><br>
			<input type="password" name="userPassword" placeholder=""><br>
			<select>
				<option value="userLogin">UserLogin</option>
				<option value="ownerLogin">OwnerLogin</option>
				<option value="adminLogin">AdminLogin</option>
			</select>
			<input type="submit" value="Signin">
			<button href="user-register">SignUp</button>
		</fieldset>
	</form>

</body>
</html>