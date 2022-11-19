<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#updateNameDiv{
	color: red;
	font-size: 8pt;
	font-weight: bold;
	
}
</style>
</head>
<body>
<h1><img alt="" src="../img/222.gif" width="100" height="100" style="cursor: pointer;" onclick="location.href='../'">리스트</h1>
<hr>
<table border="1">
	<tr>
		<td width="200" align="center">수정 할 아이디 입력</td>
		<td>
			<input type="text" name="updateName" id="updateName">
			<input type="button" id="searchBtn" value="검색">
			<div id="updateNameDiv"></div>
		</td>
	</tr>
</table><br><br>




<div id="updateDiv">
	<form id="updateForm" action="" method="post">
		<table border="1" cellpadding="5" cellspacing="0">
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" id="id" readonly="readonly">
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
					<input type="button" value="수정" id="updateBtn">
					<input type="reset" value="취소" id="resetBtn">
				</td>
			</tr>
		</table>
	</form>
</div>



<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<!-- <script type="text/javascript" src="../js/updateForm.js"></script> -->
<script type="text/javascript">
$(function () {
	$('#updateDiv').hide();
	
	
	<!-- 아이디 찾기 -->
	$('#searchBtn').click(function () {
		$('#updateNameDiv').empty();
		
		$.ajax({
			type : 'post',
			url : '/chapter06_SpringWebMaven/user/getUser',
			data : 'id='+$('#updateName').val(),
			//dataType : 'json',
			//서버에서 받아오는 데이터 타입은 'text','html','xml','json' 형식을 지정할 수 있다.
			// getUser 에서 id를 찾으면 제대로 JSON 으로 오지만
			// id가 없으면 JSON 형식으로 오지 못한다.
			//그래서 dataType 를 생략한다. (dataType를 생략하면 알아서 리턴한다)
			success : function (data) {
				//alert(JSON.stringify(data));
				if(data == ""){
						$('#updateDiv').hide();
						$('#updateNameDiv').text('찾고자하는 아이디가 없습니다.')
					}
				else{
					$('#updateDiv').show();
					$('input[name="name"]').val(data.name);
					$('input[name="id"]').val(data.id);
				}
			},error : function (err) {
				console.log(err);
			}
		});//$.ajax
	});
})



//취소버튼
$('#resetBtn').click(function () {
	//강제 이벤트 발생
	$('#searchBtn').trigger('click');
});

</script>
</body>
</html>