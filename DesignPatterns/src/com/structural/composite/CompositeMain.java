package com.structural.composite;


public class CompositeMain {

	public static void main(String[] args) {
		// creating a hierarchial Computer structure
		
		Leaf mon = new Leaf("monitor",6000);
		Leaf mouse = new Leaf("mouse",500);
		Leaf hd = new Leaf("HDD",3000);
		Leaf ram = new Leaf("RAM",5000);
		Leaf cpu = new Leaf("CPU",8000);
		
		Composite mb = new Composite("Mother Board");
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		Composite peri = new Composite("Periherials");
		peri.addComponent(mouse);
		peri.addComponent(mon);
		
		Composite cabnit = new Composite("Cabinte setup");
		cabnit.addComponent(mb);
		cabnit.addComponent(hd);
		
		Composite computer = new Composite("Whole Computer");
		computer.addComponent(cabnit);
		computer.addComponent(peri);
		
		//mouse.showPrice();
		//cabnit.showPrice();
		//peri.showPrice();
		
		computer.showPrice();
		
	}

}
