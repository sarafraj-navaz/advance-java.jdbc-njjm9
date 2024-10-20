<%@page import="java.util.List"%>
<%@page import="com.jsp.jcart_web_app.dao.OwnerDao"%>
<%@page import="com.jsp.jcart_web_app.dto.Owner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Unverified-owner-details</h3>
	<a href="verify-owner.jsp"><button>Verified-Owner</button></a>
	<%
		OwnerDao dao = new OwnerDao();
		List<Owner> owners = dao.displayAllOwner();
	%>
	
	<table border='2px'>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Status</th>
			<th>Verify Now</th>
		</tr>
		
		<%
			for(Owner owner : owners) {
			if(owner.getVerify().equals("no")){
		
		%>
		
		<tr>
			<td><%=owner.getOwnerId() %></td>				
			<td><%=owner.getOwnerName() %></td>				
			<td><%=owner.getOwnerEmail() %></td>				
			<td><%=owner.getOwnerPhone() %></td>				
			<td><%=owner.getVerify() %></td>
			<td><a href="verify?ownerId=<%=owner.getOwnerId() %>"><button>Verify Now</button></a></td>						
		</tr>
		<%} } %>
	</table>
</body>
</html>