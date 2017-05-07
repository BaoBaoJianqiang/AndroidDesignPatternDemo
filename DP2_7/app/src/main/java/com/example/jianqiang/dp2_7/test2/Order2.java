package com.example.jianqiang.dp2_7.test2;

/**
 * Created by jianqiang on 16/8/4.
 */
public class Order2 implements Cloneable {
    public Order2() {

    }

    public int hotelId;
    public String hotelName;

    public Object clone() {
        Order2 order = null;

        try {
            order = (Order2)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return order;
    }
}
