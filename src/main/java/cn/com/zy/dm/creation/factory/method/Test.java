package cn.com.zy.dm.creation.factory.method;

import cn.com.zy.dm.creation.factory.method.impl.factory.HuaWeiFactory;
import cn.com.zy.dm.creation.factory.method.impl.factory.IphoneFactory;

public class Test {

    /**
     *  工厂方法模式测试
     *  一个工厂只生产单一的产品
     * @param args
     */
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Factory factory = new IphoneFactory();
        Product product = factory.newProduct();
        product.sellPrice();

        Factory f = new HuaWeiFactory();
        Product p = f.newProduct();
        p.sellPrice();
    }
}
