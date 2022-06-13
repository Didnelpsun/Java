// CheckSingleton.java
package org.didnelpsun.singleton;

// 双检锁式单例模式
public class CheckSingleton extends Singleton {
    // 懒汉式首先定义静态变量
    private static volatile Singleton INSTANCE = new CheckSingleton();

    // 将构造方法设为私有从而禁止外部构造
    private CheckSingleton() {
    }

    public static Singleton getInstance() {
        // 如果没有才实例化
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) INSTANCE = new CheckSingleton();
            }
        }
        return INSTANCE;
    }
}
