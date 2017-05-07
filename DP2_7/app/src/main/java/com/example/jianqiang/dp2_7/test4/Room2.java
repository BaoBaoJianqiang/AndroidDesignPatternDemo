package com.example.jianqiang.dp2_7.test4;

/**
 * Created by jianqiang on 16/8/4.
 */
public class Room2 implements Cloneable {
    public Room2() {

    }

    public int roomSize;
    public String roomName;

    public Room2 clone() {
        Room2 room = null;

        try {
            room = (Room2)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return room;
    }
}
