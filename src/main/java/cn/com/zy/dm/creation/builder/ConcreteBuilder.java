package cn.com.zy.dm.creation.builder;

/**
 *  具体建造者
 */
public class ConcreteBuilder extends Builder {

    @Override
    void buildDisplay() {
        product.setDisplay("display");
    }

    @Override
    void buildEngine() { ;
        product.setEngine("engine");
    }

    @Override
    void buildKeyboard() {
        product.setKeyboard("key board");
    }

    @Override
    void buildMouse() {
        product.setMouse("mouse");
    }
}
