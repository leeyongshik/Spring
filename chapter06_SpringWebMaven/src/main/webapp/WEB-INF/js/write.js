	$(function () {
		$('#writeBtn').click(function () {
			var name = $('input[name="name"]').val();
			var id = $('input[name="id"]').val();
			var pwd = $('input[name="pwd"]').val();
			
			$('#nameDiv').text('');
			$('#idDiv').text('');
			$('#pwdDiv').text('');
			
			 if(name=='') {
			 	$('#nameDiv').text('이름을 입력하세요.');
			 	$('input[name="name"]').focus();
			 }
			 else if(id=='') {
			 	$('#idDiv').text('아이디를 입력하세요.');
			 	$('input[name="id"]').focus();
			 }
			 else if(pwd=='') {
			 	$('#pwdDiv').text('비밀번호를 입력하세요.');
			 	$('input[name="pwd"]').focus();
			 }
			 else {
			 	$.ajax({
			 		type : 'post',
			 		url : '/chapter06_SpringWebMaven/user/write',
			 		data : $('#writeForm').serialize(),
			 		success: function(){
			 			alert("성공");
			 		},
			 		error : function(err){
			 			console.log(err);
			 		}
			 	});
			 }
		});
		
		$('input[name="id"]').focusout(function(){
		
			if($('input[name="id"]').val() == ''){
				$('#idDiv').text('먼저 아이디를 입력하세요.')
			}else 
				$.ajax({
					type: 'post',
					url: '/chapter06_SpringWebMaven/user/checkId',
					data : 'id='+$('#id').val(),
					dataType : 'text',
					success: function(data){
						alert(data)
					},
					error : function(err){
						console.log(err);
					}
				});
		});
	});