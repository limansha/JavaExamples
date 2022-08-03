package com.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	List<Subscriber> subScribers = new ArrayList();
	String vedioTitle;
	
	public void subscribe(Subscriber sub)
	{
		subScribers.add(sub);
	}
	public void unSubscribe(Subscriber sub)
	{
		subScribers.remove(sub);
	}
	public void notifySubscribers() {
		for(Subscriber sub : subScribers) {
			sub.notifySubscriber(); 
		}
	}
	public void upload(String vedioTitle) {
		this.vedioTitle =vedioTitle;
		notifySubscribers(); //subject notifies all the observers(calling the notigy method on each object instance on line 19-20)
	}
}
