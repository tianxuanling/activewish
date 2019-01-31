package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>Musingtec It Monitor\r\n");
      out.write(" Management</title>\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("a {\r\n");
      out.write("\tcolor: Black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("  <SCRIPT type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#layout_east_calendar').calendar({\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tcurrent : new Date(),\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tonSelect : function(date) {\r\n");
      out.write("\t\t\t\t$(this).calendar('moveTo', new Date());\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</SCRIPT>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body class=\"easyui-layout\" style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("  <!-- 顶部-->\r\n");
      out.write("  <div region=\"north\" border=\"false\" title=\"Musingtec suite\" style=\"BACKGROUND:#E6E6FA;height: 85px; padding: 1px; overflow: hidden;\">\r\n");
      out.write("   <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td align=\"left\" style=\"vertical-align:text-bottom\" >\r\n");
      out.write("      <img src=\"plug-in/login/images/toplogo-main.png\" >\r\n");
      out.write("      <!--\r\n");
      out.write("      <img src=\"plug-in/login/images/toplogo.png\" width=\"550\" height=\"52\" alt=\"\">-->\r\n");
      out.write("     </td>\r\n");
      out.write("     <td align=\"right\" nowrap>\r\n");
      out.write("      <table>\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td valign=\"top\" height=\"50\">\r\n");
      out.write("         <span style=\"color: #CC33FF\">当前用户:</span><span style=\"color: #666633\">(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(") <span style=\"color: #CC33FF\">职务</span>:<span style=\"color: #666633\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("        </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <td>\r\n");
      out.write("        <div style=\"position: absolute; right: 0px; bottom: 0px;\">\r\n");
      out.write("         <a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_kzmbMenu\" iconCls=\"icon-help\">控制面板</a><a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_zxMenu\" iconCls=\"icon-back\">注销</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"layout_north_kzmbMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("         <div onclick=\"openwindow('用户信息','userController.do?userinfo')\">\r\n");
      out.write("          个人信息\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"menu-sep\"></div>\r\n");
      out.write("         <div onclick=\"add('修改密码','userController.do?changepassword')\">\r\n");
      out.write("          修改密码\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"layout_north_zxMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("         <div class=\"menu-sep\"></div>\r\n");
      out.write("         <div onclick=\"exit('loginController.do?logout','确定退出该系统吗 ?',1);\">\r\n");
      out.write("          退出系统\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td align=\"right\">\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- 左侧-->\r\n");
      out.write("  <div region=\"west\" split=\"true\" href=\"loginController.do?left\" title=\"导航菜单\" style=\"width: 150px; padding: 1px;\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- 中间-->\r\n");
      out.write("  <div id=\"mainPanle\" region=\"center\" style=\"overflow: hidden;\">\r\n");
      out.write("   <div id=\"maintabs\" class=\"easyui-tabs\" fit=\"true\" border=\"false\">\r\n");
      out.write("    <div class=\"easyui-tab\" title=\"首页\" href=\"loginController.do?home\" style=\"padding:2px; overflow: hidden;\">\r\n");
      out.write("   \t\t\t\t \r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- 右侧 -->\r\n");
      out.write("  <div collapsed=\"true\"  region=\"east\" iconCls=\"icon-reload\" title=\"辅助工具\" split=\"true\" style=\"width: 190px;\">\r\n");
      out.write("   <div id=\"tabs\"  class=\"easyui-tabs\" border=\"false\" style=\"height: 240px\">\r\n");
      out.write("    <div title=\"日历\" style=\"padding: 0px; overflow: hidden; color: red;\">\r\n");
      out.write("     <div id=\"layout_east_calendar\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div id=\"tabs\" class=\"easyui-tabs\" border=\"false\">\r\n");
      out.write("    <div title=\"在线人员\" style=\"padding: 20px; overflow: hidden; color: red;\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- 底部 -->\r\n");
      out.write("  <div region=\"south\" border=\"false\" style=\"height: 25px; overflow: hidden;\">\r\n");
      out.write("    <div align=\"center\" style=\"color: #CC99FF; padding-top: 2px\">\r\n");
      out.write("    &copy; 版权所有\r\n");
      out.write("     <span class=\"tip\"><a href=\"http://www.jeecg.org\" title=\"JEECG_v3.1 Simple版本\">JEECG_v3.1</a> (推荐谷歌浏览器，获得更快响应速度)  技术支持:<a href=\"#\" title=\"JEECG_v3.1 Simple版本\">JEECG_v3.1</a></span>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"mm\" class=\"easyui-menu\" style=\"width:150px;\">\r\n");
      out.write("        <div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("        <div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("        <div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("        <div class=\"menu-sep\"></div>\r\n");
      out.write("        <div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("        <div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("        \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/main.jsp(9,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /webpage/main/main.jsp(93,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("     <div class=\"easyui-tab\" title=\"地图\" style=\"padding: 1px; overflow: hidden;\">\r\n");
        out.write("      <iframe name=\"myMap\" id=\"myMap\" scrolling=\"no\" frameborder=\"0\" src=\"mapController.do?map\" style=\"width: 100%; height: 99.5%;\"></iframe>\r\n");
        out.write("     </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
