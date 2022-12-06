package org.demo.patterns.gangOfFour.creational.abstractFactory.banking;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Manager;

public class ProjectManager implements Manager {
	@Override
	public void manageProject() {
		System.out.println("PM manages project");
	}
}
