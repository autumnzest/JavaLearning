package maven.sample.sqlmap;

import java.util.List;

import org.springframework.stereotype.Component;

import maven.sample.bean.User;

@Component
public interface UserMapper {

	public List<User> getUser(String str) throws Exception;
}
