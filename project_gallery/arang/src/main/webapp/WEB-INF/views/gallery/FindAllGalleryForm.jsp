<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function gomain() {	location.href = "mainForm";}
</script>
</head>
<body>
	<ul>
		<li>갤러리 코드 : ${GalleryVo.gallery_code}</li>
		<li>갤러리 이름 : ${GalleryVo.gallery_name}</li>
		<li>갤러리 소유자 : ${GalleryVo.resist_name}</li>
		<li>갤러리 주소 : ${GalleryVo.gallery_address}</li>
		<li>갤러리 전화번호 : ${GalleryVo.gallery_phone}</li>
		<li>갤러리 이메일 : ${GalleryVo.gallery_email}</li>
		<li>갤러리 큐모 : ${GalleryVo.gallery_area}</li>
		<li>갤러리 금액 : ${GalleryVo.gallery_payment}</li>
		<li>갤러리 층수 : ${GalleryVo.gallery_floor}</li>
		<li>기타 : ${GalleryVo.gallery_etc}</li>
	</ul>
	<button type="button" onclick="gomain()">메인으로</button>
</body>
</html>