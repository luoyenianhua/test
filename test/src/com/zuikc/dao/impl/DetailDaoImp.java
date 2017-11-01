package com.zuikc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zuikc.dao.DetailDao;
import com.zuikc.dao.UserInfoDao;
import com.zuikc.entity.Detail;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;
import com.zuikc.util.DBUtil;
import com.zuikc.util.JDBCUtil;

public class DetailDaoImp implements DetailDao {
	

	@Override
	public void saveUser(Detail detail) {
		String sql="insert into detail (userId,userName,dept,goTime,reason,destination,backTime,tel)"
				+ "values(?,?,?,?,?,?,?,?)";
		Object[] params={detail.getUserId(),detail.getUserName(),detail.getDept(),detail.getGoTime(),detail.getReason(),detail.getDestination(),detail.getBackTime(),detail.getTel()};
		JDBCUtil.executeUpdate(sql, params);
	}

	@Override
	public List<Detail> queryUserByDept(String dept) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Detail> userList = new ArrayList<Detail>();
		//第一个占位符 endNo,第二个占位符startNo
		String sql = "SELECT * FROM detail where dept=?";
				
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while(rs.next()){
//				Detail user = new Detail(
//						rs.getInt(1),
//						rs.getString(2),
//						rs.getString(3),
//						rs.getString(4)
//						);
//				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return userList;
	}
	public List<Detail> queryUserByDept(String userName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Detail> userList = new ArrayList<Detail>();
		//第一个占位符 endNo,第二个占位符startNo
		String sql = "SELECT * FROM detail where dept=?";
				
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while(rs.next()){
//				Detail user = new Detail(
//						rs.getInt(1),
//						rs.getString(2),
//						rs.getString(3),
//						rs.getString(4)
//						);
//				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return userList;
	}

	

}
