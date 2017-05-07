package com.example.jianqiang.dp6_5_2;

/**
 * Created by jianqiang on 16/8/20.
 */
public class TeleController {
    public State state;

    private AirConditioner airConditioner;

    public TeleController() {
        airConditioner = new AirConditioner();
    }

    public void setTemperature(int temperature) {
        if(temperature > 25) {
            state = new ColdState(airConditioner);
        } else if(temperature < 20) {
            state = new WarmState(airConditioner);
        } else {
            state = new NormalState(airConditioner);
        }

        state.blow();
    }
}
