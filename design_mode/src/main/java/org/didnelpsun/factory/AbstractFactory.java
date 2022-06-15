// AbstractFactory.java
package org.didnelpsun.factory;

// 抽象工厂模式接口
public interface AbstractFactory {
    // 创建动物
    Factory createAnimal();
    // 创建球类
    Factory createBall();
}
