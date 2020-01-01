package com.itheima.springboot.proerties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.proerties
 * @company www.itheima.com
 */
@ConfigurationProperties(prefix = "mail")//定义属性的前缀
@Component//交个spring容器管理
public class MailPropertiesConfig {
    private String host;
    private String username;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
