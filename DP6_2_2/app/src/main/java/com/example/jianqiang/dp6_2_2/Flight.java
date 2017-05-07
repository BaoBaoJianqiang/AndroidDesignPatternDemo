package com.example.jianqiang.dp6_2_2;

import java.util.Date;

/**
 * Created by jianqiang on 16/8/18.
 */
public class Flight {
    public Date flightTime;
    public int price;
    public boolean isSellout;

    public Flight(Date flightTime, int price, boolean isSellout) {
        this.flightTime = flightTime;
        this.price = price;
        this.isSellout = isSellout;
    }
}
