package com.creational.singleton_full;

public class LazyInnerClassSingleton4 {
    private LazyInnerClassSingleton4() {

	}
//inner class which is used to create instance which is the best practise
	private static class SingletonHelper {
		private static final LazyInnerClassSingleton4 instance = new LazyInnerClassSingleton4();
	}
//returns the instance created in inner class
	public static LazyInnerClassSingleton4 getInstance() {
		return SingletonHelper.instance;
	}

    /*
     * though we have done this many approaches for making a class singleton there are some way which will break this singleton pattern (and creates multiple objects) they are 
     * 1) via cloning the singleton object they can create a new object of same 
     * 2) by serializing the class
     * 3) through reflection
     */
}
