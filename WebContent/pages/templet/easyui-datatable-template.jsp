<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
    	<title>测评项目</title>
   		<c:import url="/pages/common/head.jsp"/> 		
  	</head>
<body>

	<table id="datagrid-table" class="easyui-datagrid" title="测评项目表"
		data-options="
			rownumbers		: true,
			singleSelect	: true,
			fitColumns		: true, 
			url				: adminPath + '/testproject/findpage',
			toolbar			: '#toolbar',
			fit				: true,
			pagination		: true,
			pageSize		: 15,
			pageList        : [10,15,20,25,30],
			showFooter		: true,
			idField			: 'id',
			onDblClickRow   : function(){dataTable.edit();}">
		<thead>
			<tr>
			<th data-options="field:'warehouseid',width:100,align:'left',formatter:complexCol,codeClass:'57'">所在仓库</th>
				<th data-options="field:'peopleName.name',width:140,align:'left',formatter:complexCol">老人姓名</th>
				<th data-options="field:'opuserName.name',width:140,align:'left',formatter:complexCol">员工</th>
				<th data-options="field:'optime',width:150,align:'left',formatter:formatForDateTimeBox">操作时间</th>
				<th data-options="field:'createdate',width:150,align:'left',formatter:EasyUiDateTime">创建时间</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<form id="search-form" class="search-form" enctype="multipart/form-data">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				style="color: red" onclick="resetForm('search-form')">条件重置</a>	
		
			<span class="inline-clear"></span>
			<label>名称</label>
			<input name="name" style="width:100px" type="text">
			<span class="inline-clear"></span>
			
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dataTable.search()">查询</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="dataTable.add()">添加</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="dataTable.edit()">修改</a>
			<!-- 
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="dataTable.remove()">删除</a>
			 -->
		</form>
	</div>
	
	<div id="data-form-dlg" class="easyui-dialog" style="width: 600px; height: 400px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<form id="data-form" class="data-form" method="post">
			<input name="id" style="display: none" />
			<table style="margin-left:-20px;">
				<tr class="tr_padding">
					<td><label>名称</label></td>
					<td>
						<input name="name" class="easyui-validatebox" data-options="required:true,validType:'maxLength[255]'">
					</td>
					<td><label>使用状态</label></td>
					<td>
						<input name="consumptiontype" class="easyui-combobox"
						data-options="valueField:'code',textField:'name',editable:false,panelHeight:'auto',
							required:true,enableNull:true,codeClass:'63'">
					</td>		
				</tr>
				<tr class="tr_padding">
					<td><label>备<span class="letter-space-2"></span>注</label></td>
					<td	colspan="3">
						<textarea rows="3" name="remark" class="textarea easyui-validatebox"
							style="width: 375px"></textarea>
					</td>
				</tr>
			</table> 
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-ok" onclick="dataTable.save()">保存</a> 
		<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#data-form-dlg').dialog('close')">取消</a>
	</div>
</body>
</html>
			