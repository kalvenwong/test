<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><s:text name="register.title"></s:text></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
</div>
<div id="regLogin" class="wrap">
	<div class="dialog">
		<dl class="clearfix">
			<dt><s:text name="register.newuserreg"></s:text></dt>
			<dd class="past"><s:text name="register.infoform"></s:text></dd>
		</dl>
		<a href="/houserent_str_hib/language!chinese.action"><s:text name="register.cn"></s:text></a>
		<a href="/houserent_str_hib/language!chinese.action"><s:text name="register.hk"></s:text></a>
		<a href="/houserent_str_hib/language!englise.action"><s:text name="register.en"></s:text></a>
		<div class="box">
			<form action="registeruser.action" method="post">
				<div class="infos">
				
					<table class="field">
						<tr>
							<td class="field"><s:text name="register.user.name"></s:text></td>
							<td><input type="text" class="text" name="user.name" /> </td><td><s:fielderror fieldName="user.name"></s:fielderror></td>
						</tr>
						<tr>
							<td class="field"><s:text name="register.user.password"></s:text></td>
							<td><input type="password" class="text" name="user.password" /></td><td><s:fielderror fieldName="user.password"></s:fielderror></td>
						</tr>
						<tr>
							<!--
							 <td class="field">确认密码：</td>
							<td><input type="password" class="text" name="repassword" /> </td><td><s:fielderror fieldName="repassword"></s:fielderror></td>
							 -->
							 	<s:textfield name="repassword" key="register.user.repassword"/>
							 	
						</tr>
						<tr>
							<td class="field"><s:text name="register.user.telephone"></s:text></td>
							<td><input type="text" class="text" name="user.telephone" /> </td>
						</tr>
						<tr>
							<td class="field"><s:text name="register.user.username"></s:text></td>
							<td><input type="text" class="text" name="user.username" /> </td>				
						</tr>
					</table>
					<div class="buttons">	<s:submit key="register.submit" /></div>
				</div>
			</form>
		</div>
	</div>
</div>
<div id="footer" class="wrap">
	<dl>
    	<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>
        <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>
    </dl>
</div>
</body>
</html>

