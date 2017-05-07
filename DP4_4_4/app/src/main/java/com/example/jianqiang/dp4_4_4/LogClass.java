package com.example.jianqiang.dp4_4_4;

/**
 * Created by jianqiang on 16/8/3.
 */
public class LogClass extends AbstractStorage {
    private AbstractStorage myStorage;

    public LogClass(AbstractStorage myStorage) {
        this.myStorage = myStorage;
    }

    @Override
    public Object getData(String key) {
        writeLog(key);
        return myStorage.getData(key);
    }

    @Override
    public void setData(String key, Object value) {
        writeLog(key);
        writeLog(value.toString());

        myStorage.setData(key, value);
    }

    void writeLog(String log) {
        System.out.println(log);
    }
}
