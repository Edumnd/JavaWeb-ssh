<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    	<h1>注册</h1>
    	<form action="regist">
    		用户名：<input type="text" name="username"><br/>
    		性	别：<input type="radio" name="gender" value="true">男
    				<input type="radio" name="gender" value="false">女
    		<br/>
    		年	龄：<input type="text" name="age"><br/>
    		生	日：<input type="text" name="birthday"><br/>
    		<input type="submit" value="注册">
    	</form>
    </center>
  </body>
</html>




