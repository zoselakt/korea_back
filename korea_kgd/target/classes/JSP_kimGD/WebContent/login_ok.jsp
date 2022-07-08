<%@page import="java.util.Base64"%>
<%@page import="java.util.Base64.Decoder"%>
<%@page import="dao.*"%>
<%@page import="vo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="dao.UserDAO" id="dao"/>
    
<%
	request.setCharacterEncoding("UTF-8"); 
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
    UserDAO mdao = UserDAO.getInstance();
	
	Decoder decoder = Base64.getDecoder();
	pw = new String(decoder.decode(pw));
	
	if(mdao.login(id, pw)){
		session.setAttribute("id", id);		
		response.sendRedirect("login_success.jsp");
	} else {
		response.sendRedirect("login.jsp?type=false");
	}
	%>
	<%
    int chkNum = mdao.login(id, pw);
    if(chkNum == -1){
%>
<script type="text/javascript">
    	alert("아이디가 존재하지 않습니다.");
    	history.go(-1);
    </script>
    <%
    }else if(chkNum == 0){
    %>
    <script type="text/javascript">
    	alert("비밀번호가 틀립니다.");
    	history.go(-1);
	</script>
    <%
    }else if(chkNum == 1){
    	UserDAO mdao = UserDAO.getMember(id);
    	
    	if(mdao == null){
    %>
    <script type="text/javascript">
    	alert("가입된 회원이 아닙니다.");
    	history.go(-1);
    </script>
    <%
    	}else{
    		String name = UserVO.getName();
    		session.setAttribute("id",id);
    		session.setAttribute("name", name);
    		session.setAttribute("chkMember", "yes"); //세션으로 멤버체크여부를 확인하여 yes인경우 성공
    		response.sendRedirect("main.jsp");
    	}
    }
    %>