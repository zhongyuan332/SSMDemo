<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/touch/person/saveperson" method="post" id="saveperson">
		<table style="" align="center">
			<thead>
				<tr>
					<td></td>
				</tr>
			</thead>
			<tbody>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="pname" id="name" ></td>
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
					ok4 = true;
				}else{
					alert("没有此公司");
				}
			}
		})
	})
	
	$('#name').validatebox({
		 required: true,
		 missingMessage:"请输入2-5位姓名",
		 validType:'length[2,5]',
	})
	
	$('#idnum').validatebox({
		 required: true,
		 missingMessage:"请输入18位身份证号",
		 validType:'length[18,18]',
	})	
	 $('#unitaccnum').validatebox({
		 required: true,
		 missingMessage:"请输入单位公积金账号！",
	})
	$('#basenumber').validatebox({
		 required: true,
		 missingMessage:"请输入缴存基数！",
	})
	function checkout1(){
		var ok1 = $('#name').validatebox("isValid");
		var ok2 = $('#idnum').validatebox("isValid");
		var ok3 = $('#unitaccnum').validatebox("isValid");
		var ok5 = $('#basenumber').validatebox("isValid");
		console.log(ok2);
		if(ok1&&ok2&&ok3&&ok4&&ok5){
			$('#saveperson').submit();
		}
	}

	</script>
	
</body>

</html>