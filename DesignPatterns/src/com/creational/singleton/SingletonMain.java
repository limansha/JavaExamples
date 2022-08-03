package com.creational.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		//SingletonClass sc = new SingletonClass(); //gives error as constructor is private so not visiable
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		if(x.hashCode() == y.hashCode()) System.out.println("both  x and y points to same memory object that is only one object instance created");
		else System.out.println("have two different object instances");
		
	}
}
