package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
	
	void showPrice();
}
//has composite and leaf parts
	class Leaf implements Component{
		String name;
		int price;
		
		public Leaf(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		@Override
		public void showPrice() {
			System.out.println(name +"  :  "+ price);
		}
		
	}
	class Composite implements Component{
		String name;
		
		public Composite(String name) {
			super();
			this.name = name;
		}
		List<Component> parts = new ArrayList<Component>(); 
		public void addComponent(Component part) {
			parts.add(part);
		}
		@Override
		public void showPrice() {
			System.out.println(name);
			for(Component part : parts) {
				part.showPrice();
			}
			
		}
		
	}
