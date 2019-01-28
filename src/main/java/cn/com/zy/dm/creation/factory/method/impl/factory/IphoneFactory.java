package cn.com.zy.dm.creation.factory.method.impl.factory;

import cn.com.zy.dm.creation.factory.method.Factory;
import cn.com.zy.dm.creation.factory.method.Product;
import cn.com.zy.dm.creation.factory.method.impl.product.Iphone;

public class IphoneFactory implements Factory {

    @Override
    public Product newProduct() {
        return new Iphone();
    }
}
