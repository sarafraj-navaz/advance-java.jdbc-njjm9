<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%for(int i=0;i<=10;i++){ %>
		<%if(i%2==0){ %>
		
		<h4>i = <%=i%></h4>
		
	<%}}%> --%>
	
	<%!public int m1(int a){
		
		return a;
	}%>
	
	<h1><%= m1(30)%></h1>
	
	
</body>
</html>