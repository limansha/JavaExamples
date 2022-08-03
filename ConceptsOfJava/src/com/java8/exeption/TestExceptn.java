package com.java8.exeption;
public class TestExceptn {

	//this is on type of error handling other is using throws keyword and as we throw exception here it need to be catched in calling method via try catch or throws keyword i.e amin class
	public void placeOrder(int oid) {
	try {
		if(oid == 404) {
			throw new CustomException("order not found");
		}
		else {
			System.out.println("order placed with orderId "+oid);
		}
	}
	catch(CustomException e) {
		System.out.println(e);
	}
		
	}
	
//	public void placeOrder(int oid) throws CustomException {
//		if(oid == 404) {
//			throw new CustomException("order not found");
//		}
//		else {
//			System.out.println("order placed with orderId "+oid);
//		}
//		
//	}

}
