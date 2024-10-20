<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addProduct" method="post" enctype="multipart/form-data">
		
		<label>Product Name : </label>
		<input type="text" name="productName" placeholder="Product Name"><br><br>
		
		<label>Product Type : </label>
		<select name="productType">
			<option value="pant">Pant</option>
			<option value="shirt">Shirt</option>
			<option value="jeans">Jeans</option>
			<option value="shoes">Shoes</option>
		</select><br><br>
		
		<label>Product Price</label>
		<input type="number" name="productPrice" placeholder="Product Price"><br><br>
		
		<label>ProductWearType : </label>
		<select name="productWearType" >
			<option value="men">Men</option>
			<option value="women">Women</option>
			<option value="Kids">Kids</option>
		</select><br><br>
		
		<label>User Photo : </label>
		<input type="file" name="photo" size="500"/><br><br>
		
		<input type="submit" value="ADD PRODUCT">
	</form>
</body>
</html>