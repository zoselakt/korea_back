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
<script type='text/javascript'> 
var cnt = ''; 
function upfileAdd() 
    eval('upfileAddArea' + cnt).innerHTML += "<input type='file' name='imgName' multiple size='60'><div id='upfileAddArea" + (cnt+1) + "'></div>"; 
    cnt++; 
</script> 
	<form:form method="post" modelAttribute="galleryCommand" enctype="multipart/form-data">
		<li> 한글 갤러리명: <form:input path="galleryName_kor" name="galleryName_kor"/><li><br>
		<li> 영문 갤러리명: <form:input path="galleryName_eng" name="galleryName_eng"/><li><br>
		<li> 소유자명: <form:input path="galleristName" name="galleristName"/><li><br>
		<li> 주소 : <form:input path="address" name="address"/><li><br>
		<li> 이메일: <form:input path="galleryEmail" name="galleryEmail"/><li><br>
		<li> 전화번호: <form:input path="galleryPhone" name="galleryPhone"/><li><br>
		<li> 규모: <form:input path="area" name="area" placeholder="000 X 000 X 000"/><li><br>
		<li> 입장료: <form:input path="payment" name="payment"/><li><br>		
		<li> 층수: <form:input path="galleryFloor" name="galleryFloor"/><li><br>
		<li> 사업자번호: <form:input path="corporateRegistrationNum" name="corporateRegistrationNum"/></li><br>
	
		<input type="file" name="imgPath" multiple/>
		&nbsp;<a href="javascript:upfileAdd();">추가</a> 
		<div id=upfileAddArea></div>
		<input type="submit" value="등록하기"/>		
	</form:form>
</body>
</html>