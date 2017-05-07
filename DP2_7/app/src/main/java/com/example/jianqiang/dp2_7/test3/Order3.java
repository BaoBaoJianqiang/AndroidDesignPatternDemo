package com.example.jianqiang.dp2_7.test3;

/**
 * Created by jianqiang on 16/8/4.
 */
public class Order3 implements Cloneable {
    public Order3() {

    }

    public int hotelId;
    public String hotelName;
    public Room room;

    public Object clone() {
        Order3 order = null;

        try {
            order = (Order3)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return order;
    }
}
