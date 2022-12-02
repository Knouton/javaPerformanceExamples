package org.demo.core.multithreading;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		// Create a CopyOnWriteArrayList object:
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator1 = list.iterator();

		list.add("X1");
		list.add("X2");

		Iterator<String> iterator2 = list.iterator();

		System.out.println("--- Iterator 1: -----");
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		System.out.println("--- Iterator 2: -----");
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
