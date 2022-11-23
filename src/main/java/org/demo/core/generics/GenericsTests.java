package org.demo.core.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsTests {
	public static void main(String[] args) throws Exception {
		List<String> stringList = new ArrayList<>();

		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		SomeClass.printAll(stringList);

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		List<? extends Number> numberList = intList;
		//не можем добавить какой-либо объект в List<? extends T>, потому что мы не можем гарантировать,
		//на какой список он действительно указывает, поэтому мы не можем гарантировать, что объект разрешен в этом списке.

		//numberList.add(1); нельзя добавлять int т.к. numberList может указывать и на другой тип (например, double)
		//Единственная «гарантия» заключается в том, что можем читать из коллекции, и получим T или подкласс T.
		System.out.println(numberList.get(0)); // можем получать значения из коллекции
		SomeClass.printAll(intList);



	}
	public static class SomeClass<T> {

		public static <E> void printAll(Collection<? extends E> collection){
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
}
