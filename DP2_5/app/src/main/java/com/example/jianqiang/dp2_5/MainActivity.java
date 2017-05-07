package com.example.jianqiang.dp2_5;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jianqiang.dp2_5.factory.AbstractFactory;
import com.example.jianqiang.dp2_5.factory.XMLFactory;
import com.example.jianqiang.dp2_5.getdata.GetDataFactory;
import com.example.jianqiang.dp2_5.setdata.SetDataFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory af = new XMLFactory();

        GetDataFactory df = af.createGetDataFactory();
        df.getData();

        SetDataFactory df2 = af.createSetDataFactory();
        df2.setData();
    }
}
