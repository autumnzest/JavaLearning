package maven.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import maven.sample.bean.User;
import maven.sample.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private User user;

	@RequestMapping("/list")
	public List<User> index() throws Exception{
		return userService.getUser("60000002321");
	}

	@RequestMapping("/hello")
	public String hello() throws Exception{
		return "hello";
	}
}
