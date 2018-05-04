<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'validation_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<s:head/>
<sj:head/>
  </head>
  
  <body>
    	<s:form action="validationaction">
    		<s:textfield name="username" label="用户名"></s:textfield>
    		<s:textfield name="pass" label="密码"></s:textfield>
    		<s:textfield name="age" label="年龄"></s:textfield>
    		<sj:datepicker name="test_jquery" label="日期" changeMonth="true"
    		changeYear="true" displayFormat="yy-mm-dd"
    		></sj:datepicker>
    		<sjr:ckeditor id="richTextEditor" name="memo" rows="10" cols="80"
		width="730" height="250" value=""/>
    		<s:submit/>
    	</s:form>
  </body>
</html>
