package com.creational.factory;

public class FactoryClass {
	public Os getInstance(String str) {
		if(str == "open") return new Android();
		else if(str =="close") return new Apple();
		else return new Windows();
	}
}
