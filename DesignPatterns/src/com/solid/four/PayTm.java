package com.solid.four;

public class PayTm implements UPIPayments
{

	@Override
	public void payMoney() {
		//this feature is there
		
	}

	@Override
	public void getScratchCards() {
		// this feature is there
	}

	@Override
	public void getCashBack() {
		// this feature is not there
		//so we should not force PayTm to implement this method
		// so to overcome this we can split the UPI Payments interface 
	}
}
