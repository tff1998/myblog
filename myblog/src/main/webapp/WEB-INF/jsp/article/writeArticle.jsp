<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";
%>
<html>
<head>
  <meta charset="utf-8">
	<link href="<%=basePath%>css/bootstrap.css"  rel="stylesheet"/>
	<link href="<%=basePath%>css/myblog.css"  rel="stylesheet"/>
	<script src="<%=basePath%>js/jquery.min.js" type="text/javascript">
	</script>
	<script src="<%=basePath%>js/bootstrap.js" type="text/javascript">
	</script>
	<script src="<%=basePath%>js/myblog.js" type="text/javascript">
	</script>
	<script src="<%=basePath%>/ueditor/ueditor.config.js" type="text/javascript">
	</script>
	<script src="<%=basePath%>/ueditor/ueditor.all.js" type="text/javascript">
	</script>
</head>
<script>
// 抽象出获得类目的ajax方法
function ajaxGetArticleCat(elementId,parentId){
	$.ajax({  
		type:'get',  
		url:'${pageContext.request.contextPath}/articleCat/getArtCatByParentId'+'?parentId='+parentId,  
		dataType:'json',  
		success:function(data){  
			//遍历大类别
			// alert(data.status)
			if(data.status==200){
				$.each(data.data,function(index,item){
					var temp = `<option value=`+item.id+`>`+item.name+`</option>`;
					$("#"+elementId).append(temp)
				})
			}
			if(data.status==500){
				alert("fail")
			}
		}  
	});
}
<!-- 动态加载类目-->
$(function(){
	<!--获得一级类目-->
	ajaxGetArticleCat("oneLevelSelect",'-1');
	<!--选中一级类目后动态获得二级类目-->
	$("#oneLevelSelect").change(function(){
		var options=$("#oneLevelSelect option:selected");
		if('tips' == options.val()){
			alert("该选项不可选，请重新选择")
			$(".alert").alert("该选项不可选，请重新选择")  
		}else{
			$("#twoLevelSelect").empty();
			ajaxGetArticleCat("twoLevelSelect",options.val());
		}
	});
})
</script>
<body>
		<div class="container-fluid">
			<!--head-->
			<jsp:include page="${pageContext.request.contextPath}/WEB-INF/jsp/common/head.jsp"></jsp:include>
			<!--content-->
			<div class="row" style="position: relative;">
					<div style="width: 70%;position: absolute;margin: 0 auto;top: 0; left: 0; bottom: 0; right: 0; ">
															 <!--博文提交表单-->
					    <form action="<%=basePath%>article/addArticle" method="post">
								<div class="input-group" style="position: relative;">
									<span class="input-group-addon" id="sizing-addon2">标题</span>
									<input name="title" type="text" class="form-control" placeholder="Title" aria-describedby="sizing-addon2">
								</div>
								<div class="input-group" style="position: relative;">
										<div class="input-group" style="width: 50%;float: left;">
											<span class="input-group-addon" id="sizing-addon2">一级类目:</span>
											<select id="oneLevelSelect" class="form-control" style="width: 150px;display: inline;">
												<option value="tips">请选择一级类目</option>
											</select>
										</div>
										<div class="input-group" style="width:50%;float: left;">
											<span class="input-group-addon" id="sizing-addon2">二级类目:</span>
											<select name="cid" id="twoLevelSelect" class="form-control" style="width: 150px;display: inline;">
												<option value="tips">请选择2级类目</option>
											</select>
										</div>
								</div>
								<div style="position: relative;float: ;">
									<script id="container" name="content" type="text/plain">
									</script>
								</div>
								<button type="submit" class="btn btn-default">Submit</button>
							</form>
									<script>
										var ue = UE.getEditor('container', {
												toolbars: [
														['fullscreen', 'source', 'undo', 'redo', 'bold','forecolor',
														'backcolor','fontsize','fontfamily','formatmatch','	horizontal','insertimage','insertcode',
														'inserthtml','link','unlink','imagefloat','preview']
												],
												initialFrameHeight:700,
												autoHeightEnabled: true,
												autoFloatEnabled: true
										});
									</script>
			</div>
		</div>
</body>
<script>
UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;  
UE.Editor.prototype.getActionUrl = function(action) {  
    if (action == 'uploadImage') {  
      return 'http://localhost:8081/uploadImage';  //此处改需要把图片上传到哪个Action（Controller）中  
    } else {  
      return this._bkGetActionUrl.call(this, action);  
    }  
  };  
</script>
<script>  
!function(){function n(n,e,t){return n.getAttribute(e)||t}function e(n){return document.getElementsByTagName(n)}function t(){var t=e("script"),o=t.length,i=t[o-1];return{l:o,z:n(i,"zIndex",-1),o:n(i,"opacity",.5),c:n(i,"color","0,0,0"),n:n(i,"count",99)}}function o(){a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight}function i(){r.clearRect(0,0,a,c);var n,e,t,o,m,l;s.forEach(function(i,x){for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||i.y<0?-1:1,r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;e<u.length;e++)n=u[e],null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),t=(n.max-l)/n.max,r.beginPath(),r.lineWidth=t/2,r.strokeStyle="rgba("+d.c+","+(t+.2)+")",r.moveTo(i.x,i.y),r.lineTo(n.x,n.y),r.stroke()))}),x(i)}var a,c,u,m=document.createElement("canvas"),d=t(),l="c_n"+d.l,r=m.getContext("2d"),x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||function(n){window.setTimeout(n,1e3/45)},w=Math.random,y={x:null,y:null,max:2e4};m.id=l,m.style.cssText="position:fixed;top:0;left:0;z-index:"+d.z+";opacity:"+d.o,e("body")[0].appendChild(m),o(),window.onresize=o,window.onmousemove=function(n){n=n||window.event,y.x=n.clientX,y.y=n.clientY},window.onmouseout=function(){y.x=null,y.y=null};for(var s=[],f=0;d.n>f;f++){var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({x:h,y:g,xa:v,ya:p,max:6e3})}u=s.concat([y]),setTimeout(function(){i()},100)}();  
</script>  

</html>