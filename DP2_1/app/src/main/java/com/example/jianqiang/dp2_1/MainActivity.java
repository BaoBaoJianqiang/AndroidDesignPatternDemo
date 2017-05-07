package com.example.jianqiang.dp2_1;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            CreateA.creatAFactory(1).Do();
        }
        catch (NullPointerException e){
            System.out.println("No this type");
        }

    }
}
