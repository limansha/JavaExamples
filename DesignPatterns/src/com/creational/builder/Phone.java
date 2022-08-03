package com.creational.builder;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private int screenSize;
	private int battery;
	public Phone(String os, int ram, String processor,  int screenSize,int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	
}
