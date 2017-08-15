<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit.jsp' starting page</title>
    
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
    <form action="doedit?invitation.id=${invitation.id }" method="post">
    
    	修改标题：<input type="text" id="titile" name="invitation.titile" value="${invitation.titile }"/>
    	修改内容：<input type="text" id="summary" name="invitation.summary" value="${invitation.summary}"/>
    	<input type="submit" value="提交"/>
    	<input type="button" value="返回" onclick="javascript:history.back()" />
    </form>
  </body>
</html>
