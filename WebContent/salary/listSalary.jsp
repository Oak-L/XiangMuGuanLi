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
<style type="text/css">
<!--
.STYLE1 {
	color: #FF0000
}
-->
</style>
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
</SCRIPT>

<body>
	<form name="fom" id="fom" method="post" action="">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="62" background="./images/nav04.gif"><table width="98%" border="0"
									align="center" cellpadding="0" cellspacing="0">
								</table></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td><table id="subtree1" style="DISPLAY:" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">

									<tr>
										<td height="20" colspan="9" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											员工工资列表 &nbsp;</td>
									</tr>
									<tr>
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">
												<tr>
													<td width="5%" align="center" bgcolor="#EEEEEE">员工编号</td>
													<td width="8%" height="20" align="center" bgcolor="#EEEEEE">员工姓名</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">年份</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">月份</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">总工资</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">扣除工资</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">实发工资</td>
													<td width="8%" align="center" bgcolor="#EEEEEE">状态</td>
													<td width="13%" align="center" bgcolor="#EEEEEE">发款人id</td>
													<td width="16%" align="center" bgcolor="#EEEEEE">操作</td>
												</tr>
												<s:iterator value="list" id="salary">
													<tr>
														<td bgcolor="#FFFFFF"><div align="center">${salary.empid }</div></td>
														<td height="20" bgcolor="#FFFFFF"><div align="center">${salary.empname }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.year }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.month }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.sal }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.deductsum }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.comm }</div></td>
														<td bgcolor="#FFFFFF"><s:if test="#salary.zhuangtai!=1">
																<div align="center" class="STYLE1">未发放</div>
															</s:if> <s:if test="#salary.zhuangtai==1">
																<div align="center" class="top-font01">已发放</div>
															</s:if></td>
														<td bgcolor="#FFFFFF"><div align="center">${salary.payname }</div></td>
														<td bgcolor="#FFFFFF"><div align="center">
																<a
																	href="salary_findSalary.action?salary.empid=${salary.empid }&salary.year=${salary.year }&salary.month=${salary.month }">查看</a>&nbsp;|&nbsp;
																<s:if test="#salary.zhuangtai!=1">
																	<a
																		href="salary_change.action?salary.empid=${salary.empid }&salary.year=${salary.year }&salary.month=${salary.month }&salary.payid=${cemp.empid}"
																		style="color: red;">发放工资</a>
																</s:if>
																<s:if test="#salary.zhuangtai==1">已发放</s:if>
															</div></td>
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