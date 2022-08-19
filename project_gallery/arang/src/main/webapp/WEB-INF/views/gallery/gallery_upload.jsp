<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>갤러리상세업로드</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../resources/css/default/normalize.css">
  <link rel="stylesheet" href="../resources/css/default/default.css">
  <link rel="stylesheet" href="../resources/css/default/header.css">
  <link rel="stylesheet" href="../resources/css/artist/artist_focus.css">
  <link rel="stylesheet" href="../resources/css/gallery/gallery_focus.css">
  <link rel="stylesheet" href="../resources/css/mypage/artwork_upload.css">
  <link rel="stylesheet" href="../resources/css/mypage/gallery_upload.css">
</head>

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
            <li><a href="../html_exhibition/exhibition.html">Exhibitions</a></li>
            <li><a href="../html_storage/storage.html">Storage</a></li>
            <li><a href="../html_notice/notice.html">Notice</a></li>
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

    <div class="headline_artworks">
      <h3>GALLERY PAGE</h3>
      <div class="sub-txt">
        아래 양식을 채워 갤러리 페이지를 만드세요!
      </div>
    </div>

    <!-- 갤러리상세페이지 -->
    <div id="artist">
      <div id="artist_detail">
        <div class="container">
          <div class="detail_wrapper d-flex">
            <div class="side_block">
              <div class="artist_info">
    			<form:form method="post" modelAttribute="galleristCommend" enctype="multipart/form-data">
                <div class="input_box_left">
                  <input type="text" placeholder="갤러리이름(한글)" name="galleryName_kor">
                  <input type="text" placeholder="갤러리이름(영문)" name="galleryName_eng">
                  <input type="text" placeholder="년도 ex)2002" name="since">
                  <input type="text" name="galleristName">
                  <input type="hidden" name="galleristEmail" value="${galleristemail}"/>
                  <div class="artist_avatar">
                    <input type="file" id="input-file" name="imgName2" multiple>
                    <!-- <img src="../resources/img/gallerys/2.jpg" alt="2"> -->
                  </div>
                </div>
              </div>
            </div>
            <div class="content_block">
              <div class="review">
                <h2>ARARIO GALLERY</h2>
                <p><textarea class="textarea_box" placeholder="갤러리 소개" cols="43" rows="7" name="intro"></textarea></p>
                <p><br></p>
                <p>
                  <div class="upload_box">
                    <input type="file" id="input-file" name="imgName2" multiple>
                  </div>
                  <div class="upload_box">
                    <input type="file" id="input-file" name="imgName2" multiple>
                  </div>
                  <div class="upload_box">
                    <input type="file" id="input-file" name="imgName2" multiple>
                  </div>
                </p>
              </div>
              <div class="product">
                <h4 class="sub_title">Gallery Infomation</h4>
                <div class="artwork_simul">
                  <div class="artwork_wrapper">
                    <div class="artwork_info_wrap">
                      <div class="artwork_info">
                        <div class="info">
                          <div class="info_block">
                            <div class="first">주소(Address)</div>
                            <div class="last">
                              <input type="text" placeholder="주소" name="address">
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">크기(Size)</div>
                            <div class="last">
                              <input type="text" placeholder="ex) 전시면적 900㎡ / 9층" name="area">
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">시간(Hours)</div>
                            <div class="last">
                              <input type="text" placeholder="ex) 오전 11시 ~ 오후 6시 (월요일 휴관)" name="openClose">
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">이메일(Email)</div>
                            <input type="text" placeholder="이메일" name="galleryEmail">
                          </div>
                          <div class="info_block">
                            <div class="first">전화번호(Phone)</div>
                            <input type="text" placeholder="전화번호" name="galleryPhone">
                          </div>
                        </div>
                      </div>
                      <div class="button_wrap">
                        <div class="btn_group">
                          <button class="btn1" name="contact">Contacting</button>
                          <button class="like"><img src="../resources/img/icon/like.png" alt="like"></button>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="side_block">
              <div class="a_list">
                <h3>추천작가</h3>
                <ul>
                  <li>
                    <a href="#">신수희</a>
                  </li>
                  <li>
                    <a href="#">최선호</a>
                  </li>
                </ul>
              </div>
              <div class="a_banner">
                <h3>이달의 전시</h3>
                <a href="#"><img class="exhibition_banner" src="../resources/img/김선배너.jpg" alt="exhibition_banner"></a>
              </div>
            </div>
          </div>
        </div>
      </div>
    <div class="btn_group2">
      <input type="submit" class="btn2" value="완료">
    </div>
    </div>
  </form:form>
  </div>
</body>

</html>
