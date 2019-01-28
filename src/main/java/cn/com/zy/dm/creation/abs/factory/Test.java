package cn.com.zy.dm.creation.abs.factory;

import cn.com.zy.dm.creation.abs.factory.impl.factory.HuaWeiFactory;
import cn.com.zy.dm.creation.abs.factory.impl.factory.IphoneFactory;

public class Test {

    /**
     *  抽象工厂模式测试
     *  一个工厂类，不再生产单一的产品，而是多元化，既生产手机也生产电脑
     * @param args
     */
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Factory factory = new IphoneFactory();
        MobileProduct mobileProduct = factory.newMobileProduct();
        ComputerProduct computerProduct = factory.newComputerProduct();
        mobileProduct.sellPrice();
        computerProduct.sellPrice();

        Factory f = new HuaWeiFactory();
        MobileProduct mobile = f.newMobileProduct();
        ComputerProduct computer = f.newComputerProduct();
        mobile.sellPrice();
        computer.sellPrice();
    }
}
