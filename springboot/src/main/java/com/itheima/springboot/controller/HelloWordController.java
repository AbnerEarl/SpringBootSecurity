package com.itheima.springboot.controller;

import com.itheima.springboot.proerties.MailPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class HelloWordController {

    //使用@value注解获取到属性文件中的值

    @Value("${mailhost}")//属性的名称和applicatioin.properites中的属性名一致
    private String mailhost;

    @Value("${mailusername}")
    private String mailusername;

    @Autowired
    private MailPropertiesConfig mailPropertiesConfig;

    @RequestMapping("/hello")
    @ResponseBody
    public String showHello(){
        System.out.println("获取到的属性的值："+mailhost+">>>>"+mailusername);
        System.out.println("通过java类配置映射得到的值"+mailPropertiesConfig.getHost()+">>>>"+mailPropertiesConfig.getUsername());
        return "hello world";
    }
}
