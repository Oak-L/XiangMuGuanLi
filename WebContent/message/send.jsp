<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<body>
	<form action="message_send.action" method="post" enctype="multipart/form-data" name="form"
		target="_self">
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="CContent">
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
				<th class="tablestyle_title">新建信息</th>
			</tr>
			<tr>
				<td class="CPanel">
					<table border="0" cellpadding="0" cellspacing="0" style="width: 100%">
						<TR>
							<TD width="100%">
								<fieldset style="height: 100%;">
									<legend>新建信息</legend>
									<table border="0" cellpadding="2" cellspacing="1" style="width: 100%">
										<tr>
											<td nowrap align="right" width="11%">消息标题:</td>
											<td width="27%"><input name='message.messagetitle' type="text" class="text"
												style="width: 154px" value="" /></td>
											<td align="right" width="25%">&nbsp;</td>
											<td width="37%">&nbsp;</td>
										</tr>
										<tr>
											<td width="11%" align="right" nowrap>接收者编号:</td>
											<td colspan="3"><input name='message.empid' type="text" class="text"
												style="width: 450px;" size="20" value="" />(可在员工列表里查询)</td>
										</tr>
										<tr>
											<td width="11%" nowrap align="right">信息内容:</td>
											<td colspan="3"><textarea name="message.messagecontent" cols="100" rows="20"></textarea></td>
										</tr>
										<tr>
											<td><input type="hidden" name="message.sendid" value="${cemp.empid }" /></td>
											<td><input type="hidden" name="message.sendman" value="${cemp.empname }" /></td>
										</tr>
									</table>
									<br />
								</fieldset>
							</TD>
						</TR>
					</TABLE>
				</td>
			</tr>
			<TR>
				<TD colspan="2" align="center" height="50px"><input type="submit" name="Submit" value="发送"
					class="button" onclick="alert('发送成功！');" /> <input type="button" name="Submit2" value="返回"
					class="button" onclick="window.history.go(-1);" /></TD>
			</TR>
		</TABLE>
	</form>
</body>
</html>

