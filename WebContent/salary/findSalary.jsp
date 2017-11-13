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

	function link() {
		document.getElementById("fom").action = "xuqiumingxi.html";
		document.getElementById("fom").submit();
	}
</SCRIPT>

<body>
	<form name="fom" id="fom" method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td height="30">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="62" background="./images/nav04.gif">

								<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="21">&nbsp;</td>
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
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">
												<tr>
													<td height="20" colspan="2" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														员工工资详细信息</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">基本工资:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.sal }</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">处罚扣除金额:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.deductsum }</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">实发工资:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.comm }</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">工资发放状态:</td>
													<td bgcolor="#FFFFFF"><s:if test="payoff.zhuangtai!=1">
															<div align="center" class="STYLE1">未发放</div>
														</s:if> <s:if test="payoff.zhuangtai==1">
															<div align="center" class="top-font01">已发放</div>
														</s:if></td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">发放类型:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.paytype }</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">年份:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.year }</td>
												</tr>
												<tr>
													<td height="20" align="center" bgcolor="#FFFFFF">月份:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.month }</td>
												</tr>
												<tr>
													<td height="65" align="center" bgcolor="#FFFFFF">描述:</td>
													<td bgcolor="#FFFFFF" align="center">${payoff.miaoshu }</td>
												</tr>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td colspan="2" align="center" height="50px"><input type="button" name="Submit2" value="返回"
					class="button" onclick="window.history.go(-1);" /></td>
			</tr>
		</table>
	</form>
</body>
</html>