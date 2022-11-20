package org.demo.oop;

public class CompositionExample {
	public class Job {
		private String role;
		private long salary;
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
	}

	public class Person {
		//композиция : создаем внутри нашего класса новый инстанс другого класса.
		//агрегация : нашему классу передали  (например в конструктор) уже существующий инстанс другого класса.
		//используем отношение has-a, композиция:
		private Job job;

		public Person() {
			this.job = new Job();
			job.setSalary(1000L);
		}
		public long getSalary() {
			return job.getSalary();
		}
	}

}
