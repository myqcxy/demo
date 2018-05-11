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

  <s:debug/>
    <table border="1" style="border:1px solid green"><tr><td>id<td>username<td>class<td>age<td>java<td>action
    <s:iterator value="stus" var="row">
    <tr>
      <td><s:property value="#row[0]"/>
      <td><s:property value="#row[1]"/>
      <td><s:property value="#row[2]"/>
      <td><s:property value="#row[3]"/>
      <td><s:property value="#row[4]"/>
      <td>
      <s:url var="editUrl" action="stu_edit">
         <s:param name="id" value="#row[0]"/>
      </s:url>
      <a href="${editUrl}">edit</a>
      <s:url var="delUrl" action="stu_del">
         <s:param name="id" value="#row[0]"/>
      </s:url>
      <a href="${delUrl}" onClick="return readyDel();">del</a>
    </s:iterator>
    </table>
    <script>
      function readyDel(){
        return confirm("是否真的删除?");
      }
    </script>
  </body>
</html>
