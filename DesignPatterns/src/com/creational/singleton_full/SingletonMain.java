package com.creational.singleton_full;

/**
 * SingletonMain - The aim of the pattern is to create only one object inside jvm of a class
 */
public class SingletonMain {

    public static void main(String[] args) {
        earlyBean();
    }
    public static void earlyBean(){
        EagerSingleton1 obj1 = EagerSingleton1.getInstance();

		System.out.println(obj1.hashCode());

		EagerSingleton1 obj2 = EagerSingleton1.getInstance();

		System.out.println(obj2.hashCode());
        //both the obj are same so will have same hashcode if it is in single thread env
    }
}