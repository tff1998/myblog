<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
	<link href="css/bootstrap.css"  rel="stylesheet"/>
	<link href="css/myblog.css"  rel="stylesheet"/>
	<script src="js/jquery.min.js" type="text/javascript">
	</script>
	<script src="js/bootstrap.js" type="text/javascript">
	</script>
	<script src="js/myblog.js" type="text/javascript">
	</script>
</head>
<body>
	<div class="container-fluid">
		<!--顶部-->
		<div class="row">
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container-fluid">
					<!--导航-->
					<div class="col-md-6">
						<ul class="nav nav-tabs myblog-boder">
							...
							<li role="presentation" class="dropdown">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
									Dropdown <span class="caret"></span>
								</a>
								<ul class="dropdown-menu">
									...
								</ul>
							</li>
							...
						</ul>
					</div>
					<!--搜索框-->
					<div class="col-md-3">
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
					</div>
					<!--状态栏-->
					<div class="col-md-3" align="center">
						<div class="dropdown">
							<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								Dropdown
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul>
						</div>
					</div>
				</div>
			</nav>
		</div>
	
	
		<!--content-->
		<div class="row" style="margin-top: 50px ;">
			<!--博文列表-->
			<div class="col-md-9">
				<ul class="list-group">
						<li class="list-group-item">
							<h5>标题标题</h1>
							<div class="container-fluid">
								<div class="col-md-4">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" style="width:100px;height:100px;"/>
								</div>
								<div class="col-md-8">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" style="width:100px;height:100px;"/>
								</div>
							</div>
						</li>
	<li class="list-group-item">
							<h4>标题标题</h1>
							<div class="container-fluid">
								
	
								<div class="col-md-4" style="height: 200px;">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
								<div class="col-md-8">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
							</div>
						</li>	<li class="list-group-item">
							<h4>标题标题</h1>
							<div class="container-fluid">
								
	
								<div class="col-md-4" style="height: 200px;">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
								<div class="col-md-8">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
							</div>
						</li>	<li class="list-group-item">
							<h4>标题标题</h1>
							<div class="container-fluid">
								
	
								<div class="col-md-4" style="height: 200px;">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
								<div class="col-md-8">
									<img src="http://v3.bootcss.com/assets/img/tanzhouedu.jpg" />
								</div>
							</div>
						</li>
						
						<li class="list-group-item">免费 Window 空间托管</li>
						<li class="list-group-item">图像的数量</li>
						<li class="list-group-item">24*7 支持</li>
						<li class="list-group-item">每年更新成本</li>
						
				</ul>
			</div>
			<!--推荐博文及其他-->
			<div class="col-md-3 col-md-offset-9" style="position: fixed;">
				<ul class="list-group">
					<li class="list-group-item">免费域名注册</li>
					<li class="list-group-item">免费 Window 空间托管</li>
					<li class="list-group-item">图像的数量</li>
					<li class="list-group-item">24*7 支持</li>
					<li class="list-group-item">每年更新成本</li>
				</ul>
			</div>
		</div>
</div>
</body>
</html>