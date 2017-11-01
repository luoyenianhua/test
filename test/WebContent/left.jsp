<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  <body>
	  <table width="180" height="96" border="0" cellpadding="0" cellspacing="0">
	    <tr>
	      <td width="170" align="center"><strong class="font">欢迎管理员：<font color="blue"></font></strong><br>
	    </tr>
	  </table>
	 		
	  <table cellspacing="1" cellpadding="4" width="180"class="tableborder" id="1" >
		<TR class=altbg1>
			<TD height=25 width="100%" align="center" bgcolor="#D6E0EF">
								
				<a class="menu" target="main" href="UserListServlet">维护职员信息</a>
			</TD>
		</TR>
		<TR class=altbg1>
			<TD height=25 width="100%" align="center"  bgcolor="#D6E0EF">
								
				<a class="menu" target="main" href="DetailServlet">统计离京人员信息</a>	
			</TD>
		</TR>
	  </table> 

			
  </body>
</html>
