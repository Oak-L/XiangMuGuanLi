<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目管理系统 by www.eyingda.com</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.tabfont01 {
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}

.font051 {
	font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}

.font201 {
	font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}

html {
	overflow-x: auto;
	overflow-y: auto;
	border: 0;
}
-->
</style>
<link href="./css/css.css" rel="stylesheet" type="text/css" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form name="fom" id="fom" action="right_update.action" method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="30"></td>
			</tr>
			<tr>
				<td><table id="subtree1" style="DISPLAY:" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td height="20"><span class="newfont07">选择：<a href="####" class="right-font08"
												onclick="selectAll();">全选</a>-<a href="####" class="right-font08"
												onclick="unselectAll();">反选</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
											name="Submit" type="submit" class="right-button08" value="更新角色权限" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="button" name="Submit2" value="返回上一页" class="right-button08"
											onclick="window.history.go(-1);" /></td>
									</tr>
									<tr>
										<td align="center">当前角色ID：<input type="text" name="role.roleid" value="${role.roleid }"
											readonly="readonly">
										</td>
									</tr>
									<tr>
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">
												<tr>
													<td height="20" colspan="14" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限详细列表
														&nbsp;</td>
												</tr>
												<tr>
													<td width="10%" align="center" bgcolor="#EEEEEE">选择权限</td>
													<td width="30%" height="20" align="center" bgcolor="#EEEEEE">权限名称</td>
												</tr>
												<c:forEach items="${list }" var="right">
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid"
															value="${right.rightid}"
															<c:forEach items="${mylist }" var="myright"><c:if test="${right.rightid==myright.rightid}">checked="checked"</c:if></c:forEach> />
														</td>
														<td height="20" bgcolor="#FFFFFF">${right.rightname}</td>
													</tr>
												</c:forEach>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>