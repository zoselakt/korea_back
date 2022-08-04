<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function gomain() {	location.href="mainForm"; }
</script>
</head>
<body>
	<h3>선택 메뉴 상세조회</h3>
	<ul>
		<li>mid : ${MenuItem.mid}</li>
		<li>메뉴아이템 : ${MenuItem.menuItems}</li>
		<li>추가 요구사항 : ${MenuItem.addOther1}</li>
		<li>추가 요구사항 : ${MenuItem.addOther2}</li>
		<li>추가 요구사항 : ${MenuItem.addOther3}</li>
		<li>가격 : ${MenuItem.menuPrice}</li>
		<li>주문 수량 : ${MenuItem.menuItemCount}</li>
	</ul>
	<button type="button" onclick="gomain()">확인</button>
</body>
</html>