package com.example.jianqiang.dp6_5_2;

/**
 * Created by jianqiang on 16/8/20.
 */
public class WarmState extends State{

    public WarmState(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void blow() {
        this.airConditioner.blowWarm();
    }
}
