package com.example.jianqiang.dp4_4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConcreteComponent c = new ConcreteComponent();
        c.operate();

        ConcreteDecoratorA c1 = new ConcreteDecoratorA(c);
        c1.operate();

        ConcreteDecoratorB c2 = new ConcreteDecoratorB(c1);
        c2.operate();
    }
}
