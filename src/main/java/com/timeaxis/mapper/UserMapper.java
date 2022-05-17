package com.timeaxis.mapper;
import com.timeaxis.domain.PersonalEvent;
import com.timeaxis.domain.User;
import java.util.List;

/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 */
public interface UserMapper {
    //保存用户
    public void save(User user);
    //根据用户名查询
    public User findByUsername(String username);

}
