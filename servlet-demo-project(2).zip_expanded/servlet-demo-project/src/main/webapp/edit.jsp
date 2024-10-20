<%@page import="com.jsp.servlet_demo_project.dto.User"%>
<%@page import="com.jsp.servlet_demo_project.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int userId =Integer.parseInt(request.getParameter("id")) ;
		UserDao userDao = new UserDao();
		User user=userDao.getUserById(userId);
	%>

	<form action="myNewData">
	<input type="number" placeholder="UserName" name="myId" value="<%=user.getUserId()%>" hidden="true"><br>
	<label>UserName:</label><br>
	<input type="text" placeholder="UserName" name="myName" value="<%=user.getUserName()%>"><br>
	<label>UserEmail:</label><br>
	<input type="email" placeholder="UserEmail" name="myEmail" value="<%=user.getUserEmail()%>"><br>
	<label>UserPhone:</label><br>
	<input type="tel" placeholder="UserPhone" name="myPhone" value="<%=user.getUserPhone()%>"><br>
	<label>Gender:</label><br>
	<input type="radio" name="myGender"  value="Male" checked="<%if(user.getUserGender().equalsIgnoreCase("Male")){%>Checked<%}else{%>unchecked<%}%>">Male&nbsp;
	<input type="radio" name="myGender" value="Female" checked="<%if(user.getUserGender().equalsIgnoreCase("Female")){%>Checked<%}else{%>unchecked<%}%>">Female&nbsp;
	<input type="radio" name="myGender" value="Others" checked="<%if(user.getUserGender().equalsIgnoreCase("Others")){%>Checked<%}else{%>unchecked<%}%>">Others<br>
	<label>Address:</label><br>
	<input type="text" placeholder="UserAddress" name="myAddress" value="<%=user.getUserAddress()%>"><br>
	<input type="submit" value="Update">
</form>
</body>
</html>