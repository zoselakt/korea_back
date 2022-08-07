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
		<h1> 디저트 선택</h1>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="banila">바닐라크렘브뤨레 <span>5500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="royal">로얄밀크티쉬폰 <span>5500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="caramel">더치솔티드카라멜<span>6000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="cheeze">카망베르치즈<span>6000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="coffee">커피생크림<span>5500원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="strew">딸기생크림<span>6000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="milky">밀키베리하트<span>5000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="melt">멜팅 가나슈<span>6000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="tart">스트로베리요거타르트<span>6000원</span></button></div>
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