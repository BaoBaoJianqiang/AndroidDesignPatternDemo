package com.example.jianqiang.dp6_1_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Company1 company1 = new Company1();
//        List list = company1.getPersons();
//        for(int i = 0; i < list.size(); i++) {
//            Log.d("baobao", list.get(i).toString());
//        }

        Company1 company1 = new Company1();
        Iterator it = company1.iterator();
        while (it.hasNext()) {
            Log.d("baobao", it.next().toString());
        }

//        Company2 company2 = new Company2();
//        Person[] array = company2.getPersons();
//        for(int i = 0; i < array.length; i++) {
//            Log.d("baobao", array[i].toString());
//        }

        Company2 company2 = new Company2();
        Iterator it2 = company2.iterator();
        while (it2.hasNext()) {
            Log.d("baobao", it2.next().toString());
        }
    }
}
