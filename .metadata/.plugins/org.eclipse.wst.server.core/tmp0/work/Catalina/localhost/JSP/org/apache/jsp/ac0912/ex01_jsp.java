/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-09-13 03:56:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ac0912;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>ex01.jsp</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	fieldset {\r\n");
      out.write("		display: inline-block;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>form 타입</h1>\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<fieldset>\r\n");
      out.write("		<legend>form</legend>\r\n");
      out.write("		\r\n");
      out.write("		<form action=\"ex01_result.jsp\">\r\n");
      out.write("			<p><input name=\"userid\" type=\"text\" placeholder=\"ID\" required></p>\r\n");
      out.write("			\r\n");
      out.write("			<p><input name=\"userpw\" type=\"password\" placeholder=\"PW\" required></p>\r\n");
      out.write("			\r\n");
      out.write("			<p><input name=\"email\" type=\"email\" placeholder=\"이메일\" required></p>\r\n");
      out.write("			\r\n");
      out.write("			<p><input name=\"birth\" type=\"date\"></p>\r\n");
      out.write("			\r\n");
      out.write("			<p><input name=\"upload\" type=\"file\"></p>\r\n");
      out.write("			\r\n");
      out.write("			<p><input name=\"color\" type=\"color\"></p>\r\n");
      out.write("			\r\n");
      out.write("			<p>\r\n");
      out.write("				<input name=\"gender\" type=\"radio\" value=\"man\">남\r\n");
      out.write("				<input name=\"gender\" type=\"radio\" value=\"woman\">여\r\n");
      out.write("			</p>\r\n");
      out.write("			\r\n");
      out.write("			<p>\r\n");
      out.write("				<input name=\"hobby\" type=\"checkbox\" value=\"game\" checked>게임\r\n");
      out.write("				<input name=\"hobby\" type=\"checkbox\" value=\"movie\">영화\r\n");
      out.write("				<input name=\"hobby\" type=\"checkbox\" value=\"music\">음악\r\n");
      out.write("				<input name=\"hobby\" type=\"checkbox\" value=\"book\">독서\r\n");
      out.write("			</p>\r\n");
      out.write("			\r\n");
      out.write("			<p>\r\n");
      out.write("				<select name=\"major\">\r\n");
      out.write("					<option>컴퓨터공학</option>\r\n");
      out.write("					<option>기계공학</option>\r\n");
      out.write("					<option>국어국문</option>\r\n");
      out.write("					<option>영문학</option>\r\n");
      out.write("					<option>회계학</option>\r\n");
      out.write("					<option>경영학</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</p>\r\n");
      out.write("			\r\n");
      out.write("			<p><textarea name=\"info\" placeholder=\"자기소개\"></textarea></p>\r\n");
      out.write("			\r\n");
      out.write("			<button>전송</button>\r\n");
      out.write("		</form>\r\n");
      out.write("	</fieldset>\r\n");
      out.write("\r\n");
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
