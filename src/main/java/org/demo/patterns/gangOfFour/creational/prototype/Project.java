package org.demo.patterns.gangOfFour.creational.prototype;

public class Project implements Copyable{

	private int id;
	private String projectName;
	private String source;

	public Project(final int id, final String projectName, final String source) {
		this.id = id;
		this.projectName = projectName;
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(final String source) {
		this.source = source;
	}

	@Override
	public Object copy() {
		return new Project(id, projectName, source);
	}

	@Override
	public String toString() {
		return "Project{" +
				"id=" + id +
				", projectName='" + projectName + '\'' +
				", source='" + source + '\'' +
				'}';
	}
}
