<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'frmate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
</head>
  
  <body>
  <table height="729"  border="0" align="center" cellpadding="0" cellspacing="0" class="table" style="margin:-10px auto auto auto">
    <tr>
      <td height="175" align="center" valign="top" >&nbsp;</td>
    </tr>
    
    <tr>
      <td height="32" ><strong><span class="font">后台管理</span></strong></td>
    </tr>
    <tr>
      <td height="450" align="center"><table height="500" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td height="450" class="border"><iframe width="204" height="520" name="left" src="left.jsp"></iframe></td>
            <td width="670"><iframe width="670" height="520" name="main" src="main.jsp" align="middle"></iframe></td>
          </tr>
      </table></td>
    </tr>
  </table>
  </body>
</html>
