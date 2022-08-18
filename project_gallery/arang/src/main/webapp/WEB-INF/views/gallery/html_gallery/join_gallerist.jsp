<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
  <title>아티스트가입</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../../resources/css/default/normalize.css">
  <link rel="stylesheet" href="../../resources/css/default/default.css">
  <link rel="stylesheet" href="../../resources/css/default/header.css">
  <link rel="stylesheet" href="../../resources/css/login/input_style.css">
  <link rel="stylesheet" href="../../resources/css/join/join_artist.css">
</head>
<script type='text/javascript'> 
var cnt = ''; 
function upfileAdd() 
{ 
    eval('upfileAddArea' + cnt).innerHTML += "<input type='file' name='imgPath' multiple size='60'><div id='upfileAddArea" + (cnt+1) + "'></div>"; 
    cnt++; 
} 
</script> 

<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="index.html">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="../html_artist/artist.html">Artists</a></li>
            <li><a href="../html_gallery/gallery.html">Gallerys</a></li>
            <li><a href="./exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="./storage/storage.html">Storage</a></li>
            <li><a href="./notice/notice.html">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="./find/find.html"><img src="../resources/img/icon/find.png" alt="find"></a></li>
            <li><a href="./mypage/mypage.html"><img src="../resources/img/icon/mypage.png" alt="mypage"></a></li>
            <li><a href="./like/like.html"><img src="../resources/img/icon/like.png" alt="like"></a></li>
            <li><a href="./cart/cart.html"><img src="../resources/img/icon/cart.png" alt="cart"></a></li>
            <li><a href="../html_login/login.html">Login</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div id="input_wrap">
      <div class="gallerist_input_wrap">
        <div class="title">
          <h1>GALLERIST JOIN</h1>
        </div>
        <form:form method="post" modelAttribute="galleristCommend" enctype="multipart/form-data">
          <table class="table_a">
            <tr>
              <td>
                <input type="text" class="small" placeholder="이메일(아이디)" name="email"> @
                <select class="box">
                  <option value="naver.com">naver.com</option>
                  <option value="google.com">google.com</option>
                  <option value="kakao.com">kakao.com</option>
                </select>
              </td>
            </tr>
            <tr>
              <td>
                <input type="password" class="big" placeholder="비밀번호" name="passwd">
              </td>
            </tr>
            <tr>
              <td>
                <input type="text" class="big" placeholder="이름" name="name">
              </td>
            </tr>
            <tr>
              <td>
                <input type="text" class="big" placeholder="주민등록번호" name="ssn">
              </td>
            </tr>
            <tr>
              <td>
                <input type="text" class="big" placeholder="전화번호" name="phone">
              </td>
            </tr>
            <tr>
              <td>
                <div class="select_file">
                  <input type="file" class="big" placeholder="이미지등록" name="imgName1">
                </div>
              </td>
            </tr>
          </table>
          <div class="button-group">
            <input type="submit" value="회원가입" class="gbtn normal"/>
            <button class="gbtn normal">취소</button>
          </div>
          <div class="btn_other">
            <p>이미 계정이 있으신가요?&nbsp;&nbsp;</p>
            <a href="../html_login/login.html"><strong>로그인</strong></a>
            </div>
          </form:form>
      </div>
   </div>
   </div>
</body>

</html>
