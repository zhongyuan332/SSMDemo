<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/main.js"></script>
</head>
<body class="easyui-layout">
	<div region="north" title="North Title" split="true" style="height:200px;"></div>
	<div region="west" split="true" title="West" style="width:200px;">
	欢迎您：${username }
		<ul style="">
			<li><a href="javascript:void(0)" onclick="addperson();">个人开户</a></li>
			<li><a href="javascript:void(0)" onclick="addcompany();">企业开户</a></li>
			<li><a href="javascript:void(0)" onclick="seeperson();">查看所有个人用户</a></li>
			<li><a href="javascript:void(0)" onclick="seecompany();">查看所有企业用户</a></li>
		</ul>
	</div>
	<div region="center" title="center title" style="padding:5px;background:#eee;" id="main" class="easyui-tabs"></div>

</body>
</html>