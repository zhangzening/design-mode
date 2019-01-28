package cn.com.zy.dm.creation.abs.factory.impl.factory;

import cn.com.zy.dm.creation.abs.factory.ComputerProduct;
import cn.com.zy.dm.creation.abs.factory.Factory;
import cn.com.zy.dm.creation.abs.factory.MobileProduct;
import cn.com.zy.dm.creation.abs.factory.impl.product.huawei.HuaWei;
import cn.com.zy.dm.creation.abs.factory.impl.product.huawei.HuaWeiComputer;

public class HuaWeiFactory implements Factory {

    @Override
    public MobileProduct newMobileProduct() {
        return new HuaWei();
    }

    @Override
    public ComputerProduct newComputerProduct() {
        return new HuaWeiComputer();
    }
}
