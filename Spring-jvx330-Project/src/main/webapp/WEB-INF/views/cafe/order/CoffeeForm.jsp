<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/resources/css/CoffeeForm.css'/>"/>

<script type="text/javascript">
	function goPayPage() {	location.href="../commonPaymentForm" }
	function goMenu() { location.href="../menuMainForm" }
</script>

</head>
<body>
	<div id="menu">
		<h1> 커피 선택</h1>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="espresso">에스프레소<span>hot: 1500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="americano">아메리카노<span>hot: 1500원 / ice: 2000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="cafelatte">카페라떼<span>hot: 2000원 / ice: 2500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="cafemoca">카페모카<span>hot: 2000원 / ice: 2500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="caramel">카라멜마끼아또<span>hot: 2500원 / ice: 3000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="einspanner">아인슈페너<span>hot: 3000원 / ice: 3500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="coldBrew">콜드브루<span> ice: 3000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="coldBrewlatte">콜드브루 라떼<span>hot: 2500원 / ice: 3000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="affogato">아포가또<span>hot: 2500원 / ice: 3000원</span></button></div>
		</div>
		
		<form method="post" id="payForm">
			<span>
				<span>비동기식으로 메뉴클릭시 여기에 담긴다.</span>
				<span>메뉴2</span>
				<span>메뉴3</span>
				<span>메뉴4</span>
				<span>메뉴5</span>
			</span>
			<span>
			<select>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
			</select>
			&nbsp; 개
			</span>
			<button type="button" class="Pay" onclick="goPayPage">결제</button>
			<input type="submit" value="장바구니 담기"/>
		</form>
		<button type="button" class="home" onclick="goMenu()">홈으로</button>
	</div>
</body>
</html>