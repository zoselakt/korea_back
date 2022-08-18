<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post">
	<c:forEach var="galleryFindAll" items="${galleryFindAll}" varStatus="status">
		<ul>
			<!-- 선택하면 특정갤러리 조회페이지로 이동 -->
			<a href="./FindOneGalleryForm?code=${galleryFindAll.code}">
			<li>갤러리 이름 : ${galleryFindAll.galleryName_kor}</li>
			</a>
			<li>갤러리 소유자 : ${galleryFindAll.galleristName}</li>
			<li>갤러리 주소 : ${galleryFindAll.address}</li>
			<li>갤러리 이메일 : ${galleryFindAll.galleryEmail}</li>
			<li>갤러리 전화번호 : ${galleryFindAll.galleryPhone}</li>
			<li>갤러리 규모 : ${galleryFindAll.area}</li>			
			<li>갤러리 층수 : ${galleryFindAll.galleryFloor}</li>
			<li>협력사코드 : ${galleryFindAll.corporateRegistrationNum}</li>
		<c:forTokens var="img" items="${galleryFindAll.imgPath}" delims=";">
			<li>이미지 : ${img}</li>
		</c:forTokens>
		</ul>
	</c:forEach>
	<input type="submit" value="확인">
</form:form>
</body>
</html>