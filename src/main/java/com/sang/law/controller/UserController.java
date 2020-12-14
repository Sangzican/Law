package com.sang.law.controller;

import com.sang.law.pojo.User;
import com.sang.law.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser") //查询所有
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping("/addUser") //增加用户
    public boolean addUser(@RequestBody User user) {
        user.setId(UUID.randomUUID().toString());
        return userService.addUser(user);
    }

    @RequestMapping("/deleteUserById") //删除用户
    public boolean deleteUserById(String id) {
        return userService.deleteUserById(id);
    }

    @RequestMapping("/login")  //登录
    public User login(String username, String password) {
        return userService.login(username, password);
    }

    @RequestMapping("/updateUser") //修改
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
