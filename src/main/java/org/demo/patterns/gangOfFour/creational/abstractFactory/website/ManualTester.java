package org.demo.patterns.gangOfFour.creational.abstractFactory.website;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Tester;

public class ManualTester implements Tester {

	@Override
	public void testCode() {
		System.out.println("manual tester testing website");
	}
}
