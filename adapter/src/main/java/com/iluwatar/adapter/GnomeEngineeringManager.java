package com.iluwatar.adapter;

/**
 * 
 * GnomeEngineering manager uses Engineer to
 * operate devices.
 *
 */
public class GnomeEngineeringManager implements Engineer {

	/**
	 * @uml.property  name="engineer"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Engineer engineer;
	
	public GnomeEngineeringManager() {
		engineer = new GnomeEngineer();
	}
	
	@Override
	public void operateDevice() {
		engineer.operateDevice();
	}
}
