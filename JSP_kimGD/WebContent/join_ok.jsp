    <%@ page import = "dao.*" %>
    <%@ page import = "vo.*" %>
	<%@ page import="java.sql.Timestamp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="mvo" class="vo.UserVO"/>
 <jsp:setProperty name="mvo" property="*"/>
 
 <%
	UserDAO mdao = UserDAO.getInstance();
	if(mdao.checkId(request.getParameter("id"))){
		out.println("중복된 아이디 입니다.");
	}else{
		out.println("사용가능한 아이디 입니다.");
	}
%>
<%
		int n = mdao.join(mvo);
		if(n == UserDAO.MEM_JOIN_SUCCESS){
			session.setAttribute("id", mvo.getId());
%>
    <script type="text/javascript">
    	alert("회원가입 처리되었습니다.")
    	document.location.href="login.jsp";
    </script>
    <%
    	}else{
    %>
    <script type="text/javascript">
    	alert("회원가입에 실패했습니다.")
    	document.location.href="join.jsp";
    </script>
    <%
    }
    %>
