package org.apache.jsp.webpage.system.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>用户信息</title>\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </head>\r\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </body>");
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
    // /webpage/system/user/changepassword.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/system/user/changepassword.jsp(10,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/system/user/changepassword.jsp(10,2) name = refresh type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setRefresh(new Boolean(false));
    // /webpage/system/user/changepassword.jsp(10,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/system/user/changepassword.jsp(10,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("userController.do?savenewpwd");
    // /webpage/system/user/changepassword.jsp(10,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/system/user/changepassword.jsp(10,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   <input id=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("   <table style=\"width: 550px\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("    <tbody>\r\n");
        out.write("     <tr>\r\n");
        out.write("      <td align=\"right\" width=\"10%\">\r\n");
        out.write("       <span class=\"filedzt\">原密码:</span>\r\n");
        out.write("      </td>\r\n");
        out.write("      <td class=\"value\">\r\n");
        out.write("       <input type=\"password\" value=\"\" name=\"password\" class=\"inputxt\" datatype=\"*\" errormsg=\"请输入原密码\" />\r\n");
        out.write("       <span class=\"Validform_checktip\">\r\n");
        out.write("        请输入原密码\r\n");
        out.write("       </span>\r\n");
        out.write("      </td>\r\n");
        out.write("     </tr>\r\n");
        out.write("     <tr>\r\n");
        out.write("      <td align=\"right\">\r\n");
        out.write("       <span class=\"filedzt\">新密码:</span>\r\n");
        out.write("      </td>\r\n");
        out.write("      <td class=\"value\">\r\n");
        out.write("       <input type=\"password\" value=\"\" name=\"newpassword\" class=\"inputxt\" plugin=\"passwordStrength\" datatype=\"*6-18\" errormsg=\"密码至少6个字符,最多18个字符！\" />\r\n");
        out.write("       <span class=\"Validform_checktip\">\r\n");
        out.write("        密码至少6个字符,最多18个字符！\r\n");
        out.write("       </span>\r\n");
        out.write("       <span class=\"passwordStrength\" style=\"display: none;\">\r\n");
        out.write("        <b>密码强度：</b>\r\n");
        out.write("        <span>弱</span><span>中</span><span class=\"last\">强</span>\r\n");
        out.write("       </span>\r\n");
        out.write("      </td>\r\n");
        out.write("     </tr>\r\n");
        out.write("     <tr>\r\n");
        out.write("      <td align=\"right\">\r\n");
        out.write("       <span class=\"filedzt\">重复密码:</span>\r\n");
        out.write("      </td>\r\n");
        out.write("      <td class=\"value\">\r\n");
        out.write("       <input id=\"newpassword\" type=\"password\" recheck=\"newpassword\" datatype=\"*6-18\" errormsg=\"两次输入的密码不一致！\">\r\n");
        out.write("       <span class=\"Validform_checktip\"></span>\r\n");
        out.write("      </td>\r\n");
        out.write("     </tr>\r\n");
        out.write("    </tbody>\r\n");
        out.write("   </table>\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005frefresh_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }
}
