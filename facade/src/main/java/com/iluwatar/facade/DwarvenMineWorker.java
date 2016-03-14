package com.iluwatar.facade;

public abstract class DwarvenMineWorker {

	public void goToSleep() {
		System.out.println(name() + " goes to sleep.");
	}
	
	public void wakeUp() {
		System.out.println(name() + " wakes up.");
	}
	
	public void goHome() {
		System.out.println(name() + " goes home.");
	}
	
	public void goToMine() {
		System.out.println(name() + " goes to the mine.");
	}
	
	public abstract void work();
	
	public abstract String name();
	
}
