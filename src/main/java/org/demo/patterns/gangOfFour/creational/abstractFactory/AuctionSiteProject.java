package org.demo.patterns.gangOfFour.creational.abstractFactory;

import org.demo.patterns.gangOfFour.creational.abstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {

	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
		Developer developer  = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		Manager manager = projectTeamFactory.getManager();

		System.out.println("Create auction website");
		developer.writeCode();
		tester.testCode();
		manager.manageProject();
	}

}
