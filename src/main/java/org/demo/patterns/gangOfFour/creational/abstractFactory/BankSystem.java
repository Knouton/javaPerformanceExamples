package org.demo.patterns.gangOfFour.creational.abstractFactory;

import org.demo.patterns.gangOfFour.creational.abstractFactory.banking.BankingTeamFactory;

public class BankSystem {

	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		Manager manager = projectTeamFactory.getManager();

		System.out.println("Creating bank system");
		developer.writeCode();
		tester.testCode();
		manager.manageProject();
	}
}
