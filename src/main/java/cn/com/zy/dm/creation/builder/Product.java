package cn.com.zy.dm.creation.builder;

public class Product {

    private String display;
    private String engine;
    private String keyboard;
    private String mouse;

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void show() {
        System.out.println(display);
        System.out.println(engine);
        System.out.println(keyboard);
        System.out.println(mouse);
    }
}
