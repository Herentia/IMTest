<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
    <table border="1" align="center" cellpadding="0" cellspacing="0">
    	<tr align="center">
           <td colspan="5">帖子列表</td>
        </tr>
    	<form action="tieziSearch" method="post">
    		<tr align="center">
    			<td colspan="5">
    				<input type="text" name="invitation.titile"/><input type="submit" value="搜索"/>
    			</td>
    		</tr>
    	</form>
    	<tr>
    		<td>标题</td>
    		<td>内容摘要</td>
    		<td>作者</td>
    		<td>发布时间</td>
    		<td>操作</td>
    	</tr>
    	<s:iterator var="invitation" value="list">
    		<tr>
    			<td><s:property value="#invitation.titile"/> </td>
    			<td><s:property value="#invitation.summary"/> </td>
    			<td><s:property value="#invitation.author"/> </td>
    			<td><s:date name="#invitation.createtime" format="yyyy-MM-dd"/> </td>
    			<td><a href="reply?invitation.id=${id }">查看回复</a>
    			|<a href="edit?invitation.id=${id }">修改</a>
    			|<a href="javascript:if(confirm('确定删除吗？'))location.href='deletetiezi?invitation.id=${id }'">删除</a></td>
    		</tr>
    	</s:iterator>
    	
    	<tr>
    		<td colspan="5">第${currentPage }/${totalPage }页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    			<a href="tiezi?currentPage=1">首页</a>
    			<a href="tiezi?currentPage=${currentPage==1?1:currentPage-1 }">上一页</a>
    			<a href="tiezi?currentPage=${currentPage==totalPage?(totalPage):currentPage+1 }">下一页</a>
    			<a href="tiezi?currentPage=${totalPage }">末页</a>
    		</td>
    	</tr>
    
    </table>
  </body>
</html>
