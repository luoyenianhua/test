package com.zuikc.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zuikc.dao.impl.UserInfoDaoImp;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;
import com.zuikc.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String dept = request.getParameter("dept");
		UserInfo ui=new UserInfo(name, pwd, dept);
		UserInfoService us=new UserInfoServiceImpl(new UserInfoDaoImp());
		us.saveUser(ui);
		
		response.sendRedirect("UserListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
