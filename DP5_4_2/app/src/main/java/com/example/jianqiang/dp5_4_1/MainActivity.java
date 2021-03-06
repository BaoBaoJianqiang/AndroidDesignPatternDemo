package com.example.jianqiang.dp5_4_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        //添加第一笔数据
        State state1 = new State();
        state1.name = "jianqiang";
        state1.age = 18;

        originator.setState(state1);
        careTaker.add(originator.createMemento());

        //添加第二笔数据
        State state2 = new State();
        state2.name = "baobao";
        state2.age = 28;

        originator.setState(state2);
        careTaker.add(originator.createMemento());

        //添加第3笔数据
        State state3 = new State();
        state3.name = "16230091";
        state3.age = 38;

        originator.setState(state3);
        careTaker.add(originator.createMemento());


        //取出某一笔数据
        IMemento record = careTaker.getMemento(1);
        State s1 = ((Memento)record).state;
        Log.d("baobao", s1.name);

        //取出上一笔数据
        IMemento record2 = careTaker.restore();
        State s2 = ((Memento)record2).state;
        Log.d("baobao", s2.name);
    }
}
