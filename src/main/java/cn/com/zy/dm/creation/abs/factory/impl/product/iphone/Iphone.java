package cn.com.zy.dm.creation.abs.factory.impl.product.iphone;

import cn.com.zy.dm.creation.abs.factory.MobileProduct;

public class Iphone implements MobileProduct {

    @Override
    public void sellPrice() {
        System.out.println("Iphone mobile price is 600$");
    }
}
