<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Verified Product Details</h3>
	<h4>See <a href="unverified-product.jsp"><button>Un-verified</button></a> product details here</h4>
	
	<%
		ProductDao dao = new ProductDao();
		List<Product> products = dao.displayAllProduct();
	%>
	
	<table border='2px'>
		<tr>
			<th>Product-Id</th>
			<th>Product-Name</th>
			<th>Product-Type</th>
			<th>Product-WearType</th>
			<th>Product-Price</th>			
			<th>Verification-Status</th>			
			<th>Verify-Product</th>
		</tr>
		
		<%
			for(Product product : products){
				if(product.getProductVerify().equals("yes")){
				
		%>
		
		<tr>
			<td><%=product.getProductId() %></td>
			<td><%=product.getProductName() %></td>
			<td><%=product.getProducttype() %></td>
			<td><%=product.getProductWearType() %></td>
			<td><%=product.getProductPrice() %></td>
			<td><%=product.getProductVerify() %></td>
			<td><a href="unverifyProduct?productId=<%=product.getProductId()%>"><button>Unverify Now</button></a></td>
		</tr>
		
		<%}} %>
		
	</table>
</body>
</html>