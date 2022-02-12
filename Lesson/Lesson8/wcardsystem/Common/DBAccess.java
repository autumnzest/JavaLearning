package com.wcardsystem.Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.wcardsystem.Model.UserInfo;

public abstract class DBAccess {

	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public static String connectDB() throws SQLException {
		try {
			// 注册 JDBC 驱动
			Class.forName(Constant.JDBC_DRIVER);

			// 打开链接
			conn = DriverManager.getConnection(Constant.DB_URL, Constant.USER, Constant.PASS);
			// String sql = Constant.insertSqlPrepare;
			// pstmt = conn.prepareStatement(sql);
			// pstmt.setString(1, "Test123");
			// pstmt.setString(2, "123456");
			// int ret = pstmt.executeUpdate();
			// System.out.println("ret:" + ret);
			// disconnetDB();

		} catch (Exception e) {
			// 处理 Class.forName 错误
			e.printStackTrace();
			disconnetDB();
		}
		return "DB 连接成功!";
	}

	public static String disconnetDB() throws SQLException {
		conn.close();
		return "DB 连接断开!";
	}

	public static int executeUpdate(String sql, ArrayList<String> insertList) throws SQLException {
		int rev = -1;
		try {
			pstmt = conn.prepareStatement(sql);

			for (int i = 0; i < insertList.size(); i++) {
				pstmt.setString(i + 1, insertList.get(i));
			}

			rev = pstmt.executeUpdate();

			pstmt.close();
		} catch (SQLException e) {
			return rev;
		} finally {
			// conn.close();
		}

		return rev;
	}

	public static ArrayList<UserInfo> executeQuery(String sql)
			throws SQLException {
		
		ArrayList<UserInfo> resultlist = new ArrayList<UserInfo>();
		try {
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			HashMap<String, String> resultMap = new HashMap<String, String>();
			UserInfo userinfo = new UserInfo();
			while (rs.next()) {
//				resultMap.put("id", rs.getString("id"));
//				resultMap.put("username", rs.getString("name"));
//				resultMap.put("password", rs.getString("password"));
//				resultMap.put("age", rs.getString("age"));
//				resultMap.put("wmoney", rs.getString("wmoney"));
				userinfo.setId(rs.getString("id"));
				userinfo.setUsername(rs.getString("name"));
				userinfo.setPassword(rs.getString("password"));
				userinfo.setAge(rs.getString("age"));
				userinfo.setWmoney(rs.getString("wmoney"));
				resultlist.add(userinfo);
			}

			pstmt.close();
		} catch (SQLException e) {
			return resultlist;
		} finally {
			// conn.close();
		}

		return resultlist;
	}
	
}
