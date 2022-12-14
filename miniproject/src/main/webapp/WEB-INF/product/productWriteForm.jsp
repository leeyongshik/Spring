<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
ul{
	list-style: none;
}
</style>
</head>
<body>
<div class="container">

	<div class="row" id="loadDataItems"><!-- aJax 데이타 로딩 시작-->
	
		<div class="col-lg-12 col-sm-12 col-md-12">

			<form name='detailePageWriteForm' id='detailePageWriteForm'  method="post" enctype="multipart/form-data">

				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>물품</div>
					<div style='width:85%;float:left'>
						<div style='float:left;width:100%'>
							<input type="text" id="subject" name="subject" placeholder='물품명'>
						</div>		
					</div>
				</div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>
				
				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>카테고리</div>
					<div style='width:85%;float:left'>
						<div style='float:left; width:160px'>
							<select id="category" name="category">
								<option value="">선택하세요</option>
								<option value="1">디지털/가전</option><!--디지털/가전-->
								<option value="2">아웃도어/스포츠</option><!--아웃도어/스포츠-->
								<option value="3">자동차</option><!--자동차-->
								<option value="4">홈/생활</option><!--홈/생활-->
								<option value="5">패션/잡화/뷰티</option><!--패션/잡화/뷰티-->
							</select>
						</div>
						<div style="width:160px;float:left" id="sub_category">  </div>
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>

				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>대표이미지</div>
					<div style='width:85%;float:left'>
						<div style='float:left; width:50px' id='View_area1'></div>
						<div style='float:left; width:210px'>
							<input type="file" id="file" name="file" style='font-size:0.9em' placeholder="이미지1">
						</div>
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>추가이미지</div>
					<div style='width:85%;float:left'>
						<div style='float:left; width:50px' id='View_area5'></div>
						<div style='float:left; width:210px'>
							<ul class="__add"> 
								<li>
									<input type="file" id="QnA03" name="file_path" class="files">
									<button  type="button"class="_add" style="vertical-align: sub">추가</button>
								</li> 
							</ul>
							<!-- <input type="file" class="form-control" id="image5" name="image5"  style='font-size:0.9em' placeholder="이미지5" onchange="previewImage(this,'View_area5')"> -->
						</div>
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>


				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>물품정보</div>
					<div style='width:85%;float:left'>
						<textarea cols="40" rows="5 class="form-control" id="content" name="content" style='min-height:200px' required placeholder="하자를 포함하여 물품정보를 상세하게 입력해주시고, 직거래 시 직거래 가능 지역을 물품정보에 입력하세요."></textarea> 
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>


				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>검색어</div>
					<div style='width:85%;float:left'>
						<div style='float:left;width:100%'>
							<input type="text" id="searchwords" name="searchwords" value=''  class="form-control" placeholder='검색어 사이에 쉼표를 입력해주세요.'>
						</div>		
					</div>
				</div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>희망가</div>
					<div style='width:140px;float:left'>
						<input type="text" class="form-control" id="hopeprice" name="hopeprice" placeholder="희망가 (원)">
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>


				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>시작가</div>
					<div style='width:140px;float:left'>
						<input type="text" class="form-control" id="startprice" name="startprice" placeholder="시작가 (원)">
					</div>									
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>
										  

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>호가</div>
					<div style='width:85%;float:left'>
						<div style='width:140px;float:left'>
							<input type="text" class="form-control" id="unitprice" name="unitprice" placeholder="호가 (원)">
						</div>
						<div style='width:140px;float:left;margin-top:7px;margin-left:15px;'>응찰 시 올리는 금액</div><!--응찰 시 올리는 금액-->	
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>


				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>거래방식</div>
					<div style='width:85%;float:left'>
						<div style='float:left; width:130px'>
							<select id="trade_way" name="trade_way" class="form-control" required >
								<option value="">선택하세요</option>
								<option value="1">직거래</option><!--직거래-->
								<option value="2">택배</option><!--택배-->
							</select>
						</div>
						<div style="width:130px;float:left" id="delfee">  </div>	
					</div>
					
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>


				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>경매종료</div>
					<div style='width:85%;float:left'>
					<div style='width:50%;float:left'>
						<select id="enddays_year" name="enddays_year" class="form-control">
							<option value="">년도선택</option>
							<option value="2022" selected>2022</option>
							<option value="2023">2023</option>
							<option value="2024">2024</option>
						</select>
						<select id="enddays_month" name="enddays_month" class="form-control">
							<option value="">월선택</option>
							<option value="1">1월</option>
							<option value="2">2월</option>
							<option value="3">3월</option>
							<option value="4">4월</option>
							<option value="5">5월</option>
							<option value="6">6월</option>
							<option value="7">7월</option>
							<option value="8">8월</option>
							<option value="9">9월</option>
							<option value="10">10월</option>
							<option value="11">11월</option>
							<option value="12">12월</option>
						</select>
						<input type="text" id="enddays_day" name="enddays_day" placeholder="일 입력" >
						<input type="text" id="enddays_hour" name="enddays_hour" placeholder="시간 입력" >
						<input type="text" id="enddays_min" name="enddays_min" placeholder="분 입력" >
					</div>
					</div>
					
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>

				<div class='sp10'></div>
				<div style='clear:both;font-size:0;height:1px;width:100%;background-color:#eee'></div>
				<div class='sp10'></div>


				<div style='font-size:0.9em;width:100%'>
					<div style='width:15%;float:left'>자동연장</div>
					<div style='width:85%;float:left'>
						<input type='checkbox' id='extend' name='extend' value='Y' checked>  응찰이 없으면 설정한 기간만큼 자동으로 연장됩니다.											
					</div>
					<div style='clear:both;font-size:0;height:1px;width:1px'></div>
				</div>

				<div class="clearfix"></div>
				<hr>
				<div class='sp1'></div>
				<div style='width:100%;'>*사진업로드와 변환에 잠깐 시간이 걸립니다.<br>&nbsp;&nbsp;등록버튼 클릭후 잠시만 기다려주세요.</div>
				<div class='sp10'></div>
				<div align='center'>
					<input type="button" value="경매등록" id="productWriteBtn">
				</div>

				<div class="clearfix"></div>
		</form>
			
		</div>
		<div class='sp20'></div>
	</div> <!-- row -->
</div><!--</container>-->

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.3.0/jquery.form.min.js" integrity="sha384-qlmct0AOBiA2VPZkMY3+2WqkHtIQ9lSdAsAn5RUJD/3vA5MKDgSGcdmIv4ycVxyn" crossorigin="anonymous"></script>
<script type="text/javascript">

/* 파일 업로드 추가 */
var maxAppend = 1;

$('.__add ._add').on('click',function(){ 
   if(maxAppend >= 3){
      alert("파일 업로드 최대 개수는 3개 입니다.");
      return;
   }else{
       $('.__add').append('<li><input type="file" name="file_path" class="files"> <button type="button" class="_add" onclick="addDel(this);">삭제</button></li>'); 
       maxAppend ++;
   }
   
 });
 
 function addDel(a){ 
    $(a).closest('li').remove(); 
    maxAppend --;
 }
 
 /* 글쓰기 버튼 */
 $('#productWriteBtn').click(function(){
	
		
		$('#detailePageWriteForm').ajaxSubmit({
			url : '/miniproject/product/productWrite',
			type : 'post',
			processData: false,
			contentType: false, 
			data : $('#detailePageWriteForm').serialize(),// 주소창과 같이 데이터 담기
			success: function(){
					alert("글작성 완료");
				},
				error : function(err){
					console.log(err);
				}
		});
		
	
});
 
</script>
</body>
</html>