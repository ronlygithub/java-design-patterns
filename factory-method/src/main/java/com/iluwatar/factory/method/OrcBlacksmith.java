package com.iluwatar.factory.method;


/**
 *
 * Concrete subclass for creating new objects.
 *
 */
public class OrcBlacksmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
