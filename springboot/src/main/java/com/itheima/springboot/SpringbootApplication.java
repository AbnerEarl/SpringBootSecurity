package com.itheima.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//这个注解会自动的扫描这个类所在的包的子包下的所有的bean 初始化
@MapperScan(basePackages = "com.itheima.springboot.mapper")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
