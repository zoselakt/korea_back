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
<h3>갤러리추가</h3>
	<form:form method="post">
		<label>${galleryinsert} </label>
		갤러리명: <form:input path="gallery_name"/>
		소유자명: <form:input path="resist_name"/>
		주소 : <form:input path="gallery_address"/>
		전화번호: <form:input path="gallery_phone"/>
		이메일: <form:input path="gallery_email"/>
		규모: <form:input path="gallery_area" placeholder="000 X 000 X 000"/>
		입장료: <form:input path="gallery_payment"/>
		층수: <form:input path="gallery_floor"/>
		기타사항: <form:input path="gallery_etc"/>
		<input type="submit" value="등록하기"/>
	</form:form>
</body>
</html>