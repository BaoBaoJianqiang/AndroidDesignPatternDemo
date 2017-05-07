package com.example.jianqiang.dp5_1_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Helm a1 = new Helm();
        Armor a2 = new Armor();
        Shield a3 = new Shield();

        Person person = new Person();
        person.HP = 100;
        person.root = a1;
        a1.next = a2;
        a2.next = a3;

        person.achieveHarm(AttackType.fire);
        person.achieveHarm(AttackType.magic);
    }
}
