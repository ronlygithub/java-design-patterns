package com.iluwatar.template.method;

public class HitAndRunMethod extends StealingMethod {

	@Override
	protected String pickTarget() {
		return "old goblin woman";
	}

	@Override
	protected void confuseTarget(String target) {
		System.out.println("Approach the " + target + " from behind.");
	}

	@Override
	protected void stealTheItem(String target) {
		System.out.println("Grab the handbag and run away fast!");
	}

}