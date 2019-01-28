package cn.com.zy.dm.creation.abs.factory.impl.product.huawei;

import cn.com.zy.dm.creation.abs.factory.MobileProduct;

public class HuaWei implements MobileProduct {

    @Override
    public void sellPrice() {
        System.out.println("HuaWei mobile price is 4888 yuan");
    }
}
