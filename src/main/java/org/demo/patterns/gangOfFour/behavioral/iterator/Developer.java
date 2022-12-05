package org.demo.patterns.gangOfFour.behavioral.iterator;

public class Developer implements Collection {
	private String name;
	private String[] skills;

	public Developer(final String name, final String[] skills) {
		this.name = name;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(final String[] skills) {
		this.skills = skills;
	}

	@Override
	public Iterator getIterator() {
		return new SkillIterator();
	}
	private class SkillIterator implements Iterator {
		int index;
		@Override
		public boolean hasNext() {
			if (index < skills.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return skills[index++];
		}
	}
}
