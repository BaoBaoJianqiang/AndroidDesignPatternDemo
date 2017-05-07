package com.example.jianqiang.dp2_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Product product = null;
        ProductFactory factory = new ProductFactory();

        product = factory.createProductA();
        product = factory.createProductB();


        product = factory.createProduct(ProductB.class);

        product.doSomething();
    }
}
