<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>LED제어 서버</h2>
		<div class="panel panel-default">
			<div class="panel-heading">LDE제어 Form</div>
			<div class="panel-body">
					<table class="table table-condensed">
						<tr>
							<td>
									<label for="email">LED 제어 값 입력:</label> 
									<input min="0" max="1" value="0" type="number" id="mysensor">
									<button id="ledCheck" type="button" class= "btn btn-default">전송</button>
							</td>
						</tr>
					</table>
					<p id="result"></p>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	
	
	$(function(){ 
		$.ajax({
			url : "GetSensor",
			type : "get",
			dataType : "json",
			success : function(data){
				$('#result').html("현재 LED 상태 : " + data.mysensor);
			},
			error : function(){
				alert('error');
			}
		});
	});
	
		$("#ledCheck").on('click',function(){
			var mysensor = $('#mysensor').val();
			$.ajax({
				url : "InputSensor",
				type : "get",
				data : {"mysensor": mysensor},
				dataType : "json",
				success : function(data){
					$('#result').html("현재 LED 상태 : " + data.mysensor);
				},
				error : function(){
					alert('error');
				}
			});
		});
	</script>
</body>
</html>