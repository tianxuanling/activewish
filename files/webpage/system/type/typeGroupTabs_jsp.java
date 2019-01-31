package org.apache.jsp.webpage.system.type;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class typeGroupTabs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody.release();
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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_t_005ftabs_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_t_005ftabs_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_005ftabs_005f0 = (org.jeecgframework.tag.core.easyui.TabsTag) _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_005ftabs_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftabs_005f0.setParent(null);
    // /webpage/system/type/typeGroupTabs.jsp(3,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setId("typeGroupTabs");
    // /webpage/system/type/typeGroupTabs.jsp(3,0) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setIframe(false);
    // /webpage/system/type/typeGroupTabs.jsp(3,0) name = tabPosition type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setTabPosition("bottom");
    int _jspx_eval_t_005ftabs_005f0 = _jspx_th_t_005ftabs_005f0.doStartTag();
    if (_jspx_eval_t_005ftabs_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write(' ');
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_005ftabs_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005ftabs_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid.reuse(_jspx_th_t_005ftabs_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid.reuse(_jspx_th_t_005ftabs_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005ftabs_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005ftabs_005f0);
    // /webpage/system/type/typeGroupTabs.jsp(4,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${typegroupList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/system/type/typeGroupTabs.jsp(4,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("typegroup");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_t_005ftab_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('\r');
          out.write('\n');
          out.write(' ');
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_t_005ftab_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_005ftab_005f0 = (org.jeecgframework.tag.core.easyui.TabTag) _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_005ftab_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftab_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/system/type/typeGroupTabs.jsp(5,2) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIframe((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("systemController.do?typeList&typegroupid=${typegroup.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/system/type/typeGroupTabs.jsp(5,2) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIcon("icon-add");
    // /webpage/system/type/typeGroupTabs.jsp(5,2) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${typegroup.typegroupname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/system/type/typeGroupTabs.jsp(5,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${typegroup.typegroupcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005ftab_005f0 = _jspx_th_t_005ftab_005f0.doStartTag();
    if (_jspx_th_t_005ftab_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fiframe_005fid_005ficon_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
    return false;
  }
}
