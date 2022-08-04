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
	function goAddMenu() { location.href="AddMenuForm";	}
	function goUpMenu() { location.href="UpdateMenuForm";	}
	function goDelMenu() { location.href="DeleteMenuForm";	}
</script>
</head>
<body>
<h2>메인 페이지입니다.</h2>
<form:form method="post">
	<h3>주문하신 메뉴</h3> 
	<select name="midOne">
		<c:forEach var="allView" items="${allItem}">
			<option value="${allView.mid}">메뉴아이템 : ${allView.menuItems} </option>
		</c:forEach>
	</select>
	 <input type="submit" value="확인">
</form:form>
<br><br><br>

<button type="button" onclick="goAddMenu()">메뉴추가</button><br><br>
<button type="button" onclick="goUpMenu()">메뉴수정</button><br><br>
<button type="button" onclick="goDelMenu()">메뉴삭제</button><br>

</body>
</html>