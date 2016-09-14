<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<form name="LoginForm" method="post" action="controller">
		<input type="hidden" name="command" value="login"/>
		 E-mail:<br />
		  <input type="text" name="login" value="" />
		  <br/>Password<br/> 
		  <input type="password" name="password" value="" />
			<br/>
		${errorLoginPassMessage}
		<br/>
		${wrongAction}
		<br/>
		${nullPage}
		<br/>
		<input type="submit" value="Log in"/>
	</form>
</body>
</html>