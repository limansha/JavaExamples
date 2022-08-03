package com.solid.one;

public class TextDisplay {

	TextManipulation tm;
	
	public TextDisplay(TextManipulation tm) {
		super();
		this.tm = tm;
	}

	public void printTextOnConsole() {
		System.out.println(tm.text);
	}
	public void printTextInLogFile() {
		
	}
	
}
