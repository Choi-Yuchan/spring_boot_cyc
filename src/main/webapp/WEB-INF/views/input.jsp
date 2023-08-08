
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/grade" method="get">
	 	<div>
		Kor: <input type="text" name="kor"  />
	 	</div>
	 	<div>
		Eng: <input type="text" name="eng"  />
	 	</div>
	 	<div>
		Math: <input type="text" name="math"  />
	 	</div>
		<button type="submit">SUBMIT</button>
	</form>
</body>
</html>