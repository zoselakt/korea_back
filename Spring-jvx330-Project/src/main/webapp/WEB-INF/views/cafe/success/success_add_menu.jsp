<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function gomain() { location.href="menuMainForm"; }
</script>
</head>
<body>
<h2>주문성공!</h2>
<h3>주문목록</h3>
	<label>menu</label> : ${MenuItem.menuItems } / ${MenuItem.menuItemCount } / ${MenuItem.menuPrice }<br>
	<label>other</label> : ${MenuItem.addOther1} + ${MenuItem.addOther2} + ${MenuItem.addOther3}<br>
	<button type="button" onclick="gomain()">확인</button>
</body>
</html>