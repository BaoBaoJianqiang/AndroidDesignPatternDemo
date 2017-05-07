package com.example.jianqiang.dp6_5_2;

/**
 * Created by jianqiang on 16/8/20.
 */
public class NormalState extends State {

    public NormalState(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void blow() {
        this.airConditioner.blowNormal();
    }
}
