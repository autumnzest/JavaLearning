package com.wcardsystem.Common;

public class Constant {
	
	// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/javaStudy?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

	// 数据库的用户名与密码，需要根据自己的设置
	public static final String USER = "root";
	public static final String PASS = "1234";
	
	public static final String selectSql="select * from User";
	
	public static final String insertSqlPrepare="insert into User(name,password,age)values(?,?,?)";
	
	public static final String insertSql="";
	
	public static final String updateSql="update User set password = ? where name = ?";
	
	public static final String deleteSql="delete from UserInfo where username = ?";

}
