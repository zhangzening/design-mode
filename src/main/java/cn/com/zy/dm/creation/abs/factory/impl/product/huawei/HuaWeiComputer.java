package cn.com.zy.dm.creation.abs.factory.impl.product.huawei;

import cn.com.zy.dm.creation.abs.factory.ComputerProduct;

public class HuaWeiComputer implements ComputerProduct {

    @Override
    public void sellPrice() {
        System.out.println("HuaWei computer price is 7888 yuan");
    }
}
