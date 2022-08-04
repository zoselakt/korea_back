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
	<h3>메뉴추가</h3>
	<form:form method="post" modelAttribute="MenuItem">
		<label>menu</label>
		
		<form:select path="menuItems">
			메뉴선택 : <form:options items="${itemName}"/>
		</form:select>
		<form:input path="menuItemCount"/>
		<br><br>
		
		<label>other</label>
		<form:select path="addOther1">
			<form:options items="${otherList }"/>
		</form:select> / 
		<form:select path="addOther2">
			<form:options items="${otherList }"/>
		</form:select> / 
		<form:select path="addOther3">
			<form:options items="${otherList }"/>
		</form:select><br><br>
		
		<input type="submit" value="주문하기"/>
		
		<h3>등록한 모든 메뉴 조회</h3>
	<c:forEach var="view" items="${itemList}">
		<li>=========================</li>
		<li>mid : ${view.mid}</li>
		<li>메뉴아이템 : ${view.menuItems}</li>
		<li>추가 요구사항 : ${view.addOther1}</li>
		<li>추가 요구사항 : ${view.addOther2}</li>
		<li>추가 요구사항 : ${view.addOther3}</li>
		<li>가격 : ${view.menuPrice}</li>
		<li>주문 수량 : ${view.menuItemCount}</li>
	</c:forEach>
		
	</form:form>
</body>
</html>