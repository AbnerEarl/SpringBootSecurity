package com.itheima.springboot;

import com.itheima.springboot.mapper.UserMapper;
import com.itheima.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {


	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = userMapper.selectUserByUsername("zhangsan");
		System.out.println(user.getUsername());
	}

}
