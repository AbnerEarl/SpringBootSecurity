package com.itheima.springboot.mapper;

import com.itheima.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.mapper
 * @company www.itheima.com
 */
//@Mapper//spring管理接口的实现类的代理对象
public interface UserMapper {
    //根据用户名查询用户的信息
    @Select(value = "select * from user where username=#{username}")
    public User selectUserByUsername(String username);
}
