<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<form method="post" action="gugu_result">
		단을 입력하세요 <input type="text" name="dan"><br/>
		<button type="submit">입력완료</button>
	</form>
	<br>
	${requestScope.re}
</body>
</html>