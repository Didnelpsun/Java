// MethodFactory.java
package org.didnelpsun.factory;

// 工厂方法模式
public class MethodFactory {
    public static Factory createFactory(String type) {
        if ("Animal".equals(type)) return new AnimalFactory();
        else if ("Ball".equals(type)) return new BallFactory();
        else return null;
    }
}
