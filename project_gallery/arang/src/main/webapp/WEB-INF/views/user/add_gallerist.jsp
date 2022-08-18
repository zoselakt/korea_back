<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>갤러리 등록</h3>
	<form action="add_gallerist" method="post">
		<label>이메일</label><input type="text" name="email" required="required"><br>
		<label>비밀번호</label><input type="password" name="passwd" required="required"><br>
		<label>성함</label><input type="text" name="name" required="required"><br>
		<label>사업주</label><input type="text" name="owner" required="required"><br>
		<label>사업자번호</label><input type="text" name="corporateNum" required="required"><br>
		<label>연락처</label><input type="text" name="corporatePhone" required="required"><br>
		<label>주민등록번호</label><input type="text" name="ssn" required="required"><br>
		<input type="submit" value="등록"/>
	</form>
</body>
</html>