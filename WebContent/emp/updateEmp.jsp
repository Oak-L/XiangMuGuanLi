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
<body>
	<form action="emp_update.action" method="post" name="form" target="_self"
		enctype="multipart/form-data">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
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
					<th class="tablestyle_title">员工基本信息录入</th>
				</tr>
				<tr>
					<td class="CPanel">
						<table border="0" cellpadding="0" cellspacing="0" style="width: 100%">
							<TR>
								<TD width="100%">
									<fieldset style="height: 100%;">
										<legend>员工信息</legend>
										<table border="0" cellpadding="2" cellspacing="1" style="width: 100%">
											<tr>
												<td nowrap align="right" width="15%">员工唯一编号:</td>
												<td width="35%"><input name="emp.empno" type="text" class="text"
													style="width: 154px" value="${emp.empno }" /> <span class="red">*</span></td>
												<td width="16%" align="right" nowrap="nowrap">密码:</td>
												<td width="34%"><input class="text" name="emp.password" style="width: 154px"
													value="${emp.password }"></td>
											</tr>
											<tr>
												<td nowrap="nowrap" align="right">真实姓名:</td>
												<td><input class="text" name="emp.empname" style="width: 154px"
													value="${emp.empname }" /></td>
												<td align="right">性别:</td>
												<td><select name="emp.sex">
														<option value="0">==请选择==</option>
														<option value="男">男</option>
														<option value="女">女</option>
												</select></td>
											</tr>
											<tr>
												<td align="right">出生日期:</td>
												<td><input class="text" name="" style="width: 154px" value="${emp.birth }" /></td>
												<td align="right">身份证号码:</td>
												<td><input class="text" name='emp.idcard' style="width: 154px"
													value="${emp.idcard }" /></td>
											</tr>
											<tr>
												<td align="right">电子邮箱:</td>
												<td><input class="text" name='emp.email' style="width: 154px" value="${emp.email }" /></td>
												<td align="right">电话号码:</td>
												<td><input class="text" name='emp.tel' style="width: 154px" value="${emp.tel }" /></td>
											</tr>
											<tr>
												<td align="right">居住地址:</td>
												<td><input name="emp.address" type="text" size="30" value="${emp.address }" /></td>
												<td align="right">职位:</td>
												<td><select name="emp.dutyid">
														<option value="0">==请选择==</option>
														<option value="1">程序员</option>
														<option value="2">项目经理</option>
														<option value="3">经理</option>
												</select></td>
											</tr>
											<tr>
												<td align="right">员工类型:</td>
												<td><select name="emp.emptype">
														<option value="0">==请选择==</option>
														<option value="实习">实习</option>
														<option value="试用">试用</option>
														<option value="正式员工">正式员工</option>
												</select></td>
												<td align="right">银行名称:</td>
												<td><input class="text" name='emp.bankname' style="width: 154px"
													value="${emp.bankname }" /></td>
											</tr>
											<tr>
												<td align="right">银行账户:</td>
												<td><input class="text" name='emp.bankno' style="width: 154px"
													value="${emp.bankno }" /></td>
												<td align="right">基本工资:</td>
												<td><input class="text" name='emp.sal' style="width: 154px" value="${emp.sal }" /></td>
											</tr>
											<tr>
												<td align="right">奖金:</td>
												<td><input class="text" name='emp.comm' style="width: 154px" value="${emp.comm }" /></td>
												<td align="right">其它补助金:</td>
												<td><input class="text" name='emp.subsidy' style="width: 154px"
													value="${emp.subsidy }" /></td>
											</tr>
											<%-- <tr>
												<td align="right">入职时间:</td>
												<td><input class="text" name='emp.hiredate' style="width: 154px"
													value="${emp.hiredate }" /></td>
												<td align="right">&nbsp;</td>
												<td>&nbsp;</td>
											</tr> --%>
											<tr>
												<td align="right">描述:</td>
												<td colspan="3"><textarea name="emp.descript" cols="100" rows="8">${emp.descript }</textarea></td>
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
					<TD colspan="2" align="center" height="50px"><input type="submit" name="Submit" value="保存"
						class="button" onclick="alert('保存成功！');" /> <input type="button" name="Submit2" value="返回"
						class="button" onclick="window.history.go(-1);" /></TD>
				</TR>
				<tr>
					<td><input type="hidden" name="emp.empid" value="${emp.empid }" /></td>
				</tr>
			</TABLE>
		</div>
	</form>
</body>
</html>