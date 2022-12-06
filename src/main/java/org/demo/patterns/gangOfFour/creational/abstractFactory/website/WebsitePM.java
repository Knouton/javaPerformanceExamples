package org.demo.patterns.gangOfFour.creational.abstractFactory.website;

import org.demo.patterns.gangOfFour.creational.abstractFactory.Manager;

public class WebsitePM implements Manager {

	@Override
	public void manageProject() {
		System.out.println("website PM manages project");
	}
}
