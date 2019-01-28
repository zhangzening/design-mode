package cn.com.zy.dm.creation.single;

public class Test {

    /**
     *  单例模式测试
     *  懒汉式和饿汉式
     * @param args
     */
    public static void main(String[] args) {

        // 懒汉式
        LazySingleton lazy = LazySingleton.getInstance();
        lazy.print();

        // 饿汉式
        HungrySingleton hungry = HungrySingleton.getInstance();
        hungry.print();
    }
}
