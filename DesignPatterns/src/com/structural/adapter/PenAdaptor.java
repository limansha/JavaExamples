package com.structural.adapter;

public class PenAdaptor implements Pen{

	PilotPen pp =new PilotPen();  //can use this class as its available no need to implement new class
	@Override
	public void write(String str) {
		pp.mark(str);
	}

}
