package org.demo.streamApi;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {


	public static void main(String[] args) throws Exception {

		int max = IntStream.of(20, 98, 12, 7, 35)
				.max()
				.getAsInt(); // returns 98
		System.out.println(max);


		IntStream.rangeClosed(1, 5)
				//.parallel()
				.forEach(System.out::println);

		int[] ints = new Random(1)
				.ints(1000000, 0, 1000)
				.toArray();

		Integer[] integers = new Random(1)
				.ints(1000000, 0, 1000)
				.boxed().toArray(Integer[]::new);

		System.out.println(Stream.of(integers).distinct().count());
		System.out.println(IntStream.of(ints).distinct().count());

	}
}
