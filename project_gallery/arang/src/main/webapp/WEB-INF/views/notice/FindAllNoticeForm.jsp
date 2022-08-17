<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function gomain() { location.href="mainForm"}
function selChange() {
	   var sel = document.getElementById('pageCount').value;
	   location.href="FindAllNoticeForm?page=${noticeList.number}&pageCount="+sel;
	}
	</script>
	</head>
	<body>
	
	<div style="float: right;">
		<select id="pageCount" name="sel" onchange="selChange()">
			<option selected="selected">보기선택</option>
			<option value="5" 
				<c:if test="${noticeList.number == 5}"></c:if>>5줄 보기</option>
			<option value="10"
				<c:if test="${noticeList.number == 10}"></c:if>>10줄 보기</option>
			<option value="15"
				<c:if test="${noticeList.number == 15}"></c:if>>15줄 보기</option>
			<option value="20"
				<c:if test="${noticeList.number == 20}"></c:if>>20줄 보기</option>
		</select>
	</div> <!-- 옵션선택 끝 -->
	
	<table>
		<tr>
			<th>공지 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조횟수</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="noticeFindAll" items="${noticeList.content}">
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
	<!-- TEST -->
	<div class="text-xs-center">
		<ul class="pagination">
			<!-- 좌 -->
			<c:choose>
				<c:when test="${noticeList.first}"></c:when>
				<c:otherwise>
					<li><a href="<c:url value='/notice/FindAllNoticeForm?page=0'/>">처음</a></li>
					<li><a href="<c:url value='/notice/FindAllNoticeForm?page=${noticeList.number-1}'/>">&larr;</a></li>
				</c:otherwise>
			</c:choose>
			<!-- 페이지 그룹 -->
			<c:forEach begin="${startBlockPage}" end="${endBlockPage}" var="i">
				<c:choose>
					<c:when test="${noticeList.pageable.pageNumber+1 == i}">
						<li class="disabled"><a class="page-link" href="<c:url value='/notice/FindAllNoticeForm?page=${i-1}'/>">${i}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="<c:url value='/notice/FindAllNoticeForm?page=${i-1}'/>">${i}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<!-- 끝 -->
			<c:choose>
				<c:when test="${noticeList.last}"></c:when>
				<c:otherwise>
					<li><a href="<c:url value='/notice/FindAllNoticeForm?page=${noticeList.number+1}'/>">&rarr;</a></li>
					<li><a href="<c:url value='/notice/FindAllNoticeForm?page=${noticeList.totalPages-1}'/>">마지막</a></li>
				</c:otherwise>
			</c:choose>
			
		</ul>
	</div>
	
	<!-- TEST -->
	<button type="button" onclick="gomain()">메인으로</button>

</body>
</html>