package com.iluwatar.flyweight;

import java.util.EnumMap;

/**
 *
 * Flyweight.
 *
 */
public class PotionFactory {

	private EnumMap<PotionType, Potion> potions;

	public PotionFactory() {
		potions = new EnumMap<PotionType, Potion>(PotionType.class);
	}

	Potion createPotion(PotionType type) {
		Potion potion = potions.get(type);
		if (potion == null) {
			switch (type) {
			case HEALING:
				potion = new HealingPotion();
				potions.put(type, potion);
				break;
			case HOLY_WATER:
				potion = new HolyWaterPotion();
				potions.put(type, potion);
				break;
			case INVISIBILITY:
				potion = new InvisibilityPotion();
				potions.put(type, potion);
				break;
			case POISON:
				potion = new PoisonPotion();
				potions.put(type, potion);
				break;
			case STRENGTH:
				potion = new StrengthPotion();
				potions.put(type, potion);
				break;
			default:
				break;
			}
		}
		return potion;
	}

}
