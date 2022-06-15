// FactoryRun.java
package org.didnelpsun.factory;

// 工厂模式运行
public class FactoryRun {
    public static void Run() {
//        SimpleFactoryRun();
//        MethodFactoryRun();
        AbstractFactoryRun();
    }

    public static void SimpleFactoryRun() {
        Factory animalFactory = SimpleFactory.createFactory("Animal");
        Factory ballFactory = SimpleFactory.createFactory("Ball");
        if (animalFactory != null) animalFactory.build();
        if (ballFactory != null) ballFactory.build();
    }

    public static void MethodFactoryRun() {
        MethodAnimalFactory methodAnimalFactory = new MethodAnimalFactory();
        Factory animalFactory = methodAnimalFactory.createFactory();
        MethodBallFactory methodBallFactory = new MethodBallFactory();
        Factory ballFactory = methodBallFactory.createFactory();
        if (animalFactory != null) animalFactory.build();
        if (ballFactory != null) ballFactory.build();
    }

    public static void AbstractFactoryRun () {
        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        abstractFactory.createAnimal().build();
        abstractFactory.createBall().build();
    }
}
