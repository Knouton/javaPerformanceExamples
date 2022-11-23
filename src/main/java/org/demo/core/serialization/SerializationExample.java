package org.demo.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Person person = new Person();
			person.setAge(20);
			person.setName("Joe");
			person.setHeight(10);

			System.out.println("Before: \n" + person);

			String filePath = "D:\\SerializationExample.txt";

			FileOutputStream fileOutputStream = new FileOutputStream(filePath);

			try (ObjectOutputStream objectOutputStream
					     = new ObjectOutputStream(fileOutputStream)) {
				objectOutputStream.writeObject(person);
				objectOutputStream.flush();
			}
			FileInputStream fileInputStream = new FileInputStream(filePath);

			try (ObjectInputStream objectInputStream
					     = new ObjectInputStream(fileInputStream);) {
				Person p2 = (Person) objectInputStream.readObject();
				System.out.println("After: \n" + p2);
			}
		}

	public static class Person implements Serializable {
			//Когда мы не объявляем SerialVersionUID в нашем классе,
			//Java делает это за нас, но этот процесс чувствителен ко многим метаданным класса
			//рекомендуется определять это поле самому, чтобы не получить неожиданный InvalidClassException при десериализация
		private static final long serialVersionUID = 1L;
		static String country = "ITALY";
		private int age;
		private String name;
		transient int height;
		public void setAge(final int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(final String name) {
			this.name = name;
		}

		public void setHeight(final int height) {
			this.height = height;
		}

		@Override
		public String toString() {
			return "Person{" +
					" serialVersionUID=" + serialVersionUID +
					", country=" + country +
					", age=" + age +
					", name='" + name + '\'' +
					", height=" + height +
					'}';
		}

	}

}
