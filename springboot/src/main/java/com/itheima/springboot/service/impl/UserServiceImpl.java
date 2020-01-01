package com.itheima.springboot.service.impl;

import com.itheima.springboot.mapper.UserMapper;
import com.itheima.springboot.pojo.User;
import com.itheima.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.service.impl
 * @company www.itheima.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }
}
