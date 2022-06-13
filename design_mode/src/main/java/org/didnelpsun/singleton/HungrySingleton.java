// HungrySingleton.java
package org.didnelpsun.singleton;

// 饿汉式单例模式
public class HungrySingleton extends Singleton {
    // 饿汉式直接定义一个实例作为静态变量
    private static final Singleton INSTANCE = new HungrySingleton();

    // 将构造方法设为私有从而禁止外部构造
    private HungrySingleton() {
    }

    // 通过方法获取静态实例
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
