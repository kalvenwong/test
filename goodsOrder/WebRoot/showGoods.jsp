<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showGoods.jsp' starting page</title>
    
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
  	商品展示
  	<s:form action="buyGoods.action" method="post">
  		<s:iterator value="goodsList">
  			<s:property value="name"/>
  			<input type="checkbox" name="gids" value='<s:text name="id"></s:text>'>
  			<hr>
  			<s:property value="manufacturer"/>
  			<s:property value="price"/>
  			<s:property value="specification"/>
			<hr>
  		</s:iterator>
  		<s:submit value="订购"/>
  	</s:form>
  </body>
</html>
