<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/resources/css/mainForm.css'/>"/>
<script type="text/javascript">
	function gomenuMainForm() { location.href="menuMainForm";	}
	function goAddMenu() { location.href="AddMenuForm";	}
	function goUpMenu() { location.href="UpdateMenuForm";}
	function goDelMenu() { location.href="DeleteMenuForm";	}
</script>
</head>
<body>
<header>
	
</header>
<h2>카페 메인페이지</h2>
<form:form method="post">
	<h3>고객 주문 목록</h3> 
	<span>금일 판매목록 </span> 
	<select name="midOne">
		<c:forEach var="allView" items="${allItem}">
			<option value="${allView.mid}">메뉴아이템 : ${allView.menuItems} </option>
		</c:forEach>
	</select>
	 <input type="submit" value="세부목록">
</form:form>
<br><hr><br><br>

<button type="button" onclick="goAddMenu()">메뉴추가</button><br><br>
<button type="button" onclick="gomenuMainForm()">고객주문폼</button><br><br>
<button type="button" onclick="goUpMenu()">메뉴수정</button><br><br>
<button type="button" onclick="goDelMenu()">메뉴삭제</button><br><br>

</body>
</html>