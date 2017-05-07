package com.example.jianqiang.dp2_3;

/**
 * Created by jianqiang on 16/8/3.
 */
public class ProductFactory {
    public Product createProductA() {
        return new ProductA();
    }

    public Product createProductB() {
        return new ProductB();
    }

    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;

        try {
            product = (Product)Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)product;
    }
}
