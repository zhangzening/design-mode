package cn.com.zy.dm.creation.builder;

abstract class Builder {

    protected Product product = new Product();

    abstract void buildDisplay();
    abstract void buildEngine();
    abstract void buildKeyboard();
    abstract void buildMouse();

    public Product getProduct(){
        return product;
    }

}
