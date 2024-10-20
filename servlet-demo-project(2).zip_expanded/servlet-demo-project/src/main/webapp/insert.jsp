<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi Noida....Welcome to Delhi Safari</h1>

<form action="myData">
	<label>UserName:</label><br>
	<input type="text" placeholder="UserName" name="myName"><br>
	<label>UserEmail:</label><br>
	<input type="email" placeholder="UserEmail" name="myEmail"><br>
	<label>UserPhone:</label><br>
	<input type="tel" placeholder="UserPhone" name="myPhone"><br>
	<label>Gender:</label><br>
	<input type="radio" name="myGender" value="Male">Male&nbsp;
	<input type="radio" name="myGender" value="Female">Female&nbsp;
	<input type="radio" name="myGender" value="Others">Others<br>
	<label>Address:</label><br>
	<select name="myAddress">
		<option>NOIDA</option>
		<option>DELHI</option>
		<option>MUMBAI</option>
		<option>BENGALURU</option>
	</select><br>
	<input type="submit" value="submit">
</form>
</body>
</html>