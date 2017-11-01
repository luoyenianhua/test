package com.zuikc.sevlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zuikc.dao.impl.UserInfoDaoImp;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;
import com.zuikc.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfoService fs=new UserInfoServiceImpl(new UserInfoDaoImp());
		int rows=fs.queryRows();
		Page.PAGE_SIZE=10;
		int pages = rows%Page.PAGE_SIZE==0?rows/Page.PAGE_SIZE:rows/Page.PAGE_SIZE+1;
		Page page = new Page();
		int currentPage = -1;
		if(request.getParameter("currentPage")==null){
			currentPage = 1;
		}
		else{
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		if(currentPage<1){
			currentPage = 1;
		}
		if(currentPage>=pages){
			currentPage = pages;
		}
		int startNo = (currentPage-1)*Page.PAGE_SIZE+1;
		int endNo = startNo+Page.PAGE_SIZE-1;
		page.setRows(rows);
		page.setPages(pages);
		page.setCurrentPage(currentPage);
		page.setStartNo(startNo);
		page.setEndNo(endNo);
		 List<UserInfo> userList = fs.queryUserByPage(page);
		
		HttpSession session = request.getSession();
		session.setAttribute("userList", userList);
		session.setAttribute("p", page);
		response.sendRedirect("addUser.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
