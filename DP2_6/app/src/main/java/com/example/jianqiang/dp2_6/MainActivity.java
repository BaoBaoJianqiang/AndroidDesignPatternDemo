package com.example.jianqiang.dp2_6;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.dp2_6.MultiSingleton.MultiSingleton;
import com.example.jianqiang.dp2_6.MultiSingleton.Subject;
import com.example.jianqiang.dp2_6.RFactory.NewSubject;
import com.example.jianqiang.dp2_6.RFactory.RegFactory;
import com.example.jianqiang.dp2_6.Singleton.Singleton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //单例
        Singleton.getInstance().Do();

        //多例
        Subject s = MultiSingleton.getInstance().Do(1);

        //注册工厂
        RegFactory.getInstance().setValue("jianqiang", new NewSubject());
        RegFactory.getInstance().setValue("baobao", new NewSubject());

        NewSubject subject = RegFactory.getInstance().getValue("baobao");
        subject.Do();
    }
}
