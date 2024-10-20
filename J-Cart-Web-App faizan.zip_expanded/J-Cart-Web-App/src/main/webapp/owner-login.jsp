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
		String incEmail = (String)request.getAttribute("incorrectOwnerEmail");
		String incPass = (String)request.getAttribute("incorrectOwnerPass");
		String unverifyMsg = (String)request.getAttribute("unverify");
	%>
	
	<marquee><h3><i>Welcome to Owner Login</i></h3></marquee>
	
	<%if(incEmail != null){%>
		<span style="color:red"><%=incEmail %></span>
	<%} %>
	<%if(incPass != null){%>
		<span style="color:red"><%=incPass %></span>
	<%} %>
	<%if(unverifyMsg != null){ %>
		<span style="color:red"><%=unverifyMsg %></span>
	<%} %>
	<div>
		<jsp:include page="back-home.jsp"></jsp:include><br><br>
		<form action="ownerLogin" method="post">
			<label>Owner Email</label>
			<input type="email" name="ownerEmail" placeholder="Owner Email">
			<br>
			<label>Owner Password</label>
			<input type="password" name="ownerPassword" placeholder="Owner Password"><br>
			
			<input type="submit" value="Login"><br>
		</form>
			<a href="owner-register.jsp"><button>SignUp</button></a>
	</div>
</body>
</html>