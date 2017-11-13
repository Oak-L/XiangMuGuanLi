<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
<script type="text/JavaScript">
	
</script>
<link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
	function sousuo() {
		window
				.open(
						"gaojisousuo.htm",
						"",
						"depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
	}
	function selectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				obj[i].checked = true;
			}
		}
	}

	function unselectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				if (obj[i].checked == true)
					obj[i].checked = false;
				else
					obj[i].checked = true;
			}
		}
	}

	function deleteChoose() {
		if (confirm("一旦删除无法恢复，是否确认删除？")) {
			document.getElementById("fom").action = "role_delete.action";
			document.getElementById("fom").submit();
		}
	}
</SCRIPT>

<body>
	<form name="fom" id="fom" action="role_find.action" method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="30">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="62" background="./images/nav04.gif">
											<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
												<tr>
												</tr>
											</table>
										</td>
									</tr>
								</table></td>
						</tr>
						<tr>
							<td height="62" background="../images/nav04.gif">
								<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="24"><img src="./images/ico07.gif" width="20" height="18" /></td>
										<td width="519"><label>角色名称: <input type="text" name="roleName" />
										</label><input name="Submit" type="submit" class="right-button02" value="查 询" /></td>
										<td width="679" align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td><table id="subtree1" style="DISPLAY:" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td height="20"><span class="newfont07">选择：<a href="####" class="right-font08"
												onclick="selectAll();">全选</a>-<a href="####" class="right-font08"
												onclick="unselectAll();">反选</a></span> <input name="Submit" type="button"
											class="right-button08" value="删除所选角色" onclick="deleteChoose();" /> <input name="Submit"
											type="button" class="right-button08" value="添加角色信息"
											onclick="javascript:location.href='role_updateFind.action'" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										</td>
									</tr>
									<tr>
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">
												<tr>
													<td height="20" colspan="14" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;角色详细列表
														&nbsp;</td>
												</tr>
												<tr>
													<td width="10%" align="center" bgcolor="#EEEEEE">选择</td>
													<td width="30%" height="20" align="center" bgcolor="#EEEEEE">角色名称</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">角色编号</td>
													<td width="30%" align="center" bgcolor="#EEEEEE">角色描述</td>
													<td width="20%" align="center" bgcolor="#EEEEEE">操作</td>
												</tr>
												<s:iterator value="list" id="role">
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid" value="${role.roleid}" /></td>
														<td height="20" bgcolor="#FFFFFF">${role.rolename }</td>
														<td bgcolor="#FFFFFF">${role.roleid }</td>
														<td bgcolor="#FFFFFF">${role.roledesc }</td>
														<td bgcolor="#FFFFFF">&nbsp;&nbsp;<a
															href="role_updateFind.action?role.roleid=${role.roleid }">编辑</a>&nbsp;|&nbsp;<a
															href="role_msg.action?id=${role.roleid }">查看</a>&nbsp;|&nbsp;<a
															href="right_list.action?role.roleid=${role.roleid }">权限管理</a></td>
													</tr>
												</s:iterator>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table>
					<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td height="6"><img src="./images/spacer.gif" width="1" height="1" /></td>
						</tr>
						<tr>
							<td height="33"><table width="100%" border="0" align="center" cellpadding="0"
									cellspacing="0" class="right-font08">
									<tr>
										<td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span
											class="right-text09">1</span> 页
										</td>
										<td width="49%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#"
											class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#"
											class="right-font08">末页</a>] 转至：
										</td>
										<td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="1%"><input name="textfield3" type="text" class="right-textfield03"
														size="1" /></td>
													<td width="87%"><input name="Submit23222" type="submit" class="right-button06"
														value=" " /></td>
												</tr>
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