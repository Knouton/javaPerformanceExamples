package org.demo.patterns.gangOfFour.structural.facade;

//цель класса компоновка остальных элементов
public class WorkFlow {
	Developer developer = new Developer();
	Job job = new Job();
	BugTracker bugTracker = new BugTracker();

	public void solveProblems() {
		job.doJob();
		bugTracker.startSpring();
		developer.doJobBeforeDeadline(bugTracker);
	}
}
