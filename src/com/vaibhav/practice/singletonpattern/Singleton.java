/**
 * 
 */
package com.vaibhav.practice.singletonpattern;

/**
 * @author vshukla Singleton class -
 */
public class Singleton {

	private static Singleton singleInstance;

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		if (singleInstance == null) {
			
			/*
			 * We need to be careful here when using multiple threads.
			 * If you don’t synchronize the method which is going to return the instance then, 
			 * there is a possibility of allowing multiple instances in a multithreaded scenario. 
			 * Do the synchronization at block level considering the performance issues. 
			 */
			synchronized (Singleton.class) {
				if (singleInstance == null) {
					singleInstance = new Singleton();
				}
			}
		}
		return singleInstance;
	}

	/*
	 * Example of singleton in Java API - Java Runtime : java.lang.Runtime#getRuntime()
	 */
}
