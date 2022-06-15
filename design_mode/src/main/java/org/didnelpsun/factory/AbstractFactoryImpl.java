// AbstractFactoryImpl.java
package org.didnelpsun.factory;

// 抽象工厂模式
public class AbstractFactoryImpl implements AbstractFactory {
    @Override
    public Factory createAnimal() {
        return new AnimalFactory();
    }

    @Override
    public Factory createBall() {
        return new BallFactory();
    }
}
