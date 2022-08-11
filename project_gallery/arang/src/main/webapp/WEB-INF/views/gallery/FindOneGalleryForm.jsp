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
<h1>파일원</h1>
<!-- <c:if test="${AllView.gallery_name eq GalleryVo.gallery_name}"> -->
	<ul>
		<img src="/resources/img/img${galleryFindOne.gallery_code}.jpg">
		<li>갤러리 코드 : ${galleryFindOne.gallery_code}</li>
		<a href="#"><li>갤러리 이름 : ${galleryFindOne.gallery_name}</li></a><!-- 클릭하면 갤러리 홈페이지로 이동 -->
		<li>갤러리 소유자 : ${galleryFindOne.resist_name}</li>
		<li>갤러리 주소 : ${galleryFindOne.gallery_address}</li>
		<li>갤러리 전화번호 : ${galleryFindOne.gallery_phone}</li>
		<li>갤러리 이메일 : ${galleryFindOne.gallery_email}</li>
		<li>갤러리 큐모 : ${galleryFindOne.gallery_area}</li>
		<li>갤러리 금액 : ${galleryFindOne.gallery_payment}</li>
		<li>갤러리 층수 : ${galleryFindOne.gallery_floor}</li>
		<li>기타 : ${galleryFindOne.gallery_etc}</li>
	</ul>
<!--</c:if>-->
	<button type="button" onclick="gomain()">메인으로</button>
</body>
</html>