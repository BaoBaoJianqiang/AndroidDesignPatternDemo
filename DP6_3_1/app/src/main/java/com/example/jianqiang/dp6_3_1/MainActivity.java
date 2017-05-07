package com.example.jianqiang.dp6_3_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Subject subject = new ConcreteSubject();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.notifyObservers();
    }
}
