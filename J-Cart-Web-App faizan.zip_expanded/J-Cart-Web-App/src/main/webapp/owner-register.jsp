<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String msgPass = (String)request.getAttribute("passwordMessage");
	%>
	<%if(msgPass != null){ %>
		<h2 style="color: red"><%=msgPass %></h2>
	<%} %>
	
	<h3>Welcome to owner Register area</h3>
	<div>
		<form action="ownerRegister" method="post">
		<fieldset>
			<input type="name" name="ownerName" placeholder="OwnerName">
			<br>
			<input type="email" name="ownerEmail" placeholder="OwnerEmail">
			<br>
			<input type="password" name="ownerPassword" placeholder="OwnerPassword">
			<br>
			<input type="tel" name="ownerPhone" placeholder="OwnerPhone">
			<br>
			<input type="submit" value="Signup">
		</fieldset>
	</form>
	</div>
</body>
</html>