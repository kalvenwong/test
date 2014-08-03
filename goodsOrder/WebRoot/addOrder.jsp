<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订购商品</title>
    
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
    <s:form action="addorder.action" method="post">
    	收货人：<input type="text" size="20" name="order.name"/><br/>
    	收货人地址：<input type="text" size="80" name="order.address"/><br/>
    	<hr width="800" color="#00FFFF" align="left" size="1"/>
    	<table>
    	<tr>
    		<td>名称</td>
    		<td>价格</td>
    		<td>数量</td>
    	</tr>
    	<s:iterator value="goodsList">
    		<tr>
    			<td><s:property value="name" /></td>    		
    			<td><s:property value="price" /></td>
    			<td> 
    				<input type="text" size="10" name="amounts"/> 
    				<input type="hidden" name="gids" value="<s:property value="id"/>"/>
    			</td>
    		</tr>
    	</s:iterator>
    	</table>
    	<input type="submit" value="订购" align="right"/>
    
    </s:form>
  </body>
</html>
