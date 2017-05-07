package com.example.jianqiang.dp2_7.test4;

/**
 * Created by jianqiang on 16/8/4.
 */
public class Order4 implements Cloneable {
    public Order4() {

    }

    public int hotelId;
    public String hotelName;
    public Room2 room;

    public Object clone() {
        Order4 order = null;

        try {
            order = (Order4)super.clone();
            order.room = (Room2)room.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return order;
    }
}
