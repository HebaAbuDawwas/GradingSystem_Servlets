/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-08-10 20:51:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Set;

public final class marksListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      background-color: #f5f5f5;\r\n");
      out.write("    }\r\n");
      out.write("    .container {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin: 20px auto;\r\n");
      out.write("      background-color: white;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("    h1 {\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    h2 {\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    table {\r\n");
      out.write("      border-collapse: collapse;\r\n");
      out.write("      width: 80%; /* Adjust this value to suit your page */\r\n");
      out.write("      margin: 20px auto;\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      background-color: white;\r\n");
      out.write("    }\r\n");
      out.write("    th, td {\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      padding: 8px;\r\n");
      out.write("      text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("    th {\r\n");
      out.write("      background-color: #f2f2f2;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("  <h2> ");
      out.print( request.getAttribute("studentName") );
      out.write(" marks :</h2> <!-- Display student name -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Course</th>\r\n");
      out.write("    <th>Mark</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

    Map<String, Integer> mapData = (Map<String, Integer>) request.getAttribute("mapData");
    if (mapData != null && !mapData.isEmpty()) {
      for (Map.Entry<String, Integer> entry : mapData.entrySet()) {
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><strong>");
      out.print( entry.getKey() );
      out.write("</strong></td>\r\n");
      out.write("    <td>");
      out.print( entry.getValue() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

    }
    // Calculate sum and average
    int sum = 0;
    Set<Map.Entry<String, Integer>> entries = mapData.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      sum += entry.getValue();
    }
    double average = (double) sum / entries.size();
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><strong>Total</strong></td>\r\n");
      out.write("    <td>");
      out.print( sum );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><strong>Average</strong></td>\r\n");
      out.write("    <td>");
      out.print( average );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  } else {
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\">No map data available.</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

    }
  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}