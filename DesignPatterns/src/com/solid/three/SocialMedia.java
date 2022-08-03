package com.solid.three;

//Without Leaskov

//we see how to bring this into leskov substitution principle
public abstract class SocialMedia{
	abstract void chatWithFriends();
	abstract void publishPost(Object post);
	abstract void sendPhotosAndVedios();
	abstract void groupVedioCall(String...users);
} //this social media has multiple clients called facebook,instagram,what'sapp