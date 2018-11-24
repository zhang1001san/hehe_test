package com.it.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 3599181289133726896L;

    private String name;
    private List<Order> orderList;
    private Map<String,Order> orderMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Map<String, Order> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", orderList=" + orderList +
                ", orderMap=" + orderMap +
                '}';
    }
}
