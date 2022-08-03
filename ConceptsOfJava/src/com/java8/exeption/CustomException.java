package com.java8.exeption;

//as it extends Exception class its checked Exception
public class CustomException extends Exception{
	String msg;
	public CustomException(String msg) {
		super(msg);
	} 
}
