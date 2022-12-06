package org.demo.patterns.gangOfFour.creational.abstractFactory.website;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Developer;
import org.demo.patterns.gangOfFour.creational.abstractFactory.Manager;
import org.demo.patterns.gangOfFour.creational.abstractFactory.ProjectTeamFactory;
import org.demo.patterns.gangOfFour.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public Manager getManager() {
		return new WebsitePM();
	}
}
