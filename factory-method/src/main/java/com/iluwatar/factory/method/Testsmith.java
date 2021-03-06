package com.iluwatar.factory.method;


/**
 *
 * Concrete subclass for creating new objects.
 *
 */
public class Testsmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}
