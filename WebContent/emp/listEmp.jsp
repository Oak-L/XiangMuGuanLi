<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		document.getElementById("fom").action = "emp_updateFind.action?id=0";
		document.getElementById("fom").submit();
	}
	function deleteChoose() {
		if (confirm("一旦删除无法恢复，是否确认删除？")) {
			document.getElementById("fom").action = "emp_delete.action";
			document.getElementById("fom").submit();
		}
	}
</SCRIPT>
<body>
	<form name="fom" id="fom" method="post" action="emp_updateFind.action">
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
					</table>
				</td>
			</tr>
			<tr>
				<td><table id="subtree1" style="DISPLAY:" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td height="20"><span class="newfont07">选择：<a href="#" class="right-font08"
												onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
											<input name="Submit" type="button" class="right-button08" value="删除所选人员"
											onclick="deleteChoose();" /> <input name="Submit" type="button" class="right-button08"
											value="添加人员信息" onclick="link();" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										</td>
									</tr>
									<tr>
										<td height="40" class="font42"><table width="100%" border="0" cellpadding="4"
												cellspacing="1" bgcolor="#464646" class="newfont03">

												<tr>
													<td height="20" colspan="15" align="center" bgcolor="#EEEEEE" class="tablestyle_title">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														人员详细列表 &nbsp;</td>
												</tr>
												<tr>
													<td width="6%" align="center" bgcolor="#EEEEEE">选择</td>
													<td width="9%" height="20" align="center" bgcolor="#EEEEEE">唯一编号</td>
													<td width="9%" align="center" bgcolor="#EEEEEE">真实姓名</td>
													<td width="9%" align="center" bgcolor="#EEEEEE">职位</td>
													<td width="9%" align="center" bgcolor="#EEEEEE">员工类型</td>
													<td width="10%" align="center" bgcolor="#EEEEEE">身份证号码</td>
													<td width="4%" align="center" bgcolor="#EEEEEE">性别</td>
													<td width="11%" align="center" bgcolor="#EEEEEE">出生年月</td>
													<td width="14%" align="center" bgcolor="#EEEEEE">联系电话</td>
													<td width="19%" align="center" bgcolor="#EEEEEE">操作</td>
												</tr>
												<s:iterator value="list" id="emp">
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid" value="${emp.empid}" /></td>
														<td height="20" bgcolor="#FFFFFF">${emp.empno}</td>
														<td bgcolor="#FFFFFF">${emp.empname}</td>
														<td bgcolor="#FFFFFF">${emp.roleid}</td>
														<td bgcolor="#FFFFFF">${emp.emptype}</td>
														<td bgcolor="#FFFFFF">${emp.idcard}</td>
														<td height="20" bgcolor="#FFFFFF">${emp.sex}</td>
														<td height="20" bgcolor="#FFFFFF"><s:property value="#emp.birth" /></td>
														<td height="20" bgcolor="#FFFFFF">${emp.tel}</td>
														<td bgcolor="#FFFFFF"><a href="emp_updateFind.action?id=${emp.empid }">编辑</a>&nbsp;|&nbsp;<a
															href="salary_give.action?emp.empid=${emp.empid}">发工资</a>&nbsp;|&nbsp;<a
															href="yuangongxiangmu.html">项目</a></td>
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