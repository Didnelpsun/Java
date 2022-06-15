// MethodBallFactory.java
package org.didnelpsun.factory;

// 工厂方法模式
public class MethodBallFactory implements FactoryBuilder {
    @Override
    public Factory createFactory() {
        return new BallFactory();
    }
}
