package com.solid.two;

import com.solid.two.with.Area;
import com.solid.two.with.Shape;
import com.solid.two.without.Circle;
import com.solid.two.without.Rectangle;
import com.solid.two.without.TightCoupling;

public class OpenClosePriciple {

	public static void main(String[] args) {
		// Open to extension but closed for modification
/*
 * calculate an area of a shape TightCoupling is without design pattern implementation
 */
		TightCoupling tc = new TightCoupling();
		Object []shapes = {new Rectangle(3,4),new Circle(2)};
		System.out.println("total area of all the shapes "+tc.totalAreas(shapes));
		
		/*with principle*/
		Area a = new Area();
		Object[] shapes1 = {new Rectangle(3,4),new Circle(2)};
		System.out.println("total area of all the shapes1 "+a.totalAreas((Shape[]) shapes1));
		
	}

}
