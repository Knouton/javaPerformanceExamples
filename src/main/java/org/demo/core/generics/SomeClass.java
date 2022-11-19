package org.demo.core.generics;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SomeClass<T> {

	public <E> void printAll(Collection<E> collection){
		for (E e: collection){
			System.out.println(e);
		}
	}
	public static void printAllStrings(List<String> stringList) {
		for (String str: stringList
		     ) {
			System.out.println(str);
		}
	}
}
