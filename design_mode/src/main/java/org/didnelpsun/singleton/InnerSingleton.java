// InnerSingleton.java
package org.didnelpsun.singleton;

// 内部类式单例模式
public class InnerSingleton extends Singleton {
    // 将构造方法设为私有从而禁止外部构造
    private InnerSingleton() {
    }

    // 声明一个静态内部类，中声明一个静态实例
    private static class Inner {
        // Inner类可以调用InnerSingleton类的构造方法为自己成员赋值
        // 定义实例成员
        private final static InnerSingleton INSTANCE = new InnerSingleton();
    }

    // 通过方法获取静态实例
    public static Singleton getInstance() {
        // 返回内部类的成员
        return Inner.INSTANCE;
    }
}
