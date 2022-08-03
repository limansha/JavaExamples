package com.structural.adapter;

//this is the class file we get from our firend which can't be modified suppose , so we need an adaptor class which picks up this object and utilizes the methids.
public class PilotPen {
	//this has nothing to do with Pen interface
public void mark(String str) {
	System.out.println(str);
}
}
