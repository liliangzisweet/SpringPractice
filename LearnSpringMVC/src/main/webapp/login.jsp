<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<form action="/LearnSpringMVC/api/hello/user/login2" method="post">
		<p>
			用户名：<input name="username" type="text" />
		</p>
		<p>
			密码：<input type="password" name="password">
		</p>
		<p>
			<input type="submit" value="submit" />
		</p>
	</form>
</body>
</html>