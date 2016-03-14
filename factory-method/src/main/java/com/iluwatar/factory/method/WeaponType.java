package com.iluwatar.factory.method;

public enum WeaponType {

	SHORT_SWORD, SPEAR, AXE,TEST;

	@Override
	public String toString() {
		String s = "";
		switch(this) {
		case SHORT_SWORD: s = "short sword"; break;
		case SPEAR: s = "spear"; break;
		case AXE: s = "axe"; break;
		case TEST: s = "test"; break;
		}
		return s;
	}
	
	
}
