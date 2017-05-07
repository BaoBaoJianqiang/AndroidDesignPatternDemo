package com.example.jianqiang.dp6_5_2;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeleController tc = new TeleController();
        tc.setTemperature(15);
        tc.setTemperature(22);
        tc.setTemperature(30);
    }
}
