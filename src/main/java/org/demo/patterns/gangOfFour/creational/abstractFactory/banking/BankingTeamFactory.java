package org.demo.patterns.gangOfFour.creational.abstractFactory.banking;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Developer;
import org.demo.patterns.gangOfFour.creational.abstractFactory.Manager;
import org.demo.patterns.gangOfFour.creational.abstractFactory.ProjectTeamFactory;
import org.demo.patterns.gangOfFour.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public Manager getManager() {
		return new ProjectManager();
	}
}
