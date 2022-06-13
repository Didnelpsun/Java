// BallFactory.java
package org.didnelpsun.factory;

// 工厂实例
public class BallFactory implements Factory {
    @Override
    public void build() {
        System.out.println("BallFactory");
    }
}
