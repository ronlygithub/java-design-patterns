package com.iluwatar.absfactory;

/**
 * 
 * The factory interface.
 *
 */
public interface KingdomFactory {

	Castle createCastle();
	King createKing();
	Army createArmy();
	
}
