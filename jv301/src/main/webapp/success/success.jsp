<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="com.varxyz.jv300.mod007.User" scope="request"/>
	아이디 : <jsp:getProperty name="user" property="userId"/>
</body>
</html>