package cn.com.zy.dm.creation.factory.method.impl.product;

import cn.com.zy.dm.creation.factory.method.Product;

public class Iphone implements Product {

    @Override
    public void sellPrice() {
        System.out.println("Iphone price is 600$");
    }
}
