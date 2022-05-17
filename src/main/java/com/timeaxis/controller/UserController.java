package com.timeaxis.controller;
import com.timeaxis.domain.User;
import com.timeaxis.service.UserService;
import com.timeaxis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService = new UserServiceImpl();
    @RequestMapping("/save")
    //添加新用户
    @ResponseBody
    public String save(@RequestBody User user){
        User _user = userService.findByUsername(user.getUsername());
        if(_user==null){//如果通过用户名查询 发现库中无此人 则可以创建该新用户
            userService.saveUser(user);
            return "success";
        }
        return "fail";
    }
}
