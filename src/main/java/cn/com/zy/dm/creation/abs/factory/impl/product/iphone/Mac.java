package cn.com.zy.dm.creation.abs.factory.impl.product.iphone;


import cn.com.zy.dm.creation.abs.factory.ComputerProduct;

public class Mac implements ComputerProduct {

    @Override
    public void sellPrice() {
        System.out.println("Iphone computer price is 2000$");
    }
}
