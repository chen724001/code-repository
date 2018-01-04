package com.chf.design.mode.creater.singleton;

/**
 * 单例
 * @author HANDSOME
 *
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(null == instance) {
			synchronized(Singleton.class) {
				if(null == instance) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	public void printSingleton() {
		System.out.println("singleton mode");
	}
	
	public static void main(String[] args) {
		Singleton.getInstance().printSingleton();
	}
}
