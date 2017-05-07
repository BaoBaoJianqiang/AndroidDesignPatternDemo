package com.example.jianqiang.dp4_4_4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        StorageFactory.creatStorageFactory(1).setData("jianqiang", 1);
//        Object value = StorageFactory.creatStorageFactory(1).getData("jianqiang");

        StorageFactory.creatStorageFactory(4).setData("jianqiang", 1);
        Object value = StorageFactory.creatStorageFactory(4).getData("jianqiang");
    }
}
