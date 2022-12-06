package org.demo.patterns.gangOfFour.creational.abstractFactory.banking;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("Write java code");
	}
}
