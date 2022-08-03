package com.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {
		// in shop we get the phone
		//Phone p = new Phone("Android",2,"Qualcom",5,3000); //no need to give all the params 
		Phone pb = new PhoneBuilder().setOs("Android").setProcessor("Qualcom").getPhone();
		System.out.println(pb.toString());
	}

}
