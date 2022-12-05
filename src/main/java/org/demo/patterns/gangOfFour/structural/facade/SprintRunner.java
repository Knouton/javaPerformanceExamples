package org.demo.patterns.gangOfFour.structural.facade;

public class SprintRunner {

	public static void main(String[] args) {
		WorkFlow workFlow = new WorkFlow();

		workFlow.solveProblems();
		//Вместо того чтобы использовать всё это здесь, скрываем за фасадом в виде WorkFlow
		/*Job job = new Job();
		job.doJob();
		BugTracker bugTracker = new BugTracker();
		bugTracker.startSpring();
		Developer developer = new Developer();
		developer.doJobBeforeDeadline(bugTracker);

		bugTracker.finishSprint();
		developer.doJobBeforeDeadline(bugTracker);*/
	}
}
