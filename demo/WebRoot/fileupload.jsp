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
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <s:form action="fileUpload" method="post" enctype="multipart/form-data">
    	<s:file name="file" label="file"></s:file>
    	<s:submit></s:submit>
    </s:form>
    <br>限制文件大小
    <s:form action="uploadLimSize" enctype="multipart/form-data">
    	<s:file name="file" label="file"/>
    	<s:submit></s:submit>
    </s:form>
    
     <s:form action="multiUpload" method="post" theme="simple" enctype="multipart/form-data">
  	<s:file name="upload" label="file 1"/>
  	<s:file name="upload" label="file 2"/>
  	<s:file name="upload" label="file 3"/>
  	<s:submit/>
  </s:form>
  </body>
</html>
