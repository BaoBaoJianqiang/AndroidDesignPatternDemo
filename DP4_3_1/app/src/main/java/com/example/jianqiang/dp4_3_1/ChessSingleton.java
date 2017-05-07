package com.example.jianqiang.dp4_3_1;

/**
 * Created by jianqiang on 16/8/3.
 */
public class ChessSingleton {
    private static ChessSingleton mySingleton = null;

    private Chess blackChess, whiteChess;

    private ChessSingleton() {
        blackChess = new Chess("#000000", 10.0, 10.0);
        whiteChess = new Chess("#ffffff", 10.0, 10.0);
    }

    public static ChessSingleton getInstance() {
        if (mySingleton == null)
            mySingleton = new ChessSingleton();

        return mySingleton;
    }

    public void play(int n, int x, int y) {
        if (n == ChessEnum.Black)
            blackChess.draw(x, y);
        else
            whiteChess.draw(x, y);
    }
}