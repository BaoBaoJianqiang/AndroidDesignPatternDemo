package com.example.jianqiang.dp4_4_4;

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

            case 4:
                storage = new LogClass(new SQLite());
            case 5:
                storage = new LogClass(new File());
            default:
                break;
        }

        return storage;
    }
}
