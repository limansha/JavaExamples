package com.creational.singleton_full;

public class EagerSingleton1 {
    //making constructor private so no other class can set object
    private EagerSingleton1() {
	}

    //creating bean even before the class is called. i.e even class is used or not object is created which is waste of memory.
	private static final EagerSingleton1 instance = new EagerSingleton1();

    //returns the same object when the method is called.
	public static EagerSingleton1 getInstance() {
		return instance;
	}
}
