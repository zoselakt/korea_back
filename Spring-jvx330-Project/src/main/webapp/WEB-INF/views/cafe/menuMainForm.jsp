<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="<c:url value='/resources/css/menuMainForm.css'/>"/>
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>

	<script type="text/javascript"> function gomain() { location.href="mainForm";	} </script>
    <script type="text/javascript" src="<c:url value='/js/jquery.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/common.js'/>"></script>
</head>

<body>
	<header id="header">
		<nav class="gnb">
			<div id="top-gnb">
				<div class="menu">
					<ul>
						<h1>메뉴선택</h1> <button type="button" onclick="gomain()">메인메뉴</button><hr>
						<li class="menuli"><a href="./order/CoffeeForm">커피 & 에스프레소<span>Coffee & Espresso</span></a></li>
						<li class="menuli"><a href="./order/BreadForm">빵<span>Bread</span></a></li>
						<li class="menuli"><a href="./order/BlendForm">블랜드<span>Blend</span></a></li>
						<li class="menuli"><a href="./order/MojitoForm">모히또<span>Mojito</span></a></li>
						<li class="menuli"><a href="./order/JuiceForm">생과일 음료<span>Fruit Juice</span></a></li>
						<li class="menuli"><a href="./order/DessertForm">디저트<span>Dessert</span></a></li>
						<li class="menuli"><a href="./order/TeeForm">티<span>Tee</span></a></li>
						<li class="menuli"><a href="./order/FrappuForm">프라푸치노<span>Frappuccino</span></a></li>
						<li class="menuli"><a href="./order/SmoothieForm">스무디<span>smoothies</span></a></li>
					</ul>
				</div>
			</div>
			<div id="addvertise-wrap">
				<div class="addvertise">
					<a>광고</a>
				</div>
			</div>
		</nav>
	</header>
</body>
</html>