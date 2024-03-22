package com.creational.singleton_full;

public class DoubleCheckingLazySingleton3 {
    private DoubleCheckingLazySingleton3() {
	}
//we can more securely create singleton class using LazyInnerClass approach
	private static DoubleCheckingLazySingleton3 instance;

	public static DoubleCheckingLazySingleton3 getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingleton3.class) { // 2 check locking
				if (instance == null) {
					instance = new DoubleCheckingLazySingleton3();
				}
			}

		}
		return instance;
    }
}
