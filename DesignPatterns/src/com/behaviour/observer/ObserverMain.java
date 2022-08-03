package com.behaviour.observer;

public class ObserverMain {

	public static void main(String[] args) {
		//youtube contains  amny channels and the viewers view the content in channel and the viewer who subscribe to the channel will be notified when vedio is uplaoded in channel 
		/*
		 * here youtube is an object which has objects like channel  and subcribe 
		 * consider one channel  ch1 in youtube and ch1 has many subcribers s1 s2 ...  
		 * */
		//viewer will observe the channnel to check for new vedio rather they can subscribe to channnel to get the work done 
	/*
	 * subscriber is observer 
	 * channel is subject
	 * */
		//youtube has only one channnel ch1 pre-assumed
		Channel ch1 = new Channel();
		Subscriber s0 = new Subscriber("Limansha");
		Subscriber s1 = new Subscriber("Sonam");
		Subscriber s2 = new Subscriber("usha");
		Subscriber s3 = new Subscriber("priya");
		Subscriber s4 = new Subscriber("nitya");
		
		ch1.subscribe(s0);
		ch1.subscribe(s1);
		ch1.subscribe(s2);
		ch1.subscribe(s3);
		ch1.subscribe(s4);
		
//		s0.subscribeChannel(ch1); 
//		s1.subscribeChannel(ch1);
//		s2.subscribeChannel(ch1);
//		s3.subscribeChannel(ch1);
//		s4.subscribeChannel(ch1);
//		
		ch1.unSubscribe(s0);
		
		ch1.upload("Enjoy Life !!");
	}

}
