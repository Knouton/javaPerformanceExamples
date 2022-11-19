package org.demo.functional;

import java.util.ArrayList;
import java.util.List;

public class LambdaVisibilityArea {

	public static void repeatText(String text, int count) {
		//text = "text2"; // нельзя менять: Variable used in lambda expression should be final or effectively final
		int count2 = 2;
		int[] countArr = new int[1];
		Runnable run = () -> {
			countArr[0]++; // можно обмануть
			for (int i = 0; i < count2; i++) {
				System.out.println(text);
				Thread.yield();
			}
		};
		new Thread(run).start();

		final List strings = new ArrayList<>();
		strings.add("baeldung");

	}
}
