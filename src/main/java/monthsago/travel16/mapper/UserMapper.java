package monthsago.travel16.mapper;

import monthsago.travel16.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface UserMapper {

    @Autowired
    public User login(Map<String, String> map);
}