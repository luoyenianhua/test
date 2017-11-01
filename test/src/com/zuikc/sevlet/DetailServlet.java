package com.zuikc.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zuikc.dao.impl.UserInfoDaoImp;
import com.zuikc.entity.Detail;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;
import com.zuikc.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class DetailServlet
 */
@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfo user =(UserInfo) request.getSession().getAttribute("login");
		String goTime = request.getParameter("goTime");
		String reason = request.getParameter("reason");
		String destination = request.getParameter("destination");
		String backTime = request.getParameter("backTime");
		String tel = request.getParameter("tel");
		Detail de=new Detail(user.getUserId(), user.getUserName(), user.getDept(), goTime, reason, destination, backTime, tel);
		UserInfoService us=new UserInfoServiceImpl(new UserInfoDaoImp());
		us.saveUser(ui);
		
		response.sendRedirect("UserListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
