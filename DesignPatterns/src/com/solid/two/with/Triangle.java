package com.solid.two.with;

public class Triangle extends Shape {

	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double area() {

		return 0.5 * this.base * this.height;
	}

}
