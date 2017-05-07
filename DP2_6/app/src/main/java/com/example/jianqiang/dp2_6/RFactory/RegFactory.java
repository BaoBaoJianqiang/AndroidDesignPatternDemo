package com.example.jianqiang.dp2_6.RFactory;

import java.util.HashMap;

/**
 * Created by jianqiang on 16/8/3.
 */
public class RegFactory {
    private static RegFactory mySingleton = null;

    private RegFactory() {
        objReg = new HashMap<String, NewSubject>();
    }

    public static RegFactory getInstance() {
        if(mySingleton == null)
            mySingleton = new RegFactory();

        return mySingleton;
    }


    private HashMap<String, NewSubject> objReg;

    public NewSubject getValue(String key) {
        if(objReg.containsKey(key))
            return objReg.get(key);

        return null;
    }

    public void setValue(String key, NewSubject value) {
        objReg.put(key, value);
    }
}