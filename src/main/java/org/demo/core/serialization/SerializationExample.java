package org.demo.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
		private String name;
		private String description;

		public SerializationExample(String name, String description) {
			this.name = name;
			this.description = description;
		}


		private void writeObject(ObjectOutputStream stream) throws IOException {
			stream.defaultWriteObject();
			System.out.println("Our writeObject");
		}

		private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
			stream.defaultReadObject();
			System.out.println("Our readObject");
		}

		@Override
		public String toString() {
			return "Talda{" +
					"name='" + name + '\'' +
					", description='" + description + '\'' +
					'}';
		}

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			SerializationExample partizanka = new SerializationExample("Partizanka", "Viiiski");
			System.out.println("Before: \n" + partizanka);

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SerializationExample.out"));
			out.writeObject(partizanka);
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("SerializationExample.out"));
			partizanka = (SerializationExample) in.readObject();

			System.out.println("After: \n" + partizanka);
		}
}
