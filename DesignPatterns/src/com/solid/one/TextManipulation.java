package com.solid.one;

public class TextManipulation {
	 String text;
	
	public TextManipulation(String text) {
		super();
		this.text = text;
	}
	public void appendText(String newText) {
		this.text = this.text +"." + newText;
	}
	public void deleteAWord(String word) {
		String []words = text.split(" ");
		String newText = "";
		for(String w:words) {
			if(!(w.equals(word))) {
				newText = newText + " "+ w;
			}
		}
		this.text = newText;
	}
	//this is not write operation so we have to make it an other class 
//	public void printText() {
//		System.out.println(text);
//	}
}
