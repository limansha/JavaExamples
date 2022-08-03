package com.java8.exeption;

public class ExceptionMain {
	public static void main(String[] args) throws CustomException {
		TestExceptn te = new TestExceptn();
		te.placeOrder(404);
	}
	
}
