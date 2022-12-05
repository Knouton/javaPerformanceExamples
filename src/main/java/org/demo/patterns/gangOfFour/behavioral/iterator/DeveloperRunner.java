package org.demo.patterns.gangOfFour.behavioral.iterator;

public class DeveloperRunner {

	public static void main(String[] args) {
		String[] skills = {"java", "spring", "hibernate", "maven", "oracle"};

		Developer developer = new Developer("Kokotov A.A", skills);

		Iterator iterator = developer.getIterator();
		System.out.println("Developer: " + developer.getName());
		System.out.println("Skills: ");

		while (iterator.hasNext()){
			System.out.print(iterator.next().toString()+ " ");
		}
	}
}
