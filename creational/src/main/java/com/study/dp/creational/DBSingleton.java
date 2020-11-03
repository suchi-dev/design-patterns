package com.study.dp.creational;

public class DBSingleton {

	// eager loading
	// private static DBSingleton instance = new DBSingleton();

	// lazy-loading and thread safe
	private static volatile DBSingleton instance = null;

	private DBSingleton() {
		if (instance != null) {
			throw new RuntimeException("Instance should be created using getInstance() method");
		}
	}

	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
				}

			}

		}
		return instance;

	}

}
