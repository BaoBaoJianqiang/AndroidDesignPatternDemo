package com.example.jianqiang.dp2_5.factory;

import com.example.jianqiang.dp2_5.getdata.FileGetData;
import com.example.jianqiang.dp2_5.getdata.GetDataFactory;
import com.example.jianqiang.dp2_5.setdata.FileSetData;
import com.example.jianqiang.dp2_5.setdata.SetDataFactory;

/**
 * Created by jianqiang on 16/8/3.
 */
public class FileFactory extends AbstractFactory {

    @Override
    public GetDataFactory createGetDataFactory() {
        return new FileGetData();
    }

    @Override
    public SetDataFactory createSetDataFactory() {
        return new FileSetData();
    }
}
