package cn.com.zy.dm.creation.single;

public class LazySingleton {

    private static volatile LazySingleton lazy = null;

    /**
     *  懒汉模式：线程不安全，需要加“synchronized”和 “volatile”关键字，但在多线程中，影响性能，消耗更多资源
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (null == lazy){
            lazy =  new LazySingleton();
        }
        return lazy;
    }

    public void print() {
        System.out.println("我是懒汉模式");
    }
}
