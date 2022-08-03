package com.solid.five;

public class DependencyInversion {
	public static void main(String[] args) {
		//use abstraction instead of concrete implementation to achieve loose coupling and to modularize code which will allow us to easy mocking while unit testing 
		HitachiHD h = new HitachiHD();
		SamsungHD s = new SamsungHD();
		Laptop l = new Laptop(h); //injected Hitachi
		l.show();
		Laptop l1 = new Laptop(s); //injecting Samsung
		l1.show();
	}
}

//achieve loose coupling 
class Laptop{
	//Laptop require HardDisk so Laptop can take any HD either Hitachi or Samsung
	private HardDrive hd;
	
	public Laptop(HardDrive hd) {
		super();
		this.hd = hd;
	}

	void show() {
		hd.spec();
	}
}