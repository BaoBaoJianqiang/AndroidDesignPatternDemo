package com.example.jianqiang.dp2_5.factory;

import com.example.jianqiang.dp2_5.getdata.FileGetData;
import com.example.jianqiang.dp2_5.getdata.GetDataFactory;
import com.example.jianqiang.dp2_5.setdata.SetDataFactory;

/**
 * Created by jianqiang on 16/8/3.
 */
public abstract class AbstractFactory {
    public abstract GetDataFactory createGetDataFactory();

    public abstract SetDataFactory createSetDataFactory();
}
