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

<h2>주문삭제</h2>
	<form:form method="post">
		<h3>메뉴정보확인</h3>
		<label>menu</label> : ${MenuItem.menuItems} / ${MenuItem.menuItemCount } / ${MenuItem.menuPrice }<br>
		<label>other</label> : ${MenuItem.addOther1} + ${MenuItem.addOther2} + ${MenuItem.addOther3}<br>
		<br><br>
		<input type="text" value="삭제할 번호 입력" name="midDelete">
	 	<input type="submit" value="메뉴삭제"/><br>
	</form:form>
</body>
</html>