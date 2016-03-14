package com.iluwatar.mediator;

/**
 * 
 * Mediator interface.
 *
 */
public interface Party {

	void addMember(PartyMember member);
	
	void act(PartyMember actor, Action action);
	
}
