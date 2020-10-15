## anavada Semi-Project
-----------------------
지역 주민간의 소통,정보공유를 위한 사이트 입니다.

- 중고장터 게시판 구현
- 중고장터 관리자 페이지
- 중고장터 댓글 구현

중고장터리스트는 속도 향상을 위해 이미지 리사이징을 하고 저장한 후 출력시켰습니다.<br>
* [anavada/src/jboard/](https://github.com/HWAJONGLEE/anavada/tree/master/src/jboard) <br>
* [anavada/web/views/jboard/](https://github.com/HWAJONGLEE/anavada/tree/master/web/views/jboard)<br>
* [anavada/src/admin/jboard/](https://github.com/HWAJONGLEE/anavada/tree/master/src/admin/jboard)<br>


### 기능설명
--------------------------

+ 중고거래 게시판 글 작성
  + 이미지 4개 ImageUtil 써서 업로드 450 X 450 크기로 리사이징
  + 이미지가 아닌 파일 업로드 시 확인
  + 우편거래 직거래 체크
  + 작성자 IP DB 저장 (개인정보 보호를 위해 뒷 자리 삭제 후 저장)
  
+ 게시물 보기
  + 작성 게시물 정보 출력
  + 게시물 분별력을 위해 작성자 IP 출력
  + 좋아요 버튼(클릭 시 좋아요 1+ 좋아요 누른 회원 닉네임 출력, 다시 클릭시 좋아요 취소)
  + 최종 수정일자 출력
  + 이미지 4개 출력
  + 댓글기능, 대댓글의댓글 기능 구현(댓글 작성자 IP 출력)
  
+ 중고거래 리스트
  + 지역별 정렬
  + 최신등록순, 가격높은순, 가격낮은순, 좋아요순 정렬
  + 제목검색
  + 페이징처리
  + 페이징 이동시 검색 값 유지
  
+ 마이페이지 기능
  + 자신이 쓴 게시물 출력
  + 검색기능, 페이징처리
  
<h3>🛠 개발환경 </h3>

- 💻 &nbsp; Java | JSP
- 🌐 &nbsp; HTML | CSS | JavaScript | jQuery 3.5.1
- 🛢 &nbsp; Oracle Database 11g Release 11.2.0.2.0 | Sql
- 🔧 &nbsp; Git | SourceTree
- 📫 &nbsp; apache-tomcat-8.5.57
<br>
