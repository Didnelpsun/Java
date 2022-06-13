// AnimalFactory.java
package org.didnelpsun.factory;

// 工厂实例
public class AnimalFactory implements Factory {
    @Override
    public void build() {
        System.out.println("AnimalFactory");
    }
}
