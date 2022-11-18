<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div{
	color: red;
	font-size: 8pt;
	font-weight: bold;
	
}
</style>
</head>
<body>

<h1><img alt="" src="../img/222.gif" width="100" height="100">회원가입</h1>
<hr>
<form id="writeForm" action="" method="post">
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<td>이름</td>
			<td>
			<input type="text" name="name">
			<div id="nameDiv"></div>
			</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td>
			<input type="text" name="id" id="id">
			<div id="idDiv"></div>
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
			<input type="text" name="pwd">
			<div id="pwdDiv"></div>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="등록" id="writeBtn">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</body>
</html>