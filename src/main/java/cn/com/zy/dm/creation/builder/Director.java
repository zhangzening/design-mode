package cn.com.zy.dm.creation.builder;

/**
 *  指挥者
 */
public class Director {

    private ConcreteBuilder concreteBuilder;

    public Director(ConcreteBuilder concreteBuilder) {
        this.concreteBuilder = concreteBuilder;
    }

    public Product construct() {
        concreteBuilder.buildDisplay();
        concreteBuilder.buildEngine();
        concreteBuilder.buildKeyboard();
        concreteBuilder.buildMouse();

        return concreteBuilder.getProduct();
    }
}
