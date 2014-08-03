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
    订单：<s:property value="order.id"/><br/>
    收货人：<s:property value="order.name"/><br/>
    收货地址：<s:property value="order.address"/><br/>
    ----------------------订单明细-------------------------
   <table>
    	<tr>
    		<td>名称</td>
    		<td>价格</td>
    		<td>数量</td>
    	</tr>
    	<s:iterator value="order.orderitems">
    		<tr>
    			<td> <s:property value="goods.name" /> </td>    		
    			<td> <s:property value="goods.price" />元 </td>
    			<td> <s:property value="amount" />  </td>
    		</tr>
    	</s:iterator> 
    </table>
   	总价：<s:property value="totalprice"/>元

  </body>
</html>
