package cn.com.zy.dm.creation.factory.method.impl.product;

import cn.com.zy.dm.creation.factory.method.Product;

public class HuaWei implements Product {

    @Override
    public void sellPrice() {
        System.out.println("HuaWei price is 4888 yuan");
    }
}
