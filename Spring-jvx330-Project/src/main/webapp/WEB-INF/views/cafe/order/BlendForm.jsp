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
		<h1> 블랜드 선택 (only iced)</h1>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="summer">쿨 서머 캐모마일 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="passion">망고 패션 프루트 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="straw">딸기 딜라이트 요거트 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="red">레드 파워 스매시 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="mango">망고 바나나 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="mint">민트 초콜릿 칩 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="green">제주 그린 한라봉 모히또 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="lemon">피치 & 레몬 블렌디드<span>4000원</span></button></div>
		</div>
		<div class="menuItem">
			<div class="menuImg"><img src=""></div>
			<div><button type="button" class="asahi"> 딸기 아사이 레모네이드 스타벅스 리프레셔 <span>4000원</span></button></div>
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