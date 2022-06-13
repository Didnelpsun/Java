// EnumSingleton.java
package org.didnelpsun.singleton;

// 枚举式单例模式
public enum EnumSingleton {
    // 实例常量
    INSTANCE;
    // 获取常量方法
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
