package cn.com.zy.dm.creation.builder;

public class Test {

    /**
     *  建造者模式测试
     * @param args
     */
    public static void main(String[] args) {
        ConcreteBuilder cb =  new ConcreteBuilder();
        Director director = new Director(cb);
        Product product = director.construct();
        product.show();
    }
}
