package com.zuikc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zuikc.dao.UserInfoDao;

import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;
import com.zuikc.util.DBUtil;
import com.zuikc.util.JDBCUtil;

public class UserInfoDaoImp implements UserInfoDao {
	
	@Override
	public UserInfo userLogin(UserInfo userInfo) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		UserInfo user=null;
		String sql="select*from userinfo where userName=? and pwd=?";
		conn=DBUtil.getConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userInfo.getUserName());
			pstmt.setString(2, userInfo.getPwd());
			rs=pstmt.executeQuery();
			while (rs.next()) {
				user=new UserInfo(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4)
				);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return user;
				
		
	}

	@Override
	public void saveUser(UserInfo userInfo) {
		String sql="insert into UserInfo (userId,userName,pwd,dept)"
				+ "values(seq_userinfo.nextval,?,?,?)";
		Object[] params={userInfo.getUserName(),userInfo.getPwd(),userInfo.getDept()};
		JDBCUtil.executeUpdate(sql, params);
	}

	@Override
	public List<UserInfo> queryUserByPage(Page page) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserInfo> userList = new ArrayList<UserInfo>();
		//第一个占位符 endNo,第二个占位符startNo
		String sql = "SELECT * FROM "
				+ "( SELECT A.*, ROWNUM RN FROM (SELECT * FROM userinfo) A WHERE ROWNUM <= ?) "
				+ "WHERE RN >= ? "; 
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, page.getEndNo());
			pstmt.setInt(2, page.getStartNo());
			rs = pstmt.executeQuery();
			while(rs.next()){
				UserInfo user = new UserInfo(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return userList;
	}

	@Override
	public void deleteUser(int userid) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=DBUtil.getConnection();
		String sql="delete from userinfo where userId=?";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
	}

	@Override
	public int queryRows() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=DBUtil.getConnection();
		String sql="select count(*)from userinfo";
		int rows=0;
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				rows=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return rows;
	}
	

}
