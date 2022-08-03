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
<h3>메뉴정보확인</h3>
	<label>menu</label> : ${menu } / ${price }<br>
	<label>other</label> : ${other1} + ${other2} + ${other3}<br><br>

<h2>주문삭제</h2>
	<form:form method="post" modelAttribute="MenuItem">
		<input type="text" value="삭제할 번호" name="delete">
		
	 <input type="submit" value="메뉴삭제"/>
	</form:form>
</body>
</html>