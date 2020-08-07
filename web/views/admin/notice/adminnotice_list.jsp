<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, notice.model.vo.Notice"%>
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	int currentPage = (Integer)request.getAttribute("currentPage");
	int totalPage = (Integer)request.getAttribute("totalPage");
	int startPage = (Integer)request.getAttribute("startPage");
	int endPage = (Integer)request.getAttribute("endPage");
	int totalList = (Integer)request.getAttribute("totalList");
%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../include/admin_head.jsp" %> 
<script type="text/javascript" src="/anavada/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
function checkAll(){
	if($("input[name=checkAll]").is(":checked")){
		$("input[name=checkDel]").prop("checked", true);
	}else{
		$("input[name=checkDel]").prop("checked", false);
	}
}

function deleteAction(){
	var checkRow = "";
	$("input[name='checkDel']:checked").each(function(){
		checkRow = checkRow + $(this).val()+",";
	});
	checkRow = checkRow.substring(0, checkRow.lastIndexOf(","));
	
	if(checkRow == ""){
		alert("삭제할 대상을 선택하세요.");
		return false;
	}
	console.log("### checkRow => {"+checkRow+"}");
	
	if(confirm("삭제 하시겠습니까?"))
		location.href = "/anavada/andelete?checkRow="+checkRow;
}

</script>
</head>
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
    <div id="wrap">
        <%@ include file="../include/admin_header.jsp" %> 

        <div id="admin_container">

            <!-- 상단 타이틀 -->
            <div class="admin_title">
                <div class="admin_path">
                    <h3>공지사항</h3>
                    <h2>| 리스트</h2>
                </div>
            </div>
            <!-- //상단 타이틀 -->

            <!-- 본문내용 -->
            <div class="list-area">


                <!-- 검색영역 -->
				<div class="sort-area">
					<h4>
						전체
						<%= totalList %>개
					</h4>
					<div>
						<form action="" method="" id="">
							목록 분류 : <select name="" class="ListSelect">
								<option value="분류 선택" selected="selected">분류 선택</option>
								<option value="제목">제목</option>
								<option value="내용">내용</option>
								<option value="작성자">작성자</option>
							</select> <input type="text" placeholder="검색어를 입력해주세요.">
							<button class="top-search">
								<i class="xi-search"></i>
							</button>
						</form>
					</div>
				</div>
				<!-- 검색영역 끝 -->
				
				<% if(totalList == 0) { %>
				<br><br>
				<div class="list-no" align="center">
					<p>
						<img src="/anavada/resources/images/btnIcn/icn_big_listNo.png"
							alt="" title="" />
					</p>
					<h1>목록이 없습니다.</h1>
				</div><br><br>

				<% }else { %>
				<table>
                    <tbody>
                    <% for(Notice n : list) { %>
                        <tr>
                            <td class="checkBox"><input type="checkbox" name="checkDel" value="<%= n.getNoNo() %>"></td>
                            <td class="number"><%= n.getNoNo() %></td>
                            <td class="title">
                                <h2><span>공지</span><%= n.getNoTitle() %></h2>
                                <ul>
                                    <li>작성자 : <%= n.getNoId() %></li>
                                    <li>작성일 : <%= n.getNoDate() %></li>
                                    <li>조회수 : <%= n.getNoCount() %></li>
                                </ul>
                            </td>
                            <% if(n.getNoOriginal() != null) { %>
                            <td class="fileDown"><i class="glyphicon glyphicon-floppy-saved"></i></td><% } %>
                        </tr>
                     <% } %>
                    </tbody>
                </table>
				<% } %>
				
                <p class="warning_text">
                    *삭제한 게시글은 복구가 불가능 하오니 신중하게 선택하시기 바랍니다.
                </p>
                <!-- //게시판 -->
                
					<input type="checkBox" name="checkAll" onclick="checkAll();" class="checkBox"> 전체 선택
                <!-- 버튼 -->
                <div class="btn_wrap">
                    <a onclick="deleteAction();" class="btn-left btn_gray">선택삭제</a>
                    <a href="notice_write.php" class="btn-right btn_white">등록</a>
                </div>
                <!-- //버튼 -->

                <!-- 페이징 -->
                <dl class="list-paging">
                    <dd>
                    	<% if(currentPage <= 1) { %>
                        <a href="#none"><i class="glyphicon glyphicon-menu-left"></i></a>
                        <% }else {%><a href="/anavada/anlist?page=1"><i class="glyphicon glyphicon-menu-left"></i></a><% } %>
                        
                        <% for(int p=startPage; p<=endPage; p++) {%>
                        	<% if(p == currentPage) {%>
                        	<a href="#none" class="active"><%= p %></a>
                        	<% }else { %>
                        	<a href="/anavada/anlist?page=<%= p %>"><%= p %></a>
                        	<% } %>
                        <% } %>
                        
                        <% if(currentPage < totalPage) { %>
                        <a href="/anavada/anlist?page=<%= totalPage %>"><i class="glyphicon glyphicon-menu-right"></i></a>
                        <% }else {%><a href="#none"><i class="glyphicon glyphicon-menu-right"></i></a><% } %>
                    </dd>
                </dl>
                <!-- //페이징 -->

            </div>
        <%@ include file="../include/admin_footer.jsp" %> 
        </div>
    </div>
</body>
</html>