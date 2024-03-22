package com.creational.singleton_full;

public class LazySingleton2 {
    private LazySingleton2() {
	}

	private static LazySingleton2 instance;

    //here object is created when method is called, so memory watage is removed 
	/*
	 * though the method has synchronized keyword in multi threading env can create 2 objects 
	 * if both the threads acquire lock at same time so we go with DoubleCheckingLazySingleton or 2 check locking , 
	 * where we create new instance inside synchronized block
	 */
	public static synchronized LazySingleton2 getInstance() {
		if (instance == null) {
			return instance = new LazySingleton2();//2 object by 2 thread
		} else {
			return instance;
		}
	}
	/*in multi thread env when this method is called there is a possibilty 2 objects can be created when 
	thread enters this method at the same time so principle is voilated.
	so add synchronized on method as above
	*/
	public static  LazySingleton2 getInstance0() {
		if (instance == null) {
			return instance = new LazySingleton2();
		} else {
			return instance;
		}
	}
	
}
