package com.example.jianqiang.dp2_2;

import android.app.Activity;
import android.icu.text.DateFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StorageFactory.creatStorageFactory(1).setData("jianqiang", 1);
        Object value = StorageFactory.creatStorageFactory(1).getData("jianqiang");
    }
}
