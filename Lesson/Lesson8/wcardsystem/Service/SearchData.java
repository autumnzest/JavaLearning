package com.wcardsystem.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.wcardsystem.Common.Constant;
import com.wcardsystem.Common.DBAccess;
import com.wcardsystem.Model.UserInfo;

public class SearchData {

	public ArrayList<UserInfo> selectAll() {
		
//		ArrayList<HashMap<String, String>> userlist = new ArrayList<HashMap<String, String>>();
		ArrayList<UserInfo> userlist = new ArrayList<UserInfo>();
		
		String sql = Constant.selectSql;

		try {
			userlist = DBAccess.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return userlist;
	}

}
