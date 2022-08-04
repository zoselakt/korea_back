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
	<label>menu</label> : ${MenuItem.menuItems} / ${MenuItem.menuItemCount } / ${MenuItem.menuPrice }<br>
	<label>other</label> : ${MenuItem.addOther1} + ${MenuItem.addOther2} + ${MenuItem.addOther3}<br>
	
	<h2>메뉴를 다시 고르세요</h2>
	<form:form method="post">
		수정할 번호 입력 : <input type="text" name="midInput"><br><br>
		<label>menu</label><br>
		
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
		
		<input type="submit" value="주문수정"/>
	</form:form>
</body>
</html>