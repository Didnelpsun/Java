// SingletonRun.java
package org.didnelpsun.singleton;

import java.lang.reflect.Constructor;

// 单例模式运行
public class SingletonRun {
    public static void Run() {
//        HungrySingletonRun();
//        LazySingletonRun();
//        CheckSingletonRun();
//        InnerSingletonRun();
        try {
            reflect();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        EnumSingletonRun();
    }

    public static void HungrySingletonRun() {
        Singleton singleton1 = HungrySingleton.getInstance();
        Singleton singleton2 = HungrySingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

    public static void LazySingletonRun() {
        Singleton singleton1 = LazySingleton.getInstance();
        Singleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

    public static void CheckSingletonRun() {
        Singleton singleton1 = CheckSingleton.getInstance();
        Singleton singleton2 = CheckSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

    public static void InnerSingletonRun() {
        Singleton singleton1 = InnerSingleton.getInstance();
        Singleton singleton2 = InnerSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

    // 反射破坏单例模式
    public static void reflect() {
        try {
            // 获取类
            Class<Singleton> singletonClass = Singleton.class;
            // 获取构造方法
            Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
            // 利用反射构建实例
            // 直接绕过Singleton构造方法的protected权限限制
            Singleton singleton1 = constructor.newInstance();
            Singleton singleton2 = constructor.newInstance();
            System.out.println(singleton1.hashCode());
            System.out.println(singleton2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void EnumSingletonRun() {
        EnumSingleton singleton1 = EnumSingleton.getInstance();
        EnumSingleton singleton2 = EnumSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
