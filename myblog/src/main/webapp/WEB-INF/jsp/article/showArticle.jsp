<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
		<ul  id="article_List" class="article_List">
				<script>
					$(function(){
						$.ajax({  
							type:'get',  
							url:'${pageContext.request.contextPath}/json/article.json',  
							dataType:'json',  
							success:function(data){  
								//遍历大类别class="list-group-item"
									$.each(data,function(n,item){
											var temp = 	`<li  >
															<div class="container-fluid">
																<div class="row article_row">
																<div class="col-md-3 article_img_div">
																	<img class="article_img" src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg"/>
																</div>
																<div class="col-md-9" style="position: relative;">
																	<div>
																		<h4><a href="article/showOneArtilce?articleId=`+item.id+`">`+item.title+`</a></h4>
																	</div>
																	<div>
																		<p>`+item.content+`</p>
																	</div>
																	<!--<div class="article_foot">-->
																		<div class="article_foot_articleCatName"><span>`+item.articleCatName+`</span></div>
																		<div class="article_foot_created"><span>`+item.useName+item.created+`</span></div>
																	<!--<div>-->
																</div>
															</div>
														</li>`
											$("#article_List").append(temp)
										}
									)
							}  
						});  
					});
				</script>
		</ul>
		<nav aria-label="Page navigation" style="text-align: center;">
		  <ul class="pagination">
			<li>
			  <a href="#" aria-label="Previous">
				<span aria-hidden="true">&laquo;</span>
			  </a>
			</li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li>
			  <a href="#" aria-label="Next">
				<span aria-hidden="true">&raquo;</span>
			  </a>
			</li>
		  </ul>
		</nav>
</body>
</html>