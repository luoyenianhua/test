<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	姓名: ${sessionScope.login.userName }  科室: ${sessionScope.login.dept }
	<form name="form1" method="post" action="DetailServlet">
	  
        	离京时间：<input name="goTime" type="text" id="goTime" value="1-1月-2017"><br>
        	离京事由：<input name="reason" type="text" id="reason"><br>
        	前往目的地：<input name="destination" type="text" id="destination"><br>
        	返京时间：<input name="backTime" type="text" id="backTime" value="1-2月-2017"><br>
        	联系方式：<input name="tel" type="text" id="tel"><br>
        	<input type="submit" name="Submit" value="添加">
          	&nbsp; 
          	<input type="reset" name="Submit2" value="重置">
	</form>
</body>
</html>