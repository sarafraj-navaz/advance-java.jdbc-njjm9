<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.jsp.servlet_demo_project.dto.User"%>
<%@page import="java.util.List"%>
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
		UserDao userDao = new UserDao();
		List<User> users=userDao.displayAllUser();
	%>
	<table border="2">
		<tr>
			<th>UserId</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserPhone</th>
			<th>UserAddress</th>
			<th>UserGender</th>
			<th>Delete</th>
			<th>Edit</th>
			
		</tr>
		<%for(User user:users) {%>
		<tr>
			<td><%=user.getUserId() %></td>
			<td><%=user.getUserName() %></td>
			<td><%=user.getUserEmail() %></td>
			<td><%= user.getUserPhone()%></td>
			<td><%=user.getUserAddress() %></td>
			<td><%= user.getUserGender()%></td>
			<td><a href="delete?id=<%=user.getUserId()%>"><button style="color: red">Delete</button></a></td>
			<td><a href="edit.jsp?id=<%=user.getUserId()%>"><button style="color: yellow">Edit</button></a></td>
		</tr>
		<%}%>
	</table>
</body>
</html>