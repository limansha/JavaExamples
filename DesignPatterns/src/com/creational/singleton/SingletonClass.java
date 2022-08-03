package com.creational.singleton;

//used for database connection and limited resources accessing 
public class SingletonClass {
	
	/*
	 * private constructor and static method will make a class a singleTon class
	 */
	private static SingletonClass instnce = null;
	String s;
	
	//private constructor
	private SingletonClass() {
		s = "it is singleton class used in multithreading environment where at any point of time we have only single instance of the class i.e only one object is created";
		
	}
	//static method to create object of class
	static SingletonClass getInstance() {
		if(instnce == null) instnce = new SingletonClass();
		return instnce;
	}
}
