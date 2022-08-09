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
<h3>갤러리수정</h3>
	<form:form method="post" modelAttribute="GalleryVo">
		수정할 갤러리 코드 입력 : <input type="text" name="gallery_code"><br><br>
		갤러리명: <form:input path="gallery_name" name="gallery_name"/><br>
		소유자명: <form:input path="resist_name" name="resist_name"/><br>
		주소 : <form:input path="gallery_address" name="gallery_address"/><br>
		전화번호: <form:input path="gallery_phone" name="gallery_phone"/><br>
		이메일: <form:input path="gallery_email" name="gallery_email"/><br>
		규모: <form:input path="gallery_area" name="gallery_area" placeholder="000 X 000 X 000"/><br>
		입장료: <form:input path="gallery_payment" name="gallery_payment"/><br>
		층수: <form:input path="gallery_floor" name="gallery_floor"/><br>
		기타사항: <form:input path="gallery_etc" name="gallery_etc"/><br>
		<input type="submit" value="등록하기"/>
	</form:form>
</body>
</html>