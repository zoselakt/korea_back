<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add_user.do" method="post">
		<ul>
			<li>아이디 : <input type="text" name="userId"/></li>
			<li>비밀번호 : <input type="password" name="passwd"/></li>
			<li>이름 : <input type="text" name="userName"/></li>
			<li>이메일1 : <input type="text" name="Email1"/></li>
			<li>이메일2 : <input type="text" name="Email2"/></li>
			<li>주민등록번호 : <input type="text" name="ssn"/></li>
			<li>주소1 : <input type="text" name="addr1"/></li>
			<li>주소2 : <input type="text" name="addr2"/></li><br>
		</ul>
		<input type="submit" name="확인"/>
	</form>
</body>
</html>