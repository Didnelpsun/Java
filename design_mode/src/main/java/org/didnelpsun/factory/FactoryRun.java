// FactoryRun.java
package org.didnelpsun.factory;

// 工厂模式运行
public class FactoryRun {
    public static void Run() {
        SimpleFactoryRun();
    }

    public static void SimpleFactoryRun() {
        Factory animalFactory = SimpleFactory.createFactory("Animal");
        Factory ballFactory = SimpleFactory.createFactory("Ball");
        if (animalFactory != null) animalFactory.build();
        if (ballFactory != null) ballFactory.build();
    }
}
