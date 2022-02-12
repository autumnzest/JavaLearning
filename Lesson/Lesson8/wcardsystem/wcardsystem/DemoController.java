package com.wcardsystem.wcardsystem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcardsystem.Common.DBAccess;
import com.wcardsystem.Model.UserInfo;
import com.wcardsystem.Service.Modification;
import com.wcardsystem.Service.Register;
import com.wcardsystem.Service.SearchData;

@RestController
public class DemoController extends DBAccess{

	@GetMapping("/hello")
	public String hello(String id, String name) {
		return id + ",hello " + name;
	}

	// http://localhost:8080/query
	@GetMapping("/query")
	public ArrayList<UserInfo> select() {
		// 结果集数据
		SearchData sd = new SearchData();
		return sd.selectAll();
	}

	@GetMapping("/connect")
	public String connect() throws SQLException {
		return connectDB();
	}

	@GetMapping("/disconnect")
	public String disconnect() throws SQLException {
		return disconnetDB();
	}

	@GetMapping("/create")
	public String create(String name, String pass, String age) throws SQLException {
		Register reg = new Register();
		return reg.insert(name, pass, age);
	}
	
	@GetMapping("/modify")
	public String modify(String name, String pass) throws SQLException {
		Modification mod = new Modification();
		return mod.modify(name, pass);
	}
}
