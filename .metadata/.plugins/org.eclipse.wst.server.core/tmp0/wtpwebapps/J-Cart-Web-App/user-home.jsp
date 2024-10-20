<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h3>Welcome to User Profile</h3>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">J-Cart</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Dropdown </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div id="carouselExampleControls" class="carousel slide"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block w-100" height="200px"
					src="https://layout.naptol.com/usr/local/csp/staticContent/naaptolAds/Mens-collection-01.jpg"
					alt="First slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" height="200px"
					src="https://layout.naptol.com/usr/local/csp/staticContent/naaptolAds/Mens-collection-01.jpg"
					alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" height="200px"
					src="https://img.etimg.com/thumb/width-1200,height-900,imgsize-26046,resizemode-75,msid-100623363/news/how-to/how-to-choose-safe-kids-wear-tips-for-avoiding-harmful-materials-and-chemicals.jpg"
					alt="Third slide">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleControls"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleControls"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<br>

	<%
	ProductDao productDao = new ProductDao();
	List<Product> products = productDao.getAllProductData();
	%>
	<section style="display: flex; gap: 10px; flex-wrap: wrap; justify-content: center;">

		<%
		for (Product product : products) {
		%>

		<div class="card" style="width: 18rem; ">
			<img class="card-img-top"
				src="https://akm-img-a-in.tosshub.com/indiatoday/images/story/202310/virat-kohli-19284955-16x9_0.jpg?VersionId=XS09du5.tUswzQkGV2aRueiXeai14fd6&size=690:388"
				alt="Card image cap">
			<div class="card-body">
				<h3>price=<del><%=product.getProductPrice()%></del></h3>
				<h3>35% OFF</del></h3>
				<h3>final-price=<%=product.getProductPrice()*0.65%></h3>
			</div>
			<div class="card-body">
				<a href="order-form.jsp?productid=<%=product.getProductId()%>" class="card-link">OrderNow</a> <a href="#"
					class="card-link">AddToCart</a>
			</div>
		</div>

		<%
		}
		%>
	</section>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>