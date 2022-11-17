<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="result.do" method="get">
x : <input type="text" name="x"><br>
y : <input type="text" name="y"><br>
<input type="submit" value="get방식 계산">
</form>
<br><br><br><br><br><br><br><br><br>
<form action="result2.do" method="post">
x : <input type="text" name="x"><br>
y : <input type="text" name="y"><br>
<input type="submit" value="post방식 계산">
</form>
</body>
</html>