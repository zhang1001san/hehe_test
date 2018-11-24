package com.it.domain;

import java.io.Serializable;

/**
 * @author  Administrator
 * @创建时间 2018/8/18
 * @描述
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 611940625985096938L;

    //订单号
    private String orderName;
    //订单金额
    private  Double money;


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", money=" + money +
                '}';
    }
}
