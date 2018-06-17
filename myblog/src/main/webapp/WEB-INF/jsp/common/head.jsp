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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<script>
	$(document).ready(function(){
	    $(document).off('click.bs.dropdown.data-api');
	});
</script>
<div class="row bg">
			<nav class="navbar <!--navbar-default--> navbar-fixed-top bg">
				<div class="container-fluid">
					<!--导航-->
					<div class="col-md-6">
						<ul class="nav nav-tabs myblog-boder" id="headNav">
							<li><a class="dropdown-toggle" href="/">首页</a></li>
						</ul>
							<script>
							//动态获得导航条
							$(function(){
								// alert("sucess")
								$.ajax({  
									type:'get',  
									url:'<%=basePath%>articleCat/getAllArtiCat',  
									// data:$("#myform").serialize(),  
									// cache:false,  
									dataType:'json',  
									success:function(data){  
										//遍历大类别
										if(data.status==200)
											$.each(data.data,function(n,item){
												var temp1 = `
												           <li role="presentation" class="dropdown">
												           	<a class="dropdown-toggle" data-toggle="dropdown" href="`+item.url+`" role="button" aria-haspopup="true" aria-expanded="false">
												           		`+item.name+`<span class="caret"></span>
												           	</a>
												           	<ul class="dropdown-menu">`;
												var temp2 = "";
												<!--遍历小类别-->
												$.each(item.chilren,function(m,subitem){
														temp2 += `<li><a href="`+subitem.url+`">`+subitem.name+`</a></li>`;
												})
												temp = temp1 + temp2 + `</ul></li>`;
												$("#headNav").append(temp);					 
											}
											)
									}  
								});  
							});
							</script>

					</div>
					<!--搜索框-->
					<div class="col-md-3">
						<div style="float: right;">
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
						</div>
					</div>
					
					<!--状态栏-->
					<div class="col-md-3" align="center">
						<div style="float: right;">
							<ul class="nav nav-tabs myblog-boder" id="headNav">
								<c:if test="${sessionScope.user ==null}">
										<li><a class="font-white" href="<%=basePath%>article/writeArticle">写博客</a></li>
										<li><a class="font-white" href="#">个人信息</a></li>
								</c:if>
								<c:if test="${sessionScope.user !=null}">
									<li><a href="article/writeArticle">写博客</a></li>
									<li><a href="#">个人信息</a></li>
								</c:if>
							<!--	<c:if test="${sessionScope.user ==null}">
									<li><button type="button" class="btn btn-default navbar-btn">Sign in</button></li>
								</c:if>-->
							</ul>
						</div>
					</div>
				</div>
			</nav>
</div>
<div class="row">
		<div style="height:200px;margin-top:50px;">
		</div>
</div>
</body>
</html>