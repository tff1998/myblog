/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-18 14:46:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.css\"  rel=\"stylesheet\"/>\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/myblog.css\"  rel=\"stylesheet\"/>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/jquery.min.js\" type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/bootstrap.js\" type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/myblog.js\" type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("/ueditor/ueditor.config.js\" type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("/ueditor/ueditor.all.js\" type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("// 抽象出获得类目的ajax方法\r\n");
      out.write("function ajaxGetArticleCat(elementId,parentId){\r\n");
      out.write("\t$.ajax({  \r\n");
      out.write("\t\ttype:'get',  \r\n");
      out.write("\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/articleCat/getArtCatByParentId'+'?parentId='+parentId,  \r\n");
      out.write("\t\tdataType:'json',  \r\n");
      out.write("\t\tsuccess:function(data){  \r\n");
      out.write("\t\t\t//遍历大类别\r\n");
      out.write("\t\t\t// alert(data.status)\r\n");
      out.write("\t\t\tif(data.status==200){\r\n");
      out.write("\t\t\t\t$.each(data.data,function(index,item){\r\n");
      out.write("\t\t\t\t\tvar temp = `<option value=`+item.id+`>`+item.name+`</option>`;\r\n");
      out.write("\t\t\t\t\t$(\"#\"+elementId).append(temp)\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(data.status==500){\r\n");
      out.write("\t\t\t\talert(\"fail\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}  \r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("<!-- 动态加载类目-->\r\n");
      out.write("$(function(){\r\n");
      out.write("\t<!--获得一级类目-->\r\n");
      out.write("\tajaxGetArticleCat(\"oneLevelSelect\",'-1');\r\n");
      out.write("\t<!--选中一级类目后动态获得二级类目-->\r\n");
      out.write("\t$(\"#oneLevelSelect\").change(function(){\r\n");
      out.write("\t\tvar options=$(\"#oneLevelSelect option:selected\");\r\n");
      out.write("\t\tif('tips' == options.val()){\r\n");
      out.write("\t\t\talert(\"该选项不可选，请重新选择\")\r\n");
      out.write("\t\t\t$(\".alert\").alert(\"该选项不可选，请重新选择\")  \r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#twoLevelSelect\").empty();\r\n");
      out.write("\t\t\tajaxGetArticleCat(\"twoLevelSelect\",options.val());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!--head-->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/WEB-INF/jsp/common/head.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\r\n");
      out.write("\t\t\t<!--content-->\r\n");
      out.write("\t\t\t<div class=\"row\" style=\"position: relative;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 70%;position: absolute;margin: 0 auto;top: 0; left: 0; bottom: 0; right: 0; \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t <!--博文提交表单-->\r\n");
      out.write("\t\t\t\t\t    <form action=\"");
      out.print(basePath);
      out.write("article/addArticle\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"position: relative;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"sizing-addon2\">标题</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"title\" type=\"text\" class=\"form-control\" placeholder=\"Title\" aria-describedby=\"sizing-addon2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"position: relative;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"width: 50%;float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"sizing-addon2\">一级类目:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"oneLevelSelect\" class=\"form-control\" style=\"width: 150px;display: inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"tips\">请选择一级类目</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"width:50%;float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"sizing-addon2\">二级类目:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"cid\" id=\"twoLevelSelect\" class=\"form-control\" style=\"width: 150px;display: inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"tips\">请选择2级类目</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"position: relative;float: ;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script id=\"container\" name=\"content\" type=\"text/plain\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar ue = UE.getEditor('container', {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttoolbars: [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t['fullscreen', 'source', 'undo', 'redo', 'bold','forecolor',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'backcolor','fontsize','fontfamily','formatmatch','\thorizontal','insertimage','insertcode',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'inserthtml','link','unlink','imagefloat','preview']\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tinitialFrameHeight:700,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tautoHeightEnabled: true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tautoFloatEnabled: true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;  \r\n");
      out.write("UE.Editor.prototype.getActionUrl = function(action) {  \r\n");
      out.write("    if (action == 'uploadImage') {  \r\n");
      out.write("      return 'http://localhost:8081/uploadImage';  //此处改需要把图片上传到哪个Action（Controller）中  \r\n");
      out.write("    } else {  \r\n");
      out.write("      return this._bkGetActionUrl.call(this, action);  \r\n");
      out.write("    }  \r\n");
      out.write("  };  \r\n");
      out.write("</script>\r\n");
      out.write("<script>  \r\n");
      out.write("!function(){function n(n,e,t){return n.getAttribute(e)||t}function e(n){return document.getElementsByTagName(n)}function t(){var t=e(\"script\"),o=t.length,i=t[o-1];return{l:o,z:n(i,\"zIndex\",-1),o:n(i,\"opacity\",.5),c:n(i,\"color\",\"0,0,0\"),n:n(i,\"count\",99)}}function o(){a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight}function i(){r.clearRect(0,0,a,c);var n,e,t,o,m,l;s.forEach(function(i,x){for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||i.y<0?-1:1,r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;e<u.length;e++)n=u[e],null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),t=(n.max-l)/n.max,r.beginPath(),r.lineWidth=t/2,r.strokeStyle=\"rgba(\"+d.c+\",\"+(t+.2)+\")\",r.moveTo(i.x,i.y),r.lineTo(n.x,n.y),r.stroke()))}),x(i)}var a,c,u,m=document.createElement(\"canvas\"),d=t(),l=\"c_n\"+d.l,r=m.getContext(\"2d\"),x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||function(n){window.setTimeout(n,1e3/45)},w=Math.random,y={x:null,y:null,max:2e4};m.id=l,m.style.cssText=\"position:fixed;top:0;left:0;z-index:\"+d.z+\";opacity:\"+d.o,e(\"body\")[0].appendChild(m),o(),window.onresize=o,window.onmousemove=function(n){n=n||window.event,y.x=n.clientX,y.y=n.clientY},window.onmouseout=function(){y.x=null,y.y=null};for(var s=[],f=0;d.n>f;f++){var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({x:h,y:g,xa:v,ya:p,max:6e3})}u=s.concat([y]),setTimeout(function(){i()},100)}();  \r\n");
      out.write("</script>  \r\n");
      out.write("\r\n");
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
