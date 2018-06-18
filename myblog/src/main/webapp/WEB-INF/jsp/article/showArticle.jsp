<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="<%=basePath%>js/bootstrap-paginator.js" type="text/javascript">
</script>
</head>
<body>
		<!--根据类目查询-->
		<input type="hidden" id="articleCat" name="articleCat" value=${requestScope.ArtilceCatId}></input>
		<!--博文列表-->
		<ul  id="article_List" class="article_List"></ul>
		<!--分页插件-->
		<ul id="page" style="margin:0 auto;"></ul>
		<script type="text/javascript">
			//抽象出根据ajax请求的结果填充博文列表方法
			function fillArtilceList(data){
				//遍历大类别class="list-group-item"
				$.each(data.rows,function(n,item){
						var temp = 	`<li  >
										<div class="container-fluid">
											<div class="row article_row">
											<div class="col-md-3 article_img_div">
												<img class="article_img" src="`+item.image+`"/>
											</div>
											<div class="col-md-9" style="position: relative;">
												<div>
													<h4><a href="article/showOneArtilce?articleId=`+item.id+`">`+item.title+`</a></h4>
												</div>
												<div>
													<p>`+item.head+`</p>
												</div>
												
													<div class="article_foot_articleCatName"><span>`+item.articleCatName+`</span></div>
													<div class="article_foot_created"><span>`+item.useName+item.created+`</span></div>
												
											</div>
										</div>
									</li>`
						$("#article_List").append(temp)
					}
				)
			}
 			currentPage = 1;
 			totalPages = 1;
			ArtilceCatId = $("#articleCat").val();
			$.ajax({ 
				async:false, 
				type:'post',  
				url:'${pageContext.request.contextPath}/article/getArtilcePage', 
				data: {ArtilceCatId: ArtilceCatId},
				dataType:'json',  
				success:function(data){  
						currentPage = data.currentPage;
						totalPages = data.totalPage;
						<!--填充博文列表-->
						fillArtilceList(data);
				}  
			});  
			
			$('#page').bootstrapPaginator({
			bootstrapMajorVersion: 3,//bootstrap版本
			currentPage: currentPage,//当前页码
			totalPages: totalPages,//总页数（后台传过来的数据）
			numberOfPages: 5,//一页显示几个按钮
			itemTexts: function (type, page, current) {
			 switch (type) {
				case "first": return "首页";
				case "prev": return "上一页";
				case "next": return "下一页";
				case "last": return "末页";
				case "page": return page;
			 }
			},//改写分页按钮字样
			onPageClicked: function (event, originalEvent, type, page) {
			 $.ajax({
				url: '${pageContext.request.contextPath}/article/getArtilcePage',
				type: 'post',
				data: {page: page},
				dataType: 'json',
				success: function (data) {
				 // tplData(data);//处理成功返回的数据
				  $("#article_List").empty();
					<!--填充博文列表-->
					fillArtilceList(data);
				}
			 });
			}
		 });
		</script>
</body>
</html>