<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reply.jsp' starting page</title>
    
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
  <table align="center" border="1">
       <tr>
          <td colspan="3">回复信息列表</td>
       </tr>
       <tr><td colspan="2"></td><td><a href="toaddreply?invitation.id=${invitation.id}">添加回复 </a>  返回帖子列表</td></tr>
       <tr>
           <td>回复内容</td>
           <td>回复昵称</td>
           <td>发布时间</td>
       </tr>
       <s:iterator var="reply" value="replylist">
       <tr>
           <td><s:property value="#reply.content"/></td>
           <td><s:property value="#reply.author"/></td>
           <td><s:date name="#reply.createdate" format="yyyy-MM-dd"/></td>      
       </tr>
      </s:iterator>
  
  </table>
  </body>
</html>
