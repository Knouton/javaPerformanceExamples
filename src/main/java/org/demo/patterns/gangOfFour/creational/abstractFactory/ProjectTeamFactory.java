package org.demo.patterns.gangOfFour.creational.abstractFactory;

public interface ProjectTeamFactory {
	Developer getDeveloper();
	Tester getTester();
	Manager getManager();
}
