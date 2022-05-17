package com.timeaxis.service;

import com.timeaxis.domain.PersonalEvent;
import com.timeaxis.domain.User;

/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 */
public interface UserService {
    //根据用户名查找用户
    public User findByUsername(String username);
    //保存新的用户
    public void saveUser(User user);

}
