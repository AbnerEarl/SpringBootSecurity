package com.itheima.springboot.service;

import com.itheima.springboot.pojo.User;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.service
 * @company www.itheima.com
 */
public interface UserService {
    //通过用户名查询用户信息
    public User selectUserByUsername(String username);
}
