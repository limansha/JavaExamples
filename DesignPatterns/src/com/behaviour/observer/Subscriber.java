package com.behaviour.observer;

public class Subscriber {
	String SubscriberName;
	
	
	public Subscriber(String subscriberName) {
		super();
		SubscriberName = subscriberName;
	}
//	Channel ch = new Channel();
	public void notifySubscriber() {
		//System.out.println("Hey ! "+SubscriberName+", Vedio uplaoded on : "+ch.vedioTitle);

		System.out.println("Hey ! "+SubscriberName+", Vedio uplaoded  ");
	}
//	public void subscribeChannel(Channel ch) {
//		this.ch = ch;
//	}
}
