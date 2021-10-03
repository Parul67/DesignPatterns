package com.learning.dp.java.singleton;

public class SingletonBasic {
    // 1. private constructor
    private SingletonBasic(){
        System.out.println("private constructor");
    };

    // 2. instance variable to provide object
    private static SingletonBasic singletonInstance;

    // 3. public method to provide objects to other components
    public SingletonBasic getInstance(){
        if(singletonInstance==null){
            singletonInstance = new SingletonBasic();
        }
        return singletonInstance;
    }
}
