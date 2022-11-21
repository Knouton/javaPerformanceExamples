package org.demo.solid;

public class SingleResponsibilityExample {
	//вместо того чтобы сделать один класс(например Student) и сделать все методы в нём
	//разделяем элементы так, чтобы каждый из них был ответственен за что-то одно
	//ответственность в данном случае это повод для изменения, то есть каждый элемент имеет только один повод для изменения
	public class StudentRegister {
		//одна ответственность: регистрация студентов
		public void registerStudent() {
			System.out.println("register student");
		}
	}

	public class StudentResult {
		//одна ответственность: результаты по студенту
		public void calculateStudentResult() {
			System.out.println("calculate result");
		}
	}
	public class StudentEmails {
		//одна ответственность: имейл студента
		public void sendEmail() {
			System.out.println("send email");
		}
	}
}
