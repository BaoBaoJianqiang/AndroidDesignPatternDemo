package com.example.jianqiang.dp5_3_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Invoker invoker = new Invoker();
        invoker.add(100);
        invoker.devide(10);
        invoker.add(20);

        double result = Calculator.getInstance().getResult();

        Calculator.getInstance().reset();
        invoker.undo();

        double result2 = Calculator.getInstance().getResult();

    }
}
