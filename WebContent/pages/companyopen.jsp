<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/touch/company/savecompany" method="post">
		 单位名称：<input type="text" name="unitaccname"><br>
		 单位类别：<select name="unitchar" >
		 			<option value="1">企业</option>
		 			<option value="2">事业</option>
		 			<option value="3">机关</option>
		 			<option value="4">团体</option>
		 			<option value="5">其他</option>
		 		</select><br>
		 企业类型：<select name="unitkind" >
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
		 		</select><br>
		 发薪日期：<input type="text" name="salarydate"><br>
		 联系电话：<input type="text" name="unitphone"><br>
		 单位联系人：<input type="text" name="unitlinkman"><br>
		 经办人身份证号码：<input type="text" name="unitagentpapno"><br>
		 单位比例：<input type="text" name="unitprop"><br>
		 个人比例：<input type="text" name="perprop"><br>
		 单位人数：<input type="text" name="persnum"><br>
		 <input type="submit" value="提交"><br>
	</form>
</body>
</html>