<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>青鸟租房 -修改房屋信息</title>
		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<script type="text/javascript" src="scripts/function.js"></script>
	</head>
	<body>
		<div id="header" class="wrap">
			<div id="logo">
				<img src="images/logo.gif" />
			</div>

		</div>
		<div id="regLogin" class="wrap">
			<div class="dialog">
				<dl class="clearfix">
					<dt>
						房屋信息修改
					</dt>
					<dd class="past">
						修改房屋信息
					</dd>

				</dl>
				<div class="box">
					<div class="infos">
						${message}
					</div>
					<form action="modifyHouse.action" method="post">
						<input type='hidden' value='${house.id}' name='house.id' />
						<div class="infos">
							<table class="field">
								<tr>
									<td class="field">
										标 题：
									</td>
									<td>
										<input type="text" class="text" name="house.title" value='${house.title}' />
									</td>
								</tr>
								<tr>
									<td class="field">
										户 型：
									</td>
									<td>
										<select class="text" name="typeId">
											<c:forEach var="houseType" items="${typeList}">
												<option value="${houseType.id}"
													<c:if test="${houseType.id==house.type.id}">selected="selected"</c:if>>
													${houseType.name}
												</option>
											</c:forEach>
										</select>
									</td>
								</tr>
								<tr>
									<td class="field">
										面 积：
									</td>
									<td>
										<input type="text" class="text" name="house.floorage"
											value='${house.floorage}' />
									</td>
								</tr>
								<tr>
									<td class="field">
										价 格：
									</td>
									<td>
										<input type="text" class="text" name="house.price" value='${house.price}' />
									</td>
								</tr>
								<tr>
									<td class="field">
										位 置：
									</td>
									<td>
										区：
										<select class="text" name="districtId">
											<option value="1004">
												海淀区
											</option>
										</select>
										街：
										<select class="text" name="streetId">
											<option value="1001">
												中关村大街
											</option>
										</select>
									</td>
								</tr>
								<tr>
									<td class="field">
										联系方式：
									</td>
									<td>
										<input type="text" class="text" name="house.contact"
											value='${house.contact}' />
									</td>
								</tr>
								<tr>
									<td class="field">
										详细信息：
									</td>
									<td>
										<textarea name="house.description">${house.description}</textarea>
									</td>
								</tr>
							</table>
							<div class="buttons">
								<input type="submit" value="立即修改" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div id="footer" class="wrap">
			<dl>
				<dt>
					青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号
				</dt>
				<dd>
					关于我们 · 联系方式 · 意见反馈 · 帮助中心
				</dd>
			</dl>
		</div>
	</body>
</html>



