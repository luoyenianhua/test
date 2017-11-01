package com.zuikc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	private static ComboPooledDataSource cpds = null;
	static{
		cpds = new ComboPooledDataSource("zuikc");
	}
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = cpds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try {
			if(conn!=null){
				conn.close();
			}if(pstmt!=null){
				pstmt.close();
			}if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
