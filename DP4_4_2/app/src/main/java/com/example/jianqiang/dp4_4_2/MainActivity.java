package com.example.jianqiang.dp4_4_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        西红柿炒鸡蛋 cai = new 西红柿炒鸡蛋();
        加糖的西红柿炒鸡蛋 cai1 = new 加糖的西红柿炒鸡蛋(cai);
        加糖的西红柿炒鸡蛋 cai2 = new 加糖的西红柿炒鸡蛋(cai1);
        加盐的西红柿炒鸡蛋 cai3 = new 加盐的西红柿炒鸡蛋(cai2);

        cai3.炒菜();
    }
}
