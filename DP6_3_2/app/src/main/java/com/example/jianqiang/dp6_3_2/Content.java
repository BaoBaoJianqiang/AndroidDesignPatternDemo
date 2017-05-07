package com.example.jianqiang.dp6_3_2;

import java.util.ArrayList;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Content {
    private ArrayList<User> userList = new ArrayList<User>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public void notifyUsers() {
        for(User user : userList) {
            user.update();
        }
    }
}
