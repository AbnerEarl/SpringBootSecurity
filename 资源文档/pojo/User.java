package com.itheima.springboot.pojo;

/**
 * @author ljh
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.itheima.springboot.pojo
 * @company www.itheima.com
 */
public class User {
    private Integer id;//主键
    private String username;//用户名(唯一)
    private String password;//密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
