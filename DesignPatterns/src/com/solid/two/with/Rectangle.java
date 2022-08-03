package com.solid.two.with;

public class Rectangle extends Shape{

	double width;
	double height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area() {
		return this.width * this.height;
	}

}
