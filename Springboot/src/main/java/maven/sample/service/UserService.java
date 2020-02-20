package maven.sample.service;

import java.util.List;

import maven.sample.bean.User;


public interface UserService {

	public List<User> getUser(String str) throws Exception;
}
