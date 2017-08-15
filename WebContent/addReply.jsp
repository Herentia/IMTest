<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addreply.jsp' starting page</title>
    
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
  <form action="addreply?invitation.id=${invitation.id }" method="post">
  <table align="center" border="1">
      <tr align="center"><td colspan="3">添加回复</td></tr>
      <tr>
         <td>回复内容</td>
         <td colspan="2"><textarea name="replyDetail.content"></textarea></td>
      </tr>
      <tr>
         <td>回复昵称</td>
         <td colspan="2"><input type="text" name="replyDetail.author"/></td>
      </tr>
      <tr><td colspan="3"><input type="submit" value="提交"/>
             <input type="button" value="返回" onclick="javascript:history.back()" />
        </td></tr>
  </table>
  </form>
  </body>
</html>
