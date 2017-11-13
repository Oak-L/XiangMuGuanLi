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
	<form action="salary_add.action" method="post" enctype="multipart/form-data" name="form"
		target="_self">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
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
						</table>
					</td>
				</tr>
				<tr>
					<th class="tablestyle_title">员工工资发放</th>
				</tr>
				<tr>
					<td class="CPanel"><table border="0" cellpadding="0" cellspacing="0" style="width: 100%">
							<tr>
								<td align="left" width="100%"><h3 style="text-align: center;">${emp.empname}工资</h3></td>
								<td align="left" width="100%"><input type="hidden" name="payoff.empid"
									value="${emp.empid}"></td>
							</tr>
							<tr>
								<td width="100%"><fieldset style="height: 100%;">
										<legend>工资信息</legend>
										<table border="0" cellpadding="2" cellspacing="1" style="width: 100%">
											<tr>
												<td nowrap align="right" width="15%">基本工资:</td>
												<td width="35%"><input name='payoff.sal' type="text" class="text"
													style="width: 154px" value="${emp.sal }" /></td>
												<td align="right" width="16%">补贴/奖金:</td>
												<td width="34%"><input name='emp.subsidy' type="text" class="text"
													style="width: 154px" value="${emp.subsidy }" /></td>
											</tr>
											<tr>
												<td width="15%" nowrap align="right">处罚扣除金额:</td>
												<td width="35%"><input class="text" name='payoff.deductsum' style="width: 154px"
													value="${payoff.deductsum }" /></td>
												<td align="right">发放类型:</td>
												<td><select name="payoff.paytype">
														<option value="null">==请选择==</option>
														<option value="现金">现金</option>
														<option value="打卡">打卡</option>
												</select></td>
											</tr>
											<tr>
												<td align="right">年份:</td>
												<td><select name="payoff.year">
														<option value="null">==请选择==</option>
														<option value="2017">2017</option>
														<option value="2018">2018</option>
												</select></td>
												<td align="right">月份:</td>
												<td><select name="payoff.month">
														<option value="null">==请选择==</option>
														<option value="1">1</option>
														<option value="2">2</option>
														<option value="3">3</option>
														<option value="4">4</option>
														<option value="5">5</option>
														<option value="6">6</option>
														<option value="7">7</option>
														<option value="8">8</option>
														<option value="9">9</option>
														<option value="10">10</option>
														<option value="11">11</option>
														<option value="12">12</option>
												</select></td>
											</tr>
											<tr>
												<td align="right">描述:</td>
												<td><textarea name="payoff.miaoshu" rows="4"></textarea></td>
											</tr>
										</table>
										<br />
									</fieldset></td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td colspan="2" align="center" height="50px"><input type="submit" name="Submit2"
						value="保存" class="button" onclick="alert('保存成功！');" /> <input type="button" name="Submit2"
						value="返回" class="button" onclick="window.history.go(-1);" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
