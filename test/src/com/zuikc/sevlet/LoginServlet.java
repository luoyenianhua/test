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
import com.zuikc.util.MD5;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String statu = request.getParameter("status");
		if ("0".equals(statu)) {
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			if ("admin".equals(name)&&"admin".equals(pwd)) {
				response.sendRedirect("frmate.jsp");
			}
		}else{
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			UserInfo ui=new UserInfo();
			ui.setUserName(name);
			ui.setPwd(pwd);
			UserInfoService us=new UserInfoServiceImpl(new UserInfoDaoImp());
			UserInfo userLogin = us.userLogin(ui);
			if (userLogin!=null) {
				request.getSession().setAttribute("login", userLogin);
				response.sendRedirect("detail.jsp");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
