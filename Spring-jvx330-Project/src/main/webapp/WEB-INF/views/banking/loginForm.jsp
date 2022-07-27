<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<form action="main" method="post">
		<label>아이디: </label><input type="text" name="customerid"><br>
		<label>비밀번호: </label><input type="password" name="password"><br>
		<input type="submit" value="로그인"/>
	</form>
		<h2>확인</h2>
		<label>아이디: </label>${customer.customerid }<br> <!-- getEmail이 아니라 그냥 email로 해야한다. -->
		<label>비밀번호: </label>${customer.password }<br><!-- 이유는 파라미터에 있는 내용으로 하기 때문이다. -->
		<label>성명: </label>${customer.name }<br>
		<label>주민번호: </label>${customer.ssn }<br>
		<label>전화번호: </label>${customer.phone }<br>
		<label>계좌번호: </label>${account.accountNum }<br>
		<label>계좌타입: </label>${account.accountType }<br>
		<label>현재금액: </label>${account.balance }<br>
		<label>전화번호: </label>${account.interestRate }<br>
</body>
</html>