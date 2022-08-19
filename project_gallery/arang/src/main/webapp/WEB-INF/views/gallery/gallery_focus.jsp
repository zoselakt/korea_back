<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
  <title>갤러리상세페이지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../resources/css/default/normalize.css">
  <link rel="stylesheet" href="../resources/css/default/default.css">
  <link rel="stylesheet" href="../resources/css/default/header.css">
  <link rel="stylesheet" href="../resources/css/artist/artist_focus.css">
  <link rel="stylesheet" href="../resources/css/gallery/gallery_focus.css">
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

    <div class="headline_artworks">
      <h3>ARTISTS</h3>
      <nav id="sub-nav">
        <ul>
          <li><a href="../html_gallery/gallery.html">All</a></li>
          <li><a href="../html_gallery/Seoul.html">Seoul</a></li>
          <li><a href="../html_gallery/Gyeonggi.html">Gyeonggi</a></li>
          <li><a href="../html_gallery/Deajeon.html">Deajeon</a></li>
          <li><a href="../html_gallery/Daegu.html">Daegu</a></li>
          <li><a href="../html_gallery/Busan.html">Busan</a></li>
          <li><a href="../html_gallery/Jeju.html">Jeju</a></li>
          <li><a href="../html_gallery/Other.html">Other</a></li>
        </ul>
      </nav>
    </div>

    <!-- 갤러리상세페이지 -->
    <div id="artist">
      <div id="artist_detail">
        <div class="container">
          <div class="detail_wrapper d-flex">
            <div class="side_block">
              <div class="artist_info">
                <h3>아라리오 갤러리</h3>
                <p class="e_name">ARARIO Gallery</p>
                <p class="born">2002</p>
                <div class="artist_avatar">
                  <img src="../resources/img/gallerys/2.jpg" alt="2">
                </div>
              </div>
            </div>
            <div class="content_block">
              <div class="review">
                <h2>ARARIO GALLERY</h2>
                <p>아라리오갤러리는 2002년 천안 갤러리 재 개관을 시작으로 현재 천안과 서울에 갤러리 두 지점과 중국 상하이에 갤러리를 운영하고 있습니다. 아라리오갤러리는 그 동안 다른 갤러리가 시도하지 않았던 해외미술과의 적극적인 연계로 한국 미술계에 혼성성과 다양성을 이끌어내었을 뿐 아니라, 지속적이고 체계적인 전속작가 시스템을 도입하여 한국의 동시대 미술을 해외에 소개하는데 앞장서 왔습니다. 현재는 중국 미술계에서의 경험을 토대로 국내에 소개된 바 없는 인도 및 동남아시아 작가들의 다양한 작품세계를 한국 미술계에 소개하고 있습니다. 나아가 지속적인 프로모션을 통해 이들 지역의 신진작가를 발굴 및 후원하고 있습니다. 아라리오갤러리는 우수한 전속작가 시스템과 다양한 국, 내외 미술관과의 콜라보레이션, 다양한 해외지역 미술의 소개 등을 토대로 한국과 미술의 가능성을 확장하고 마켓을 선도하는 아시아 대표 갤러리로서 그 역할을 다할 것입니다.</p>
                <p><br></p>
                <p>
                  <img src="../resources/img/gallerys/2.jpg" alt="2">
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
                              서울 종로구 율곡로 85 (원서동, 볼제빌딩) ARARIO GALLERY
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">크기(Size)</div>
                            <div class="last">
                              전시면적 900㎡ / 9층
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">시간(Hours)</div>
                            <div class="last">
                              오전 11시 ~ 오후 6시 (월요일 휴관)
                            </div>
                          </div>
                          <div class="info_block">
                            <div class="first">이메일(Email)</div>
                            <div class="last">info@arariogallery.com</div>
                          </div>
                          <div class="info_block">
                            <div class="first">전화번호(Phone)</div>
                            <div class="last">02-541-5701</div>
                          </div>
                        </div>
                      </div>
                      <div class="button_wrap">
                        <div class="btn_group">
                          <a href="#"><button class="btn1">Contacting</button></a>
                          <button class="like"><img src="../resources/img/icon/like.png" alt="like"></button>
                          <p>76</p>
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

    </div>
  </div>
</body>

</html>