<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="allperson"></table>
	<div id="tb">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="addperson();">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="deleteperson();">销户</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="alterperson();">修改</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true" onclick="reload();">刷新</a>
	</div>
	<form action="/touch/person/alterperson" method="post" id="alterperson">
		<input type="hidden" name="id">
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
				<td>证件类型：</td>
				<td>
					<select name="idtype">
						<option value="1">身份证</option>
						<option value="2">军官证</option>
						<option value="3">护照</option>
						<option value="4">其他</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>身份证号码：</td>
				<td><input type="text" name="idnum" id="idnum"></td>
			</tr>
			<tr>
				<td>单位公积金账号：</td>
				<td><input type="text" name="unitaccnum" id="unitaccnum" disabled="disabled"></td>
			</tr>
			</tbody>
		</table>
	</form>
	<script type="text/javascript" src="../js/allp.js"></script>
</body>
</html>