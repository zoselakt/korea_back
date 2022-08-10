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
<form:form method="post">
	<c:forEach var="AllView" items="${galleryFindAll}">
		<ul>
			<a href="./FindOneGalleryForm?gallery_code=${AllView.gallery_code}"><li>갤러리 이름 : ${AllView.gallery_name}</li></a><!-- 선택하면 특정갤러리 조회페이지로 이동 -->
			<li>갤러리 주소 : ${AllView.gallery_address}</li>
			<li>갤러리 전화번호 : ${AllView.gallery_phone}</li>
			<li>갤러리 이메일 : ${AllView.gallery_email}</li>
			<li>갤러리 큐모 : ${AllView.gallery_area}</li>
			<li>갤러리 금액 : ${AllView.gallery_payment}</li>
			<li>갤러리 층수 : ${AllView.gallery_floor}</li>
			<li>기타 : ${AllView.gallery_etc}</li>
		</ul>
	</c:forEach>
	<input type="submit" value="확인">
</form:form>

<button type="button" onclick="gomain()">메인으로</button>
</body>
</html>