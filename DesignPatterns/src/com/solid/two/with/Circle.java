package com.solid.two.with;

public class Circle extends Shape {

	double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double area() {
		return 3.14 * this.radius * this.radius;
	}

}
