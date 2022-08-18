<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
<jsp:include page="/WEB-INF/views/header/header.jsp"/>

	<!-- 아트워크 상세 -->
    <div id="artwork">
      <div id="artwork_detail">
        <div class="container">
          <div class="artwork_simul">
            <div class="artwork_wrapper">
              <div class="artwork_view">
                <div class="img_wrapper">
                  <div class="paintings">
                    <img class="artwork" src="../resources/img/윤라희/윤라희-오브제1_s02.jpg" alt="오브제1">
                  </div>
                </div>
              </div>
              <div class="artwork_info_wrap">
                <div class="artwork_info">
                  <h2>BLOCK (Falling Blue Brown)</h2>
                  <div class="info">
                    <div class="info_block">
                      <div class="first">작가명(Name)</div>
                      <div class="last">
                        <a href="../html_artist/artist_focus.html">윤라희 Yoon, Ra Hee</a>
                      </div>
                    </div>
                    <div class="info_block">
                      <div class="first">장르(Genre)</div>
                      <div class="last">
                        <a href="../html_artist/artist.html">Sculptor</a>
                      </div>
                    </div>
                    <div class="info_block">
                      <div class="first">기법(Technique)</div>
                      <div class="last">아크릴(Acrylic)</div>
                    </div>
                    <div class="info_block">
                      <div class="first">크기(Size)</div>
                      <div class="last">21x11cm</div>
                    </div>
                    <div class="info_block">
                      <div class="first">년도(Year)</div>
                      <div class="last">2018</div>
                    </div>
                    <div class="info_block2">
                      <div class="first">설명(Description)</div>
                      <div class="last">검색 결과가 달라지는 이유는 네이버 자동완성어 서비스가 띄어쓰기까지 하나의 알고리즘(키워드)으로 인식해 분석하기 때문이다. 카카오의 포털 서비스 다음이 제공하는 자동 완성 검색어 서제스도 이용자가 띄어쓰기에 따라 결과값이 달라진다.검색 결과가 달라지는 이유는 네이버 자동완성어 서비스가 띄어쓰기까지 하나의 알고리즘(키워드)으로 인식해 분석하기 때문이다. 카카오의 포털 서비스 다음이 제공하는 자동 완성 검색어 서제스도 이용자가 띄어쓰기에 따라 결과값이 달라진다.음이 제공하는 자동 완성 검색어 서제스도 이용자가 띄어쓰기에 따라 결과값있다</div>
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
          <!-- 상세 내용 -->
          <section>
            <div class="a_title">
              <div class="first">
                물성을 살려 단순함을 끌어내는 것
              </div>
              <div class="second">
                날 것 그대로의 본질에 우연적 효과를 불어넣다.
              </div>
            </div>
            <div class="a_artwork">
              <img src="../resources/img/윤라희/윤라희-오브제1_big1.jpg" alt="오브제1-1">
              <img src="../resources/img/윤라희/윤라희-오브제1_big2.jpg" alt="오브제1-2">
              <img src="../resources/img/윤라희/윤라희-오브제1_big3.jpg" alt="오브제1-3">
            </div>
            <div class="a_desc">
              <h4 class="sub_title">Artist</h4>
              <h3>윤라희</h3><p class="e_name">Yoon, Ra Hee</p><p class="born">1984</p>
              <p class="txt">윤라희 작가는 서울에서 활동하는 디자이너이자 아티스트이다. 금속, 섬유, 도자, 목공을 아우르는 넓은 영역의 공예를 전공한 뒤, 2017년에 스튜디오를 열어 본격적인 작품 활동을 시작하였다. 그녀는 특유의 섬세함으로 작품에 고유한 성격을 부여한다. 재료, 날 것 그대로의 본질에 우연적 효과를 불어 넣어 불규칙하면서 솔직한 방식으로 결과를 드러낸다. 주 소재로 몰두하고 있는 ‘아크릴’이라는 소재를 다루는 시간 속에서 작가는 소재의 역사, 특정 이미지로 인식되어진 명사로서의 ‘아크릴’은 잊어버린 상태이다. ‘진하게 스며들게 하다’, ‘미묘하게 굴절시키다’, ‘단순하게 중첩하다.’ 등처럼 재료를 다루면서 느껴지는 형용사와 행동되는 동사의 조합에 집중하고, 그 안에 담긴 은유와 이미지를 자신만의 방식으로 해석하는 작업을 선보이고 있다. 윤라희 작가의 모든 작업은 작가의 손으로부터 한국의 소규모 공방 및 특별한 엔지니어들과의 긴밀한 협업을 거쳐, 심도 깊은 아름다움을 지닌 오브제로 완성되고 있다. 다양한 분야의 경계를 넘나드는 작품은 전시 뿐만 아니라 국내외 기업, 스튜디오들과의 다채로운 협업을 이어가고 있다.</p>
            </div>
            <div class="product">
              <h4 class="sub_title">This artist's work</h4>
              <div id="product2" class="item_list1">
                <div class="slick_list">
                  <div class="slick_trak">
                    <div class="item">
                        <div class="artwork_wrap">
                          <a href="#"><img class="artwork" src="../resources/img/윤라희/윤라희-오브제2_s01_fub8Yrj.jpg" alt="오브제2"></a>
                        </div>
                      <figcaption>
                        <h5>BLOCK (Falling Bluse Brown)</h5>
                        <p>Limited Unique</p>
                      </figcaption>
                    </div>
                    <div class="item">
                        <div class="artwork_wrap">
                          <a href="#"><img class="artwork" src="../resources/img/윤라희/윤라희-오브제3_s01_gpLUosS.jpg" alt="오브제3"></a>
                        </div>
                      <figcaption>
                        <h5>BLOCK (Falling Bluse Brown)</h5>
                        <p>Limited Unique</p>
                      </figcaption>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
      </div>

    </div>
</body>
</html>