<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
<link rel="stylesheet" href="<c:url value='/resources/css/default/normalize.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/default/default.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/default/initial.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/default/header.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/main/style.css'/>">
</head>
<body>
  <div id="wrap">
  <jsp:include page="/WEB-INF/views/header/header_main.jsp"/>
    <!-- 작품섹션(슬라이드배너) -->
    <div class="headline artworks">
      <p>Promising artworks</p>
      <p>Look at the amazing artworks of the new artists of the month</p>
    </div>
    <div id="slidebanner">
      <div id="carousel-wrap">
        <p id="carousel-prev" class="button"><img src="./img/artworks/btn_prev.png" alt="prev"></p>
        <p id="carousel-next" class="button"><img src="./img/artworks/btn_next.png" alt="next"></p>
        <div id="carousel">
          <!--화면에 보여지는 영역-->
          <div id="carousel-inner">
            <!-- li*4>a[href="#"]>img[src=./img/photo$_thum.jpg] -->
            <ul class="column">
              <li><a href="#"><img src="./img/artworks/1.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/2.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/3.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/4.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/5.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/6.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/7.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/1.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/2.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/3.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/4.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/5.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/6.png" alt=""></a></li>
              <li><a href="#"><img src="./img/artworks/7.png" alt=""></a></li>
              <!-- <li><a href="#"><img src="./img/photo15_thum.jpg" alt=""></a></li>
              <li><a href="#"><img src="./img/photo16_thum.jpg" alt=""></a></li> -->
            </ul>
          </div>
        </div>
      </div>
    </div>

    <!-- 갤러리섹션 -->
    <div class="headline gallerys">
      <p>Creative space</p>
      <p>The best place for artists and people to communicate through their artworks</P>
    </div>
    <div id="gallerys_wrap">
      <div class="box">
        <div class="photobox">
          <img src="./img/gallerys/g1.png" alt="ArarioGallery">
          <p>ARARIO Gallery</p>
          <p>Jongno-gu,Seoul,Korea</p>
        </div>
        <div class="photobox">
          <img src="./img/gallerys/g3.png" alt="LeeSeoulGallery">
          <p>LeeSeoul Gallery</p>
          <p>Mapo-gu,Seoul,Korea</p>
        </div>
        <div class="photobox">
          <img src="./img/gallerys/g2.png" alt="BaudoinLebon">
          <p>Baudoin Lebon</p>
          <p>Jongno-gu,Seoul,Korea</p>
        </div>
        <div class="photobox">
          <img src="./img/gallerys/g4.png" alt="GallerySunContemporary">
          <p>Gallery Sun contemporary</p>
          <p>Mapo-gu,Seoul,Korea</p>
        </div>
      </div>
    </div>

  </div>
  </div>
</body>
</html>