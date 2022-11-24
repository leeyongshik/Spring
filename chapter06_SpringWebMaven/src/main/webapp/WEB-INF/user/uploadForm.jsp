<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#img{
	visibility: hidden;
}
</style>
</head>
<body>
<!-- 단순 submit -->
<form action="/chapter06_SpringWebMaven/user/upload" method="post" enctype="multipart/form-data">
	
	<!-- <input type="file" id="upload" name="upload"> -->
	<!-- <input type="file" name="img[]" multiple="multiple"> -->
	<input type="file" name="img"><br>
	<input type="file" name="img"><!-- name="img" 를 똑같이 주어야 한다. -->
	<br><br>
	<h4>한번에 여러개 파일 선택 : </h4>
	<img alt="카메라" src="../img/camera.png" id="camera" width="50" height="40">
	<input type="file" name="img[]" id="img" multiple="multiple"> 
	<br>
	<input type="submit" value="업로드" id="uploadBtn" style="margin-top: 10px;">
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
	$('#camera').click(function () {
		$('#img').trigger('click');
	});
</script>

<!-- Ajax 통신 -->


</body>
</html>