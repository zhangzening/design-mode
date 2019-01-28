package cn.com.zy.dm.creation.abs.factory.impl.factory;

import cn.com.zy.dm.creation.abs.factory.ComputerProduct;
import cn.com.zy.dm.creation.abs.factory.Factory;
import cn.com.zy.dm.creation.abs.factory.MobileProduct;
import cn.com.zy.dm.creation.abs.factory.impl.product.iphone.Iphone;
import cn.com.zy.dm.creation.abs.factory.impl.product.iphone.Mac;

public class IphoneFactory implements Factory {

    @Override
    public MobileProduct newMobileProduct() {
        return new Iphone();
    }

    @Override
    public ComputerProduct newComputerProduct() {
        return new Mac();
    }
}
