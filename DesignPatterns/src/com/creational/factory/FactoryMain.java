package com.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// need to get the required OS for your code
		FactoryClass fc = new FactoryClass();
		Os o = fc.getInstance("open");
		o.spec();//by this we can add new Os without change in this main file and also the classes of different Os are hidden to this client class
		Os o1 = fc.getInstance("close");
		o1.spec();
		Os o2 = fc.getInstance("anything");
		o2.spec();
	}

}
