<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <a href="login_i18n.jsp">实验二 国际化</a><br>
  <s:url var="myAction" action="myAction" namespace="/sec"/>
    <a href="${myAction}">实验三 拦截器</a> <br>
    <a href="interceptionTest">Exception拦截器</a>
    <br>validation
    <a href="validation_input.jsp">validtion_input</a>
    <br>
    <a href="fileupload.jsp">文件上传</a><br>
    test5
    <a href="input.jsp">实验五jdbc</a>
    <a href="stuList">显示所有学生信息</a>
  </body>
</html>
