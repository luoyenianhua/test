package com.zuikc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JDBCUtil {
	public static void executeUpdate(String sql,Object[]params){
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			if(params!=null){
				for(int i = 0;i<params.length;i++){
					pstmt.setObject(i+1, params[i]);
				}
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
	}
	/*public static <T> List<T> queryAll(String sql,T t,Object[]params){
		ResultSetMetaData
		return null;
	}*/
	
	
	
	
	
	
	
	
	
	
}
