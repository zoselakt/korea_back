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
	<h2>기존메뉴확인</h2>
	<label>menu</label> : ${menu } / ${price }<br>
	<label>other</label> : ${other1} + ${other2} + ${other3}<br><br>
	
	<h2>메뉴를 다시 고르세요</h2>
	<form:form method="post" modelAttribute="MenuItem">
	
		<input type="text" name="midInput">
		
		<label>menu</label>
		<form:select path="menuItems">
			<form:options itemValue="itemPrice" itemLabel="itemName" items="${cafeItemList }"/>
		</form:select><br>
		
		<form:input path="menuItemCount"/>
		
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
		
		<input type="submit" value="주문수정"/>
	</form:form>
</body>
</html>