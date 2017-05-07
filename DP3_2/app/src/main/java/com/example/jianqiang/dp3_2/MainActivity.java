package com.example.jianqiang.dp3_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FactoryA factoryA = new A1();
        factoryA.b = new B2();
        factoryA.doSomething();
    }
}
