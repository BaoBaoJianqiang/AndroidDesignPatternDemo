package com.example.jianqiang.dp6_2_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class MainActivity extends Activity {
    ArrayList<Flight> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init data
        DateFormat dateFormat =  new SimpleDateFormat("yyyyMMdd");
        list = new ArrayList<Flight>();
        try {
            list.add(new Flight(dateFormat.parse("20160801"), 200, true));
            list.add(new Flight(dateFormat.parse("20160802"), 100, false));
            list.add(new Flight(dateFormat.parse("20160803"), 400, true));
            list.add(new Flight(dateFormat.parse("20160804"), 300, false));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //策略1
        Context context = new Context(new SortStrategy() {
            @Override
            public void sort() {
                for(int i = 0; i < list.size() ; i++) {
                    for(int j = i+1; j < list.size(); j++) {
                        if(list.get(i).price > list.get(j).price) {
                            Collections.swap(list, i, j);
                        }
                    }
                }
            }
        });

        context.sort();

        //策略2
        context = new Context(new SortStrategy() {
            @Override
            public void sort() {
                for(int i = 0; i < list.size() ; i++) {
                    for(int j = i+1; j < list.size(); j++) {
                        if(list.get(i).price < list.get(j).price) {
                            Collections.swap(list, i, j);
                        }
                    }
                }
            }
        });

        context.sort();

        //Use Comparator
        Comparator<Flight> comparator = new Comparator<Flight>() {

            @Override
            public int compare(Flight f1, Flight f2) {
                if(f1.price < f2.price)
                    return -1;
                else if(f1.price > f2.price)
                    return 1;
                else
                    return 0;
            }
        };

        Collections.sort(list, comparator);
    }
}
