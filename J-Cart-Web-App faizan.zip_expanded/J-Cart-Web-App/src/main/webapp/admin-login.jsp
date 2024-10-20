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
		String incEmail = (String)request.getAttribute("incorrectAdminEmail");
		String incPass = (String)request.getAttribute("incorrectAdminPass");
	%>
	
	<marquee><h3><i>Welcome to Admin login page</i></h3></marquee>
	<%if(incEmail != null){%>
		<span style="color:red"><%=incEmail %></span>
	<%} %>
	<%if(incPass != null){%>
		<span style="color:red"><%=incPass %></span>
	<%} %>
	<jsp:include page="back-home.jsp"></jsp:include><br><br>
	<form action="adminLogin" method="post">
		<label>AdminEmail:</label>
		<input type="email" name="adminEmail" placeholder="AdminEmail"><br>
		<label>AdminPassword:</label>
		<input type="password" name="adminPassword" placeholder="AdminPassword"><br>
		
		<input type="submit" value="Login">
		
	</form>
</body>
</html>