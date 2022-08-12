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
function gomain() { location.href="mainForm"}
</script>
</head>
<body>
<form:form method="post" modelAttribute="noticeFindAll">
		<table>
			<tr>
				<th>공지 번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조횟수</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="noticeFindAll" items="${noticeFindAll}">
			<tr>
				<td>${noticeFindAll.num}</td>
				<td><a href="./FindOneNoticeForm?num=${noticeFindAll.num}">${noticeFindAll.title}</a></td>
				<td>${noticeFindAll.num}</td> 
				<td>${noticeFindAll.writer}</td>
				<td>${noticeFindAll.readCnt}</td>
				<td>${noticeFindAll.regDate}</td>
				<td><a href="./UpdateNoticeForm?num=${noticeFindAll.num}">글 수정</a></td>
				<td><a href="./DeleteNoticeForm?num=${noticeFindAll.num}">글 삭제</a></td>
			</tr>
			</c:forEach>
		</table>
	<button type="button" onclick="gomain()">메인으로</button>
</form:form>
</body>
</html>