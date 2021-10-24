package monthsago.travel16.Service;

import monthsago.travel16.Model.User;

import java.util.Map;

public interface UserService {

   public User login(Map<String, String> map) throws Exception;

}