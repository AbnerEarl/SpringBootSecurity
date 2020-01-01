package com.itheima.springboot.controller;

import com.itheima.springboot.pojo.User;
import com.itheima.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.controller
 * @company www.itheima.com
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user/info")
    @ResponseBody
    public User selectUser(){
       return  userService.selectUserByUsername("zhangsan");
    }
}
