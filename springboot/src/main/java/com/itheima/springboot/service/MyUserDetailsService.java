package com.itheima.springboot.service;

import com.itheima.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.service
 * @company www.itheima.com
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("登录的用户名为："+username);
        //密码需要从数据库查询出来
        //调用数据库中的用户名对应的用户信息将密码获取到
        com.itheima.springboot.pojo.User user = userMapper.selectUserByUsername(username);
        if(user==null){
            return null;
        }
        String password =passwordEncoder.encode(user.getPassword());//为了测试 需要对密码进行加密。说明一点这里应当不需要做任何的处理的，为了测试，才需要加密，而加密的处理动作应当在用户注册的时候操作
        System.out.println("验证的密码加密后的数据为："+password);
        //判断用户是否已经被冻结
        boolean flagnolocked=true;
        return new User(username,password,true,true,true,flagnolocked, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        //return new User(username,password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        return new User(username,"12345", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
