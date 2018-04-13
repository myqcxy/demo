<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tags_test.jsp' starting page</title>
    
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
    <s:form>
    	<s:textfield  errorPosition="left" requiredPosition="left" name="username" label="用户名" requiredLabel="true"></s:textfield>
    	<s:password name="pass" label="密码"></s:password>
    	<s:fielderror></s:fielderror>
    	<s:checkboxlist errorPosition="" list="{'张三','李四','王五','张柳'}" label="请您选择您喜欢的歌手" labelposition="top" name="mysongers"></s:checkboxlist>
    	<s:submit value="提交"></s:submit>
    </s:form>
  </body>
</html>
