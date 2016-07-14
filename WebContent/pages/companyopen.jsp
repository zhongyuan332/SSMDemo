<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="../js/validator.js"></script>
	<form action="/touch/company/savecompany" method="post" id="savecompany">
		<table align="center" width="400px">
			<thead>
				<tr>
					<td></td>
					<td></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>单位名称：</td>
					<td><input type="text" name="unitaccname" id="unitaccname"></td>
				</tr>
				<tr>
					<td>单位类别：</td>
					<td><select name="unitchar">
							<option value="1">企业</option>
							<option value="2">事业</option>
							<option value="3">机关</option>
							<option value="4">团体</option>
							<option value="5">其他</option>
					</select></td>
				</tr>
				<tr>
					<td>企业类型：</td>
					<td><select name="unitkind">
							<option value="110">国有经济</option>
							<option value="120">集体经济</option>
							<option value="130">股份合作企业</option>
							<option value="140">联营企业</option>
							<option value="150">有限责任公司</option>
							<option value="160">股份有限公司</option>
							<option value="170">私营企业</option>
							<option value="190">其他企业</option>
							<option value="200">港澳台商投资企业</option>
							<option value="300">外商投资企业</option>
							<option value="900">其他</option>
					</select></td>
				</tr>
				<tr>
					<td>发薪日期：</td>
					<td><input type="text" name="salarydate" id="salarydate">
					<div id="message3"></div></td>
				</tr>
				<tr>
					<td>联系电话：</td>
					<td><input type="text" name="unitphone" id="unitphone"></td>
				</tr>
				<tr>
					<td>单位联系人：</td>
					<td><input type="text" name="unitlinkman" id="unitlinkman"></td>
				</tr>
				<tr>
					<td>经办人身份证号码：</td>
					<td><input type="text" name="unitagentpapno"
						id="unitagentpapno"></td>
				</tr>
				<tr>
					<td>单位比例：</td>
					<td><input type="text" name="unitprop" id="unitprop">
					<div id="message1"></div></td>
				</tr>
				<tr>
					<td>个人比例</td>
					<td><input type="text" name="perprop" id="perprop">
					<div id="message2"></div></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="button" value="提交" onclick="checkout2();"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<script type="text/javascript">
		var ok1 = false;
		var ok2 = false;
		var ok3 = false;
		var ok4 = false;
		var ok5 = false;
		var ok6 = false;
		var ok7 = false;
		$('#unitaccname').validatebox({
			required : true,
			missingMessage : "请输入单位名称",

		})

		$('#unitagentpapno').validatebox({
			required : true,
			missingMessage : "请输入18位身份证号",
			validType : 'length[18,18]',
		})
		$('#unitphone').validatebox({
			required : true,
			missingMessage : "请输入电话",
		})
		$('#salarydate').blur(function(){
			var data = $('#salarydate').val();
			if(data>=1&&data<=30){
				ok4 = true;
				$('#message3').empty();
			}else {
				$('#message3').empty();
				$('#message3').append("<span style='color:red'>发薪日期在1-30之间</span>");
			}
		})
		$('#unitlinkman').validatebox({
			required : true,
			missingMessage : "请输入单位联系人！",
			validType : 'length[2,6]',
		})
		$('#unitprop')
				.blur(
						function() {

							var a = $('#unitprop').val();
							console.log("465:" + a);
							if (a >= 0.05 && a < 0.12) {
								ok6 = true;
								$('#message1').empty();
							} else {
								$('#message1').empty();
								$('#message1')
										.append(
												"<span style='color:red'>单位比例在0.05-0.12之间</span>");
							}
						})
		$('#perprop')
				.blur(
						function() {
							var a = $('#perprop').val();
							if (a >= 0.05 && a < 0.12) {
								ok7 = true;
								$('#message2').empty();
							} else {
								$('#message2').empty();
								$('#message2')
										.append(
												"<span style='color:red'>单位比例在0.05-0.12之间</span>");
							}
						})
		function checkout2() {
			var ok1 = $('#unitaccname').validatebox("isValid");
			var ok2 = $('#unitagentpapno').validatebox("isValid");
			var ok3 = $('#unitphone').validatebox("isValid");
			var ok5 = $('#unitlinkman').validatebox("isValid");
			if(ok1&&ok2&&ok3&&ok4&&ok5&&ok6&&ok7){
				$('#savecompany').submit();
			}
		}
	</script>
</body>
</html>