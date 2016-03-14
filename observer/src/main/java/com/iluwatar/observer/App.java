package com.iluwatar.observer;

/**
 * 
 * Observer pattern defines one-to-many relationship
 * between objects. The target object sends change
 * notifications to its registered observers.
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Weather weather = new Weather();
    	weather.addObserver(new Orcs());
    	weather.addObserver(new Hobbits());
    	
    	try {
			weather.timePasses();
			weather.timePasses();
			weather.timePasses();
			weather.timePasses();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
