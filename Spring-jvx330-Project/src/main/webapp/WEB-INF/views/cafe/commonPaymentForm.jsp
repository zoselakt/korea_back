<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="success/success_pay_menu">
	<h3>메뉴 확인</h3>
	<c:forEach var="pay" items="${itemList}">
		<li>=========================</li>
		<li>mid : ${view.mid}</li>
		<li>메뉴아이템 : ${view.menuItems}</li>
		<li>추가 요구사항 : ${view.addOther1}</li>
		<li>추가 요구사항 : ${view.addOther2}</li>
		<li>추가 요구사항 : ${view.addOther3}</li>
		<li>가격 : ${view.menuPrice}</li>
		<li>주문 수량 : ${view.menuItemCount}</li>
	</c:forEach>
	<input type="submit" value="주문하기">
</form>
</body>
</html>