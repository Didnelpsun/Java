// MethodAnimalFactory.java
package org.didnelpsun.factory;

// 工厂方法模式
public class MethodAnimalFactory implements FactoryBuilder {
    @Override
    public Factory createFactory() {
        return new AnimalFactory();
    }
}
