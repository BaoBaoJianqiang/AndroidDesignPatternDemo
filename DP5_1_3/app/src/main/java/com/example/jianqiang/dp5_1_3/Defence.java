package com.example.jianqiang.dp5_1_3;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/13.
 */
public abstract class Defence {
    public Defence next;

    public abstract boolean handleRequest(int type);

    //true表示挡住了，false表示没挡住
    public boolean defence(int type) {
        boolean result = true;

        if (! handleRequest(type)) {
            if (next != null) {
                next.defence(type);
            } else {
                Log.d("baobao", "已经到达尽头，无法对其进行处理！");
                result = false;
            }
        }

        return result;
    }
}