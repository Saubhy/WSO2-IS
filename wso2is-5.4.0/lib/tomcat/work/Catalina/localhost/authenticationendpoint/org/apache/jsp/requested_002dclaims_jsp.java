/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2018-02-05 05:15:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.identity.application.authentication.endpoint.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import org.owasp.encoder.Encode;
import java.util.Map;
import java.util.List;
import org.wso2.carbon.identity.application.authentication.endpoint.util.TenantDataManager;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.core.util.IdentityCoreConstants;

public final class requested_002dclaims_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      boolean _jspx_th_fmt_005fbundle_005f0_reused = false;
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /requested-claims.jsp(31,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fbundle_005f0);
          }
          do {
            out.write("\n");
            out.write("\n");
            out.write("    ");

        String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale());

        String[] missingClaimList = null;
        String appName = null;
        Boolean isFederated = false;
        if (request.getParameter(Constants.MISSING_CLAIMS) != null) {
            missingClaimList = request.getParameter(Constants.MISSING_CLAIMS).split(",");
        }
        if (request.getParameter(Constants.REQUEST_PARAM_SP) != null) {
            appName = request.getParameter(Constants.REQUEST_PARAM_SP);
        }

    
            out.write("\n");
            out.write("\n");
            out.write("    <script>\n");
            out.write("    </script>\n");
            out.write("\n");
            out.write("    <html>\n");
            out.write("    <head>\n");
            out.write("        <meta charset=\"utf-8\">\n");
            out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
            out.write("\n");
            out.write("\n");
            out.write("        <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
            out.write("        <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
            out.write("        <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
            out.write("        <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
            out.write("\n");
            out.write("        <!--[if lt IE 9]>\n");
            out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
            out.write("        <script src=\"js/respond.min.js\"></script>\n");
            out.write("        <![endif]-->\n");
            out.write("    </head>\n");
            out.write("\n");
            out.write("    <body>\n");
            out.write("\n");
            out.write("\t<!-- header -->\n");
            out.write("    <header class=\"header header-default\">\n");
            out.write("        <div class=\"container-fluid\"><br></div>\n");
            out.write("        <div class=\"container-fluid\">\n");
            out.write("            <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
            out.write("                <a href=\"#\">\n");
            out.write("                    <img src=\"images/logo-inverse.svg\" alt=\"wso2\" title=\"wso2\" class=\"logo\">\n");
            out.write("\n");
            out.write("                    <h1><em>Identity Server</em></h1>\n");
            out.write("                </a>\n");
            out.write("            </div>\n");
            out.write("        </div>\n");
            out.write("    </header>\n");
            out.write("<div class=\"container-fluid body-wrapper\">\n");
            out.write("\n");
            out.write("        <div class=\"row\">\n");
            out.write("            <!-- content -->\n");
            out.write("            <div class=\"col-xs-12 col-sm-10 col-md-8 col-lg-5 col-centered wr-login\">\n");
            out.write("                <form action=\"../commonauth\" method=\"post\" id=\"claimForm\">\n");
            out.write("                    <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\"> Provide Mandatory Details</h2>\n");
            out.write("\n");
            out.write("                    <div class=\"clearfix\"></div>\n");
            out.write("                    <div class=\"boarder-all \">\n");
            out.write("\n");
            out.write("\t\t\t<div class=\"padding-double font-large\">You are trying to login to ");
            out.print(appName);
            out.write(" application, but it needs following information filled in the user profile.\n");
            out.write("\t\t\tYou can fill those below and proceed with the authentication. But it is advised to fill these information in your Identity Provider profile in order to avoid this step every time you login</div>\n");
            out.write("\n");
            out.write("                        <!-- validation -->\n");
            out.write("                        <div class=\"padding-double\">\n");
            out.write("\t\t\t\t");
 for (String claim : missingClaimList) { 
            out.write("\n");
            out.write("\t\t\t\t    <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 form-group required\">\n");
            out.write("\t\t\t                <label class=\"control-label\">");
            out.print(claim);
            out.write("</label>\n");
            out.write("\t\t\t                <input type=\"text\" name=\"claim_mand_");
            out.print(claim);
            out.write("\" id=\"claim_mand_");
            out.print(claim);
            out.write("\" class=\"form-control\" required=\"required\">\n");
            out.write("\t\t\t            </div>\n");
            out.write("                            \t");
}
            out.write("\n");
            out.write("                        <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group\">\n");
            out.write("                            <input type=\"hidden\" name=\"sessionDataKey\" value='");
            out.print(Encode.forHtmlAttribute
                                (request.getParameter("sessionDataKey")));
            out.write("'/>\n");
            out.write("                        </div>\n");
            out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group\">\n");
            out.write("                                <br/>\n");
            out.write("\t\t                        <button class=\"wr-btn grey-bg col-xs-12 col-md-12 col-lg-12 uppercase font-extra-large\"\n");
            out.write("\t\t\t\t\t    type=\"submit\">Submit\n");
            out.write("\t\t\t\t    \t</button>\n");
            out.write("                            \t</div>\n");
            out.write("                            \n");
            out.write("                            <div class=\"clearfix\"></div>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
            out.write("                </form>\n");
            out.write("            </div>\n");
            out.write("        </div>\n");
            out.write("        <!-- /content/body -->\n");
            out.write("\n");
            out.write("    </div>\n");
            out.write("\n");
            out.write("    <!-- footer -->\n");
            out.write("    <footer class=\"footer\">\n");
            out.write("        <div class=\"container-fluid\">\n");
            out.write("            <p>WSO2 Identity Server | &copy;\n");
            out.write("                <script>document.write(new Date().getFullYear());</script>\n");
            out.write("                <a href=\"http://wso2.com/\" target=\"_blank\"><i class=\"icon fw fw-wso2\"></i> Inc</a>. All Rights Reserved.\n");
            out.write("            </p>\n");
            out.write("        </div>\n");
            out.write("    </footer>\n");
            out.write("\n");
            out.write("    <script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
            out.write("    <script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
            out.write("\n");
            out.write("    <script>\n");
            out.write("        $(document).ready(function () {\n");
            out.write("            $('.main-link').click(function () {\n");
            out.write("                $('.main-link').next().hide();\n");
            out.write("                $(this).next().toggle('fast');\n");
            out.write("                var w = $(document).width();\n");
            out.write("                var h = $(document).height();\n");
            out.write("                $('.overlay').css(\"width\", w + \"px\").css(\"height\", h + \"px\").show();\n");
            out.write("            });\n");
            out.write("            $('[data-toggle=\"popover\"]').popover();\n");
            out.write("            $('.overlay').click(function () {\n");
            out.write("                $(this).hide();\n");
            out.write("                $('.main-link').next().hide();\n");
            out.write("            });\n");
            out.write("\n");
            out.write("\n");
            out.write("        });\n");
            out.write("\n");
            out.write("        $('#popover').popover({\n");
            out.write("            html: true,\n");
            out.write("            title: function () {\n");
            out.write("                return $(\"#popover-head\").html();\n");
            out.write("            },\n");
            out.write("            content: function () {\n");
            out.write("                return $(\"#popover-content\").html();\n");
            out.write("            }\n");
            out.write("        });\n");
            out.write("\n");
            out.write("    </script>\n");
            out.write("\n");
            out.write("    </body>\n");
            out.write("    </html>\n");
            out.write("\n");
            out.write("\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        _jspx_th_fmt_005fbundle_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fbundle_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fbundle_005f0_reused);
      }
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
