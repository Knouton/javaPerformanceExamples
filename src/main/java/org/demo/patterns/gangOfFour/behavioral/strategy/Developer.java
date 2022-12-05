package org.demo.patterns.gangOfFour.behavioral.strategy;

public class Developer {
	private Activity activity;

	public void setActivity(final Activity activity) {
		this.activity = activity;
	}

	public void executeActivity() {
		activity.doIt();
	}
}
