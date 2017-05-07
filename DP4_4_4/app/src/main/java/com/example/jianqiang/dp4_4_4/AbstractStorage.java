package com.example.jianqiang.dp4_4_4;

/**
 * Created by jianqiang on 16/8/3.
 */
public abstract class AbstractStorage {
    public abstract Object getData(String key);

    public abstract void setData(String key, Object value);
}