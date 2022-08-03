package com.solid.one;

public class SingleResponsibilityPrincipal {

	public static void main(String[] args) {
		TextManipulation m = new TextManipulation("Hello world welcome to the new era");
		m.deleteAWord("world");
		TextDisplay td = new TextDisplay(m);
		td.printTextOnConsole();
	}

}
