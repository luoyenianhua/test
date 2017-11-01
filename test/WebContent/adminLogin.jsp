<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>管理员登录</h1>
	<form name="form1" method="post" action="LoginServlet?status=0">
            <table width="423" height="140" border="0" align="center" cellpadding="5" cellspacing="1" bgcolor="#8BC53D">
              
              <tr>
                <td width="113" align="right" bgcolor="#FFFFFF" class="font">用户名：</td>
                <td width="287" bgcolor="#FFFFFF"><input type="text" name="name"></td>
              </tr>
              <tr>
                <td align="right" bgcolor="#FFFFFF" class="font">密码：</td>
                <td bgcolor="#FFFFFF"><input type="password" name="pwd" size="20"></td>
              </tr>
              <tr>
                <td bgcolor="#FFFFFF">&nbsp;</td>
                <td bgcolor="#FFFFFF"> <input type="submit" name="Submit" value="登录">
				&nbsp;
				<input type="reset" name="Submit2" value="重置">
              </tr>
            </table>
          </form>          
</body>
</html>