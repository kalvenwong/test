<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
int total = (Integer)request.getAttribute("total");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<sx:head/>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>青鸟租房 - 用户管理</title>
	<link type="text/css" rel="stylesheet" href="css/style.css" />
	<script type="text/javascript" src="scripts/function.js"></script>
	<script type="text/javascript">
		function toUrl(url){
			window.location.href = url;
			return;
		}
		function update(id){
			location = '/HouseRent/toModify.action?houseId=' + id;
		}
	</script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
	<div class="search">
		<label class="ui-green"><input onclick="toUrl('page/add.jsp');" type="button" name="search" value="发布房屋信息" /></label>	
		<label class="ui-green"><input type="button" name="search" value="退       出" onclick='document.location="index.jsp"'/></label>
	</div>
</div>
<div class="main wrap">
<s:div id="houseArea">
	<table class="house-list">
	<s:if test="result!=null">
	<s:iterator value="result" status="status" >
		<tr>
			<td class="house-thumb"><span>
				<s:url value="show.action" id="show">
					<s:param name="id" value="id"></s:param>
				</s:url>
				<s:a href="%{show}"><img src="images/thumb_house.gif" /></s:a>
			</span>	</td>
			<td>
				<dl>
					<dt><s:url value="show.action" id="show">
					<s:param name="id" value="id"></s:param>
				</s:url>
				<s:a href="%{show}"><s:property value="title"/></s:a>
				</dt>
					<dd>
						<s:property value="street.district.name"/>区
						<s:property value="street.name"/>，
						<s:property value="floorage"/>平米<br/>
						联系方式<s:property value="contact"/>
					</dd>
				</dl>
			</td>
			<s:if test="publisher.id==user.id">
				<td class="house-type"><label class="ui-green"><input type="button" onclick="update(<s:property value='id'/>)" name="search" value="修    改" /></label></td>
				<td class="house-price"><label class="ui-green"><input type="button" name="search" value="删    除" /></label></td>
			</s:if>
			<s:else>
				<td colspan="2"></td>
			</s:else>
		</tr>
	</s:iterator>
	</s:if>
	<s:else>
		<td>无房屋信息输出</td>
	</s:else>
	
	</table>
	</s:div>
	<div class="pager">
		<ul>
			<li class="current">
				<a href="/houserent_str_hib/houseListByPages.action?number=1">首页</a>
				<a href="/houserent_str_hib/houseListByPages.action?number=<s:property value="prev"/>">上一页</a>
				<a href="/houserent_str_hib/houseListByPages.action?number=<s:property value="next"/>">下一页</a>
				<a href="/houserent_str_hib/houseListByPages.action?number=<s:property value="total"/>">尾页</a>
			</li>
		</ul>
		<span><s:property value="number"/>/<s:property value="total"/>页</span>
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
