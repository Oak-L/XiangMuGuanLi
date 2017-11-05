<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目管理系统 by www.eyingda.com</title>
<link rel="stylesheet" rev="stylesheet" href="./css/style.css" type="text/css" media="all" />


<script language="JavaScript" type="text/javascript">
	function tishi() {
		var a = confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
		if (a != true)
			return false;
		window
				.open(
						"冲突页.htm",
						"",
						"depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
	}

	function check() {
		document.getElementById("aa").style.display = "";
	}
</script>
<style type="text/css">
<!--
.atten {
	font-size: 12px;
	font-weight: normal;
	color: #F00;
}
-->
</style>
</head>

<body class="ContentBody">
	<form action="role_add.action" method="post" enctype="multipart/form-data" name="form"
		target="_self">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
				<tr>
					<th class="tablestyle_title">角色基本信息录入</th>
				</tr>
				<tr>
					<td class="CPanel">
						<table border="0" cellpadding="0" cellspacing="0" style="width: 100%">
							<tr>
								<td width="100%">
									<fieldset style="height: 100%;">
										<legend>角色信息</legend>
										<table border="0" cellpadding="2" cellspacing="1" style="width: 100%">
											<tr>
												<td nowrap align="right" width="15%">角色名称:</td>
												<td width="35%"><input name='role.rolename' type="text" class="text"
													style="width: 154px" value="${role.rolename }" /> <span class="red">*</span></td>
												<td width="16%" align="right" nowrap="nowrap">角色编号:</td>
												<td width="34%"><input class="text" name="role.roleid" style="width: 154px"
													value="${role.roleid }" readonly="readonly"></td>
											</tr>
											<tr>
												<td align="right">角色描述:</td>
												<td colspan="3"><textarea name="role.roledesc" cols="100" rows="8">${role.roledesc }</textarea></td>
											</tr>
										</table>
										<br />
									</fieldset>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center" height="50px"><input type="submit" name="Submit" value="保存"
						class="button" onclick="alert('保存成功！');" /> <input type="button" name="Submit2" value="返回"
						class="button" onclick="window.history.go(-1);" /></td>
				</tr>
				<%-- <tr>
					<td><input type="hidden" name="role.roleid" value="${role.roleid }" /></td>
				</tr> --%>
			</table>
		</div>
	</form>
</body>
</html>