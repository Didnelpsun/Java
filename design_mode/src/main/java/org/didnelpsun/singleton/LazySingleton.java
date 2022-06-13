// LazySingleton.java
package org.didnelpsun.singleton;

// 懒汉式单例模式
public class LazySingleton extends Singleton {
    // 懒汉式首先定义静态变量
    private static Singleton INSTANCE = new LazySingleton();

    // 将构造方法设为私有从而禁止外部构造
    private LazySingleton() {
    }

    public static Singleton getInstance() {
        // 如果没有才实例化
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
