package org.demo.core;

import java.util.ArrayList;
import java.util.List;

public class FinalObjects {
	public static void main(String[] args) throws Exception {
		final List strings = new ArrayList<>();
		System.out.println(strings.size());
		strings.add("asdasd"); //нельзя поменять ссылку объекта, но можно изменить сам объект
		System.out.println(strings.size());


	}

}
