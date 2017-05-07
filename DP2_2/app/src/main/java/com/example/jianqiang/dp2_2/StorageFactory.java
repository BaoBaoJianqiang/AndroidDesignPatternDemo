package com.example.jianqiang.dp2_2;

/**
 * Created by jianqiang on 16/8/3.
 */
public class StorageFactory {
    public static AbstractStorage creatStorageFactory(int type) {
        AbstractStorage storage = null;

        switch (type) {
            case 1:
                storage = new SQLite();
                break;
            case 2:
                storage = new File();
                break;
            case 3:
                storage = new XML();
                break;
            default:
                break;
        }

        return storage;
    }
}
