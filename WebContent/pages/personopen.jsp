<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<form action="/touch/person/saveperson" method="post">
		<table style="" align="center">
			<thead>
				<tr>
					<td></td>
				</tr>
			</thead>
			<tbody>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="pname" id="name"></td>
			</tr>
			<tr>
				<td>身份证号码：</td>
				<td><input type="text" name="idnum" id="idnum"></td>
			</tr>
			<tr>
				<td>单位公积金账号：</td>
				<td><input type="text" name="unitaccnum" id="unitaccnum"></td>
			</tr>
			<tr>
				<td>缴存基数：</td>
				<td><input type="text" name="basenumber" id="basenumber"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="提交" onclick="checkout1();"></td>
			</tr>		
			</tbody>
		</table>
	</form>
	
	<script type="text/javascript">
	var ok1 = false;
	var ok2 = false;
	var ok3 = false;
	var ok4 = false;
	
	$('#unitaccnum').blur(function(){
		$.ajax({
			url:'/touch/person/ishaveunit',
			type:'post',
			dataType:'json',
			data:{
				unitaccnum : $("#unitaccnum").val(),
				idnum : $("#idnum").val(),
			},
			success:function(date){
				if(date.company){
					ok3 = true;
				}else{
					alert("没有此公司");
				}
			}
		})
	})
	
	$('')
	
	function checkout1(){
		console.log("1111111111111111");
		var name = $("#name").val();
		var idnum = $("#idnum").val();
		var unitaccnum = $("#unitaccnum").val();
		var basenumber = $("#basenumber").val();
		
		if(name != null&&name!=""){
			ok1=true;
		}
		if(basenumber != null||basenumber!=""){
			ok2=true;
		}
		console.log("333333333333333"+name);
		console.log("333333333333333"+idnum);
		
		if(ok1&&ok2&&ok3){
			
		}
	}
	

	</script>
	
</body>

</html>