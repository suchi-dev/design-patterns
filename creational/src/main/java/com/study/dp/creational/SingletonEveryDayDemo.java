package com.study.dp.creational;

public class SingletonEveryDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runtime runtimeInstance = Runtime.getRuntime();
	runtimeInstance.gc();
	
	System.out.println(runtimeInstance);
	
	Runtime anotherInstance = Runtime.getRuntime();
	System.out.println(anotherInstance);
		
	if(runtimeInstance == anotherInstance) {
		System.out.println("They both are same");
	}
		
	}

}
