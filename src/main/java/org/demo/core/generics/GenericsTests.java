package org.demo.core.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericsTests {
	public static void main(String[] args) throws Exception {
		SomeClass someClass = new SomeClass();

		List<String> stringList = new ArrayList<>();

		stringList.add("ads");
		someClass.printAll(stringList);
		//Method method = new jdk.internal.org.objectweb.asm.commons.Method();
		//method.isAnnotationPresent()
		//someClass.printAll();
	}
}
