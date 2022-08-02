<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function gomain() {
	location.href="mainForm";
}
</script>
</head>
<body>
<h2>주문변경성공!</h2>
	<label>menu</label> : ${menu} / ${MenuItem.menuItemCount } / ${price }<br>
	<label>other</label> : ${other1} + ${MenuItem.addOther2} + ${MenuItem.addOther3}<br>
	<button type="button" onclick="gomain()">확인</button>
</body>
</html>