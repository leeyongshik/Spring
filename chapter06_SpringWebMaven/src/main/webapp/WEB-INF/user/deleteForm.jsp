<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><img alt="" src="../img/222.gif" width="100" height="100" style="cursor: pointer;" onclick="location.href='../'">회원정보수정</h1>
<hr>
<table border="1">
	<tr>
		<td width="200" align="center">삭제 할 아이디 입력</td>
		<td>
			<input type="text" name="deleteName" id="deleteName">
			<input type="button" id="deletehBtn" value="검색">
			<div id="deleteNameDiv"></div>
		</td>
	</tr>
</table><br><br>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<!-- <script type="text/javascript" src="../js/updateForm.js"></script> -->
<script type="text/javascript">
$(function () {
	<!-- 아이디 찾기 -->
	$('#deletehBtn').click(function () {
		$('#deleteNameDiv').empty();
		
		$.ajax({
			type : 'post',
			url : '/chapter06_SpringWebMaven/user/delete',
			data : 'id='+$('#deleteName').val(),
			//dataType : 'json',
			//서버에서 받아오는 데이터 타입은 'text','html','xml','json' 형식을 지정할 수 있다.
			// getUser 에서 id를 찾으면 제대로 JSON 으로 오지만
			// id가 없으면 JSON 형식으로 오지 못한다.
			//그래서 dataType 를 생략한다. (dataType를 생략하면 알아서 리턴한다)
			success : function (data) {
				//alert(JSON.stringify(data));
				if(data == ""){
						$('#deleteNameDiv').text('찾고자하는 아이디가 없습니다.')
					}
				else{
					alert("삭제되었습니다.");]
					
				}
			},error : function (err) {
				console.log(err);
			}
		});//$.ajax
	});
})

</script>
</body>
</html>