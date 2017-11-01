<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"><style type="text/css">
<!--
body {
	background-image: url(bk.gif);
}
.STYLE1 {
	font-family: "华文楷体";
	font-weight: bold;
}
-->
  </style></head>
  
  <body>
<br>
<br>
<br>
<br>
<br>
<table width="374" height="70" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center"><span class="STYLE1"><font size="+5" color="#0000FF">欢迎启用后台管理</font></span></td>
  </tr>
</table>

  </body>
</html>
