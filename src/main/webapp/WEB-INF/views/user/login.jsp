
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	
	<form action="/user/confirm" method="post">
		<div >
			ID: <input type="text" name="id"  />
	 	</div>
	 	<div>
			Password: <input type="text" name="pw"  />
	 	</div>
	 	
		<button type="submit">SUBMIT</button>
	</form>
	
</body>
</html>