package cn.com.zy.dm.creation.single;

public class HungrySingleton {

    private static HungrySingleton hungry = new HungrySingleton();

    /**
     *  饿汉模式：线程安全，适合用于多线程
     * @return
     */
    public static HungrySingleton getInstance() {
        return hungry;
    }

    public void print() {
        System.out.println("我是饿汉模式");
    }
}
