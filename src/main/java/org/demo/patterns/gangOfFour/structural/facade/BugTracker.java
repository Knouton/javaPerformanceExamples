package org.demo.patterns.gangOfFour.structural.facade;

public class BugTracker {
	private boolean activeSprint;

	public boolean isActiveSprint() {
		return activeSprint;
	}

	public void startSpring() {
		System.out.println("Spring is active");
		activeSprint = true;
	}

	public void finishSprint() {
		System.out.println("Sptint is not active");
		activeSprint = false;
	}
}
