<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <c:set var="root" value="${pageContext.request.contextPath}" scope="application"></c:set>
    <script type="text/javascript"> 
		var basePath = "${root}"; 
		var adminPath = basePath+"/pages"
	</script>
    <link id="easyuiTheme" rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.4.3/themes/default/easyui.css"/>  
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.4.3/themes/icon.css"/>  
    <script type="text/javascript" src="/static/jquery-easyui-1.4.3/jquery.min.js"></script>  
    <script type="text/javascript" src="/static/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/static/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>