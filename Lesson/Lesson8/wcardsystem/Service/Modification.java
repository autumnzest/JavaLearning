package com.wcardsystem.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import com.wcardsystem.Common.Constant;
import com.wcardsystem.Common.Create;
import com.wcardsystem.Common.DBAccess;
import com.wcardsystem.Common.Modify;


public class Modification extends DBAccess implements Modify {

	// 添加
	@Override
	public String modify(String name, String pass) {
		
		ArrayList<String> insertList = new ArrayList<String>();
		insertList.add(pass);
		insertList.add(name);

		String sql = Constant.updateSql;
		int ret;
		try {
			ret = executeUpdate(sql, insertList);
			if (ret == 1) {
				return "修改成功！";
			} else {
				return "修改失败！";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "修改失败！" + e.getMessage();
		}
	}

}
