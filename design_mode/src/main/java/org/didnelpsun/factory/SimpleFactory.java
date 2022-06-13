// SimpleFactory.java
package org.didnelpsun.factory;

// 简单工厂模式
public class SimpleFactory {
    public static Factory createFactory(String type) {
        if ("Animal".equals(type)) return new AnimalFactory();
        else if ("Ball".equals(type)) return new BallFactory();
        else return null;
    }
}
