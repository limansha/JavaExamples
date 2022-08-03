package com.solid.two.without;

public class TightCoupling {

	public double totalAreas(Object[] shapes) {
		double area =0;
		for (Object shape : shapes) {
			String shapeClass = shape.getClass().getSimpleName();
			//System.out.println(shapeClass);
			if(shapeClass.equals("Rectangle")) {
				Rectangle rc = (Rectangle) shape;
				area += rc.height * rc.width;
				System.out.println("adding rectangle "+area);
			}
			else if(shapeClass.equals("Circle")) {
				Circle c = (Circle)shape;
				area += c.radius * c.radius * 3.14;

				System.out.println("adding circle "+area);
			}
			//if we add a triangle shape then we need to modify this totalAreas method to add the triangle area as well rather we can use interfaces to achieve open close principle.
		}
		return area;
	}
}
