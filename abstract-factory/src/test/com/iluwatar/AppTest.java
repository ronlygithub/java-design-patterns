package com.iluwatar;

import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void createKingdom() {
		try {
			App.createKingdom(new ElfKingdomFactory());
			App.createKingdom(new ElfKingdomFactory());
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	@Test
	public void main() {
		try {
			App.main(null);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
