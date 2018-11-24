package com.it.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 338100385681645342L;

    private  String name;
    //@DateTimeFormat(pattern = "yyyy-MM-dd") //设置字符串转换为日期的格式
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
