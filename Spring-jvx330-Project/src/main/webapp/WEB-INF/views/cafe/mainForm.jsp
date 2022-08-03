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
<form:form method="post" modelAttribute="MenuItem">
	
	<h3>주문하신 메뉴</h3> 
	<c:forEach var="oneView" items="${oneitem}">
	번호 입력 : <input type="text" name="oneitem"><br>
		<li>=========================</li>
		<li>mid : ${oneView.mid}</li>
		<li>메뉴아이템 : ${oneView.menuItems}</li>
		<li>추가 요구사항 : ${oneView.addOther1}</li>
		<li>추가 요구사항 : ${oneView.addOther2}</li>
		<li>추가 요구사항 : ${oneView.addOther3}</li>
		<li>가격 : ${oneView.menuPrice}</li>
		<li>주문 수량 : ${oneView.menuItemCount}</li>
	</c:forEach><br>
	
	 <input type="submit" value="확인">
</form:form>
<br><br><br>

<button type="button" onclick="goAddMenu()">메뉴추가</button><br><br>
<button type="button" onclick="goUpMenu()">메뉴수정</button><br><br>
<button type="button" onclick="goDelMenu()">메뉴삭제</button><br>

</body>
</html>