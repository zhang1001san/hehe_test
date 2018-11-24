package com.it.domain;

import java.io.Serializable;

/**
 * @author  Administrator
 * @创建时间 2018/8/18
 * @描述  账户实体类
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 2190011887917379009L;
    private String username;
    private  Integer money;
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
