package com.wcardsystem.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import com.wcardsystem.Common.Constant;
import com.wcardsystem.Common.Create;
import com.wcardsystem.Common.DBAccess;


public class Register extends DBAccess implements Create {

	// 添加
	@Override
	public String insert(String name, String pass, String age) {
		
		ArrayList<String> insertList = new ArrayList<String>();
		insertList.add(name);
		insertList.add(pass);
		insertList.add(age);

		String sql = Constant.insertSqlPrepare;
		int ret;
		try {
			ret = executeUpdate(sql, insertList);
			if (ret == 1) {
				return "注册成功！";
			} else {
				return "注册失败！";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "注册失败！" + e.getMessage();
		}
	}

}
