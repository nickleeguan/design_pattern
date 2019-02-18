package com.ai.design.pattern.creational.singleton;

public class T implements Runnable {


    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
