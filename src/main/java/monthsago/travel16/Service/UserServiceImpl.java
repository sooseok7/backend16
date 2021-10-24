package monthsago.travel16.Service;

import monthsago.travel16.Model.User;
import monthsago.travel16.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService {

    public UserMapper userMapper;

    public User login(Map<String, String> map) throws Exception {
        return userMapper.login(map);
    }
}
