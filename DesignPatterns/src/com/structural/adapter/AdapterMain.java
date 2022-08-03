package com.structural.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// School
		Pen p = new PenAdaptor();
		AssignmentWork w = new AssignmentWork();
		w.setP(p);
		w.writeAssignment("I'm to lazy to write the assignment"); //gives null pointer exception as Pen is an interface and not implemented yet when commented PenAdaptor.java
	}

}
