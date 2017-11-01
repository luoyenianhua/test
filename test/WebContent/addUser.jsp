<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="form1" method="post" action="RegisterServlet">
	  
        	姓名：<input name="name" type="text" id="name"><br>
        	科室：<input name="dept" type="text" id="dept"><br>
        	密码：<input name="pwd" type="password" id="pwd"><br>
        	<input type="submit" name="Submit" value="添加">
          	&nbsp; 
          	<input type="reset" name="Submit2" value="重置">
	</form>
	
	<table align="center" border="1" cellpadding="5" cellspacing="0" width="80%">
	   <thead>
	       <tr>
	          <th>员工姓名</th>
	          <th>所属科室</th>
	          <th>操作</th>
	       </tr>
	   </thead>
	   <tbody>
	     <c:forEach items="${sessionScope.userList }" var="item">
	       <tr>
	           <td>${item.userName }</td>
	           <td>${item.dept }</td>
	           <td>
			      <a href="queryEmpById?empno=${item.userId }">修改</a>
			      <a href="deleteEmpById?empno=${item.userId }">删除</a>
			   </td>
	       </tr>
	       </c:forEach>
	   </tbody>
	   <tfoot>
	      <tr>
	          <a href="empServlet?currentPage=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	          <a href="empServlet?currentPage=${sessionScope.p.currentPage-1 }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	          <a href="empServlet?currentPage=${sessionScope.p.currentPage+1 }">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	          <a href="empServlet?currentPage=${sessionScope.p.pages }">末页</a>
	      </tr>
	   </tfoot>
	</table>
</body>
</html>