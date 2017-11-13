<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<form name="fom" id="fom" method="post">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="62" background="./images/nav04.gif">
								<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
								</table>
							</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td><table id="subtree1" style="DISPLAY:" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
									</tr>
									<tr>
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">

												<tr>
													<td height="20" colspan="9" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														工资类型列表 &nbsp;</td>
												</tr>
												<tr>
													<td width="4%" align="center" bgcolor="#EEEEEE">选择</td>
													<td width="10%" height="20" align="center" bgcolor="#EEEEEE">工资类型</td>
													<td width="10%" height="20" align="center" bgcolor="#EEEEEE">金额</td>
													<td width="27%" align="center" bgcolor="#EEEEEE">备注</td>
													<td width="15%" align="center" bgcolor="#EEEEEE">添加时间</td>
													<td width="13%" align="center" bgcolor="#EEEEEE">编辑时间</td>
													<td width="6%" align="center" bgcolor="#EEEEEE">状态</td>
													<td width="9%" align="center" bgcolor="#EEEEEE">优先级</td>
													<td width="" align="center" bgcolor="#EEEEEE">操作</td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">正式工工资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">试用满三个月</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">旷工扣资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">超过半天按一天算</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">正式工工资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">试用满三个月</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">旷工扣资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">超过半天按一天算</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">正式工工资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">试用满三个月</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
												<tr>
													<td bgcolor="#FFFFFF"><div align="center">
															<input type="checkbox" name="delid" />
														</div></td>
													<td height="20" bgcolor="#FFFFFF"><div align="center">旷工扣资</div></td>
													<td height="20" bgcolor="#FFFFFF" align="center">1000-1500</td>
													<td bgcolor="#FFFFFF"><div align="center">超过半天按一天算</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center">2008-08-08</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center" class="STYLE1">未知</div></td>
													<td bgcolor="#FFFFFF"><div align="center">
															<a href="addGongZiType.htm">编辑</a>
														</div></td>
												</tr>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table>
					<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td height="6"><img src="./images/spacer.gif" width="1" height="1" /></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>
