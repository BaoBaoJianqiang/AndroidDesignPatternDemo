package com.example.jianqiang.dp1_2;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    public int type;

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch (type) {
            case 1:
                vehicle = new Boat();
                break;
            case 2:
                vehicle = new Car();
                break;
            case 3:
                vehicle = new Train();
                break;
            case 4:
                vehicle = new Subway();
            default:
                break;
        }
    }

    public void setup() {
        vehicle.setup();
    }

    public void drive() {
        vehicle.drive();
    }

    public void stop() {
        vehicle.stop();
    }
}