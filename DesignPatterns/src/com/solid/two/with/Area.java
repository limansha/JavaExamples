package com.solid.two.with;

public class Area {
	public double totalAreas(Object[] shapes) {
		double area =0;
		for (Object shape : shapes) {
			area += ((Shape) shape).area();
		}
		return area;
	}
}
