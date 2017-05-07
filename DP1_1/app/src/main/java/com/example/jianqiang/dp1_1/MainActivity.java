package com.example.jianqiang.dp1_1;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    public int type;

    Boat boat;
    Car car;
    Train train;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch (type) {
            case 1:
                boat = new Boat();
                break;
            case 2:
                car = new Car();
                break;
            case 3:
                train = new Train();
                break;
            default:
                break;
        }
    }

    public void setup() {
        switch (type) {
            case 1:
                boat.setup1();
                boat.setup2();
                boat.setup3();
                break;
            case 2:
                car.start1();
                car.start2();
                car.start3();
                break;
            case 3:
                train.startEngine();
                break;
            default:
                break;
        }
    }

    public void drive() {
        switch (type) {
            case 1:
                boat.drive1();
                boat.drive2();
                boat.drive3();
                break;
            case 2:
                car.run1();
                car.run2();
                break;
            case 3:
                train.driveTrain();
                break;
            default:
                break;
        }
    }

    public void stop() {
        switch (type) {
            case 1:
                boat.stop1();
                boat.stop2();
                boat.stop3();
                break;
            case 2:
                car.end1();
                car.end2();
                break;
            case 3:
                train.stopRunning1();
                train.stopRunning2();
                break;
            default:
                break;
        }
    }
}
