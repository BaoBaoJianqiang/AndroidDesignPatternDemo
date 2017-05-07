package com.example.jianqiang.dp2_5.factory;

import com.example.jianqiang.dp2_5.getdata.FileGetData;
import com.example.jianqiang.dp2_5.getdata.GetDataFactory;
import com.example.jianqiang.dp2_5.getdata.XMLGetData;
import com.example.jianqiang.dp2_5.setdata.SetDataFactory;
import com.example.jianqiang.dp2_5.setdata.XMLSetData;

/**
 * Created by jianqiang on 16/8/3.
 */
public class XMLFactory extends AbstractFactory {

    @Override
    public GetDataFactory createGetDataFactory() {
        return new XMLGetData();
    }

    @Override
    public SetDataFactory createSetDataFactory() {
        return new XMLSetData();
    }
}
