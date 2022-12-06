package org.demo.patterns.gangOfFour.creational.prototype;

public class VersionControlRunner {

	public static void main(String[] args) {
		Project master = new Project(1, "Super", "Source code");

		System.out.println(master);

		ProjectFactory factory = new ProjectFactory(master);

		Project masterClone = factory.cloneProject();
		System.out.println(masterClone);

	}
}
