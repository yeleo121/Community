<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>大杂烩</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar">
						<span class="sr-only">切换导航</span> 
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">大杂烩</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a data-toggle="modal" data-target="#register"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
						<li><a data-toggle="modal" data-target="#login"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
					</ul>
				</div>
			</div>
		</nav>
		
		<div class="modal fade" id="register" tabindex="-1" role="dialog" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title"><center>注册新用户</center></h4>
		            </div>
		            <div class="modal-body">
						<form class="form-horizontal" role="form" action="Account" method="post">
							<div class="form-group">
								<label for="email" class="col-sm-2 control-label">邮箱</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="email">
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="password">
								</div>
							</div>
							<div class="form-group">
								<label for="confirmation" class="col-sm-2 control-label">确认密码</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="password">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-9">
									<button type="submit" class="btn btn-primary">注册</button>
									<a class="btn btn-default pull-right">已有帐号，前往登录</a>
								</div>
							</div>
						</form>
					</div>
		        </div>
		    </div>
		</div>
		
		<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title"><center>登入帐号</center></h4>
		            </div>
		            <div class="modal-body">
						<form class="form-horizontal" role="form" action="/account/login" method="post">
							<div class="form-group">
								<label for="email" class="col-sm-2 control-label">邮箱</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="email">
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="password">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label> <input type="checkbox">请记住我
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-9">
									<button type="submit" class="btn btn-primary">注册</button>
									<a class="btn btn-default">已有帐号，前往登录</a>
									<a class="btn btn-danger pull-right">忘记密码——></a>
								</div>
							</div>
						</form>
					</div>
		        </div>
		    </div>
		</div>
	</body>
</html>