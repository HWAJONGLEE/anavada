/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-13 01:09:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import member.model.vo.Member;
import java.util.ArrayList;
import member.model.vo.Member;

public final class memberList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/admin/member/../include/admin_head.jsp", Long.valueOf(1597277304955L));
    _jspx_dependants.put("/views/admin/member/../include/admin_header.jsp", Long.valueOf(1597277304955L));
    _jspx_dependants.put("/views/admin/member/../include/admin_footer.jsp", Long.valueOf(1597209052473L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<meta name=\"title\" content=\"Anavada\" />\r\n");
      out.write("<meta name=\"description\" content=\"Anavada 설명\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Anavada 키워드\" />\r\n");
      out.write("\r\n");
      out.write("<title>Anavada 관리자</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/anavada/resources/admin/css/common.css\">\r\n");
      out.write("<script src=\"/anavada/resources/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--티스토리 불펌금지-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var omitformtags=[\"input\", \"textarea\", \"select\"]\r\n");
      out.write("    omitformtags=omitformtags.join(\"|\")\r\n");
      out.write("    function disableselect(e){\r\n");
      out.write("    if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)\r\n");
      out.write("        return false\r\n");
      out.write("    }\r\n");
      out.write("    function reEnable(){\r\n");
      out.write("        return true\r\n");
      out.write("    }\r\n");
      out.write("    if (typeof document.onselectstart!=\"undefined\")\r\n");
      out.write("        document.onselectstart=new Function (\"return false\")\r\n");
      out.write("    else{\r\n");
      out.write("        document.onmousedown=disableselect\r\n");
      out.write("        document.onmouseup=reEnable\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write('\r');
      out.write('\n');
 Member member = (Member)request.getAttribute("member"); 
      out.write('\r');
      out.write('\n');
 ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); 
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("  <header id=\"admin_header\">\r\n");
      out.write("   \r\n");
      out.write("    <h1 class=\"logo\">Anavada</h1>  \r\n");
      out.write("    \r\n");
      out.write("    <!-- gnb -->\r\n");
      out.write("    <div class=\"admin_gnb\">\r\n");
      out.write("        \r\n");
      out.write("        <h2><p>회원관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/anavada/mlist.ad\">전체회원</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/leavelist.ad\">탈퇴회원</a></li>\r\n");
      out.write("            <li><a href=\"../member/memberDeclare.jsp\">신고회원</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h2><p>중고거래/커뮤니티관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"../product/product_list.jsp\">중고거래</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/adclistview.ad\">커뮤니티</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h2><p>지역축제</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"../fboard/adminfboardList.jsp\">지역축제</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h2><p>게시판관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/anavada/anlist.ss\">공지사항</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/aflist.ss\">FAQ</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/ailist.ss\">문의하기</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/dlist.ad\">신고자관리</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        <h2><p>홈페이지관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/anavada/blist.ad\">사용자배너</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/mypage.cp?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("\">관리자 정보변경</a></li>\r\n");
      out.write("            <li class=\"homeBtn\"><a href=\"/anavada/\">home</a></li>\r\n");
      out.write("            <li class=\"logoutBtn\"><a href=\"/anavada/logout\">로그아웃</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- //gnb -->\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        <div id=\"admin_container\">\r\n");
      out.write("\r\n");
      out.write("            <!-- 상단 타이틀 -->\r\n");
      out.write("            <div class=\"admin_title\">\r\n");
      out.write("                <div class=\"admin_path\">\r\n");
      out.write("                    <h3>회원가입</h3>\r\n");
      out.write("                    <h2>| 리스트</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- //상단 타이틀 -->\r\n");
      out.write("\r\n");
      out.write("            <!-- 본문내용 -->\r\n");
      out.write("            <div class=\"list-area\">\r\n");
      out.write("                <!-- 검색영역 -->\r\n");
      out.write("                <div class=\"sort-area\">  \r\n");
      out.write("                    <h4>전체 회원 ");
      out.print( listCount );
      out.write("명</h4>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <form method=\"get\" id=\"\">\r\n");
      out.write("                           \t 목록 분류 : <select action=\"/anavada/msearch.ad\" name=\"search\" class=\"ListSelect\">\r\n");
      out.write("                                    <!--option value=\"분류 선택\" selected=\"selected\">분류 선택</option-->\r\n");
      out.write("                                    <option value=\"userId\" elected=\"selected\">아이디</option>\r\n");
      out.write("                                    <option value=\"userName\">이름</option>\r\n");
      out.write("                                    <option value=\"userEmail\">이메일</option>\r\n");
      out.write("                                    <option value=\"userPhone\">전화번호</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <input type=\"text\" name=\"keyword\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("                            <button type=\"submit\" class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 검색영역 끝 -->\r\n");
      out.write("\r\n");
      out.write("                <table class=\"memberTable\">\r\n");
      out.write("                    <colgroup>\r\n");
      out.write("                        <col width=\"5%\">\r\n");
      out.write("                        <col width=\"8%\">\r\n");
      out.write("                        <col width=\"10%\">\r\n");
      out.write("                        <col width=\"10%\">\r\n");
      out.write("                        <col width=\"*\">\r\n");
      out.write("                        <col width=\"18%\">\r\n");
      out.write("                        <col width=\"10%\">\r\n");
      out.write("                        <col width=\"10%\">\r\n");
      out.write("                        <col width=\"8%\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>선택</th>\r\n");
      out.write("                            <th>번호</th>\r\n");
      out.write("                            <th>아이디</th>\r\n");
      out.write("                            <th>이름</th>\r\n");
      out.write("                            <th>이메일</th>\r\n");
      out.write("                            <th>전화번호</th>\r\n");
      out.write("                            <th>가입일</th>\r\n");
      out.write("                            <th>접속일</th>\r\n");
      out.write("                            <th>신고여부</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 for(Member m : list){ 
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"checkBox\"><input type=\"checkbox\" name=\"Mleave\" id=\"Mleave\"></td>\r\n");
      out.write("                            <td class=\"number\">");
      out.print( m.getmNumber() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"id\">");
      out.print( m.getMemberId() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"name\">");
      out.print( m.getMemberName() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"email\">");
      out.print( m.getMemberEmail() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"phone\">");
      out.print( m.getMemberPhone() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"joinDate\">");
      out.print( m.getJoinDate() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"lastAccessDate\">");
      out.print( m.getLastAccessDate() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"declareOK\">");
      out.print( m.getDeclareOK() );
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                <p class=\"warning_text\"> *탈퇴된 회원은 되돌릴 수 없습니다. 신중하게 선택하세요.</p>\r\n");
      out.write("                <!-- //게시판 -->\r\n");
      out.write("\r\n");
      out.write("                <!-- 버튼 -->\r\n");
      out.write("                <div class=\"btn_wrap\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn-left btn_gray\">선택탈퇴</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- //버튼 -->\r\n");
      out.write("\r\n");
      out.write("                <!-- 페이징 -->\r\n");
      out.write("                <dl class=\"list-paging\">\r\n");
      out.write("                    <dd>\r\n");
      out.write("                   \t");
 if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("                    \t<a href=\"#none\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                   \t");
 } else { 
      out.write("\r\n");
      out.write("                   \t\t<a href=\"/anavada/mlist.ad?page=");
      out.print( startPage );
      out.write("\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                   \t");
 if(1 <= currentPage){ 
      out.write("\r\n");
      out.write("                   \t\t<a href=\"/anavada/mlist.ad?page=");
      out.print( currentPage - 1 );
      out.write("\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    \t");
 } else { 
      out.write("\r\n");
      out.write("                   \t\t<a href=\"#none\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                   \t");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 for(int p = startPage; p <= endPage; p++){ 
      out.write("\r\n");
      out.write("                    \t");
 if(currentPage == p){ 
      out.write("\r\n");
      out.write("                        <a href=\"#none\" class=\"active\">");
      out.print( p );
      out.write("</a>\r\n");
      out.write("                   \t");
 } else { 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/mlist.ad?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("                    \t");
 } 
      out.write("\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t");
 if(currentPage < maxPage){ 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/mlist.ad?page=");
      out.print( currentPage + 1 );
      out.write("\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("                        <a href=\"#none\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("                        <a href=\"#none\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/mlist.ad?page=");
      out.print( maxPage );
      out.write("\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\t\t\t\t\t\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <!-- //페이징 -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<footer id=\"admin_footer\">\r\n");
      out.write("\t<address>Copyright 2020. Anavada. All Rights Reserved</address>\r\n");
      out.write("</footer>");
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
