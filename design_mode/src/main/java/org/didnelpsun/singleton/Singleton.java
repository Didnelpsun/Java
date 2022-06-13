// Singleton.java
package org.didnelpsun.singleton;

// 单例模式
public class Singleton {
    // 静态成员变量实例
    private static Singleton INSTANCE;

    // 构造方法设为保护
    protected Singleton() {

    }

    // 获取实例方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
