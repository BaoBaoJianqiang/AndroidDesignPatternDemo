package com.example.jianqiang.dp2_7;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.dp2_7.test1.Order;
import com.example.jianqiang.dp2_7.test2.Order2;
import com.example.jianqiang.dp2_7.test3.Order3;
import com.example.jianqiang.dp2_7.test3.Room;
import com.example.jianqiang.dp2_7.test4.Order4;
import com.example.jianqiang.dp2_7.test4.Room2;
import com.example.jianqiang.dp2_7.test5.Order5;
import com.example.jianqiang.dp2_7.test5.Room5;

import java.io.IOException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doFirstTest();
        doSecondTest();
        doThirdTest();
        doFourthTest();

        try {
            doFifthTest();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void doFirstTest() {
        Order order = new Order();
        order.hotelId = 123;
        order.hotelName = "ABCD";

        Order newOrder = order;
        newOrder.hotelId = 1234;
        newOrder.hotelName = "EFG";

        System.out.print("Original HotelId:" + String.valueOf(order.hotelId) + ", Original HotelName: " + order.hotelName);
    }

    void doSecondTest() {
        Order2 order = new Order2();
        order.hotelId = 123;
        order.hotelName = "ABCD";

        Order2 newOrder = (Order2) order.clone();
        newOrder.hotelId = 1234;
        newOrder.hotelName = "EFG";

        System.out.print("Original HotelId:" + String.valueOf(order.hotelId) + ", Original HotelName: " + order.hotelName);
    }

    void doThirdTest() {
        Room room = new Room();
        room.roomSize = 100;
        room.roomName = "大床房";

        Order3 order = new Order3();
        order.hotelId = 123;
        order.hotelName = "ABCD";
        order.room = room;

        Order3 newOrder = (Order3)order.clone();
        newOrder.hotelId = 1234;
        newOrder.hotelName = "EFG";
        newOrder.room.roomSize = 200;

        System.out.print("Original HotelId:" + String.valueOf(order.hotelId) + ", Original HotelName: " + order.hotelName);
    }

    void doFourthTest() {
        Room2 room = new Room2();
        room.roomSize = 100;
        room.roomName = "大床房";

        Order4 order = new Order4();
        order.hotelId = 123;
        order.hotelName = "ABCD";
        order.room = room;

        Order4 newOrder = (Order4)order.clone();
        newOrder.hotelId = 1234;
        newOrder.hotelName = "EFG";
        newOrder.room.roomSize = 200;

        System.out.print("Original HotelId" + String.valueOf(order.hotelId) + ", Original HotelName: " + order.hotelName);
    }

    void doFifthTest() throws IOException, ClassNotFoundException {
        Room5 room = new Room5();
        room.roomSize = 100;
        room.roomName = "大床房";

        Order5 order = new Order5();
        order.hotelId = 123;
        order.hotelName = "ABCD";
        order.room = room;

        Order5 newOrder = (Order5)order.deepClone();
        newOrder.hotelId = 1234;
        newOrder.hotelName = "EFG";
        newOrder.room.roomSize = 200;

        System.out.print("Original HotelId" + String.valueOf(order.hotelId) + ", Original HotelName: " + order.hotelName);
    }
}
