package maven.sample.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maven.sample.bean.User;
import maven.sample.service.UserService;
import maven.sample.sqlmap.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getUser(String str) throws Exception{
		return userMapper.getUser(str);
	}

}
