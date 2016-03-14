package com.iluwatar.singleton;

/**
 * 
 * Singleton class.
 *
 */
public class IvoryTower {

	private static IvoryTower instance = null;
	
	private IvoryTower() {}

	public static IvoryTower getInstance() {
		if(instance == null){
			instance = new IvoryTower();
		}
		return instance;
	}
}
