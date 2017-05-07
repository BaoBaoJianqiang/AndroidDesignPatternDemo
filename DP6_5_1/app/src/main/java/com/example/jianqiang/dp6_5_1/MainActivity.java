package com.example.jianqiang.dp6_5_1;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = new Context();
        context.state = new StateA();
        context.request();;
    }
}
