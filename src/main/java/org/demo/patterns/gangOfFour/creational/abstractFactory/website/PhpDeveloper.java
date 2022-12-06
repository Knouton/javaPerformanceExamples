package org.demo.patterns.gangOfFour.creational.abstractFactory.website;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("php developer writes code");
	}
}
