<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		box-sizing: borderbox;
		margin: 0;
		padding: 0;
	}
	/*body{
		display: flex;
		justify-content: center;
		align-items: center;
	}*/
	
</style>
</head>

<body>
	<h3>User-Register Area</h3>

	<%
		String msgPass =(String) request.getAttribute("passwordMessage");
	%>
	<%if(msgPass != null){%>
		<h4 style="color: red"><%= msgPass %></h4>
	<% }%>
	<div>
	<form action="userRegister" method="post">
		<fieldset>
			<input type="name" name="userName" placeholder="UserName">
			<br>
			<input type="email" name="userEmail" placeholder="UserEmail">
			<br>
			<input type="password" name="userPassword" placeholder="userPassword">
			<br>
			<input type="tel" name="userPhone" placeholder="UserPhone">
			<br>
			<input type="text" name="userAddress" placeholder="UserAddress">
			<br>
			<input type="submit" value="Signup">
		</fieldset>
	</form>
	</div>
</body>
</html>