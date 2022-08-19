<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
  <title>갤러리페이지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../resources/css/default/normalize.css">
  <link rel="stylesheet" href="../resources/css/default/default.css">
  <link rel="stylesheet" href="../resources/css/default/header.css">
  <link rel="stylesheet" href="../resources/css/artist/artist.css">
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
            <li><a href="./gallery.html">Gallerys</a></li>
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
      <h3>GALLERYS</h3>
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

    <!-- 갤러리 -->
    <div id="artist">
      <form id="artist_form">
        <div class="container">
          <!-- 아티스트 -->
          <div class="sub_page_context">
            <div class="grid_wrapper">
              <h5 class="sub_title">Gallerys<small>76</small></h5>
              <div class="row artist_list">
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="../html_gallery/gallery_focus.html"><img src="../resources/img/gallerys/g1.png" alt="g1"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>ARARIO Gallery</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Jongno-gu,Seoul,Korea</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <a href="../html_gallery/gallery_focus.html"><img src="../resources/img/gallerys/2.jpg" alt="2"></a>
                      </div>
                    </a>
                  </div>
                </div>
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="#"><img src="../resources/img/gallerys/g3.png" alt="g3"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>LeeSeoul Gallery</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Mapo-gu,Seoul,Korea</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <img class="artwork" src="../resources/img/gallerys/g3.png" alt="g3">
                      </div>
                    </a>
                  </div>
                </div>
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="#"><img src="../resources/img/gallerys/g2.png" alt="g2"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>Baudoin Lebon</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Jongno-gu,Seoul,Korea</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <img class="artwork" src="../resources/img/gallerys/g2.png" alt="g2">
                      </div>
                    </a>
                  </div>
                </div>
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="#"><img src="../resources/img/gallerys/g4.png" alt="g4"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>Gallery Sun contemporary</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Mapo-gu,Seoul,Korea</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <img class="artwork" src="../resources/img/gallerys/g4.png" alt="g4">
                      </div>
                    </a>
                  </div>
                </div>
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="#"><img src="../resources/img/gallerys/5.jpg" alt="5"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>GALLERY BATON</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Dokseodang-ro, Yongsan-gu, Seoul</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <img class="artwork" src="../resources/img/gallerys/5.jpg" alt="5">
                      </div>
                    </a>
                  </div>
                </div>
                <div class="col artist_item">
                  <div class="artist_info d-flex flex-row">
                    <div class="artist_avatar">
                      <a href="#"><img src="../resources/img/gallerys/6.jpg" alt="6"></a>
                    </div>
                    <div class="artist_text">
                      <div class="first">
                        <span>Hakgojae Gallery</span>
                      </div>
                      <div class="second d-flex flex-row">
                        <div>Samcheong-ro, Jongno-gu, Seoul</div>
                      </div>
                    </div>
                  </div>
                  <div class="banner_wrap">
                    <a href="#">
                      <div class="artwork_banner">
                        <img class="artwork" src="../resources/img/윤라희/윤라희-오브제1_s02.jpg" alt="오브제1">
                      </div>
                    </a>
                  </div>
                </div>
              </div>
              <div class="toolbox">
                <ul class="pagination">
                  <li class="page_item disabled">
                    <a class="page_link_btn" href="#"><i class="go_left"><<</i></a>
                  </li>
                  <li class="page_item">
                    <a class="page_link" href="#">1</a>
                  </li>
                  <li class="page_item">
                    <a class="page_link" href="#">2</a>
                  </li>
                  <li class="page_item">
                    <a class="page_link" href="#">3</a>
                  </li>
                  <li class="page_item">
                    <a class="page_link" href="#">...</a>
                  </li>
                  <li class="page_item">
                    <a class="page_link" href="#">7</a>
                  </li>
                  <li class="page_item disabled">
                    <a class="page_link_btn" href="#"><i class="go_right">>></i></a>
                  </li>
                </ul>
              </div>
            </div>
          </div>

        </div>
      </form>
    </div>

    <!-- 작가 -->

  </div>
</body>

</html>
