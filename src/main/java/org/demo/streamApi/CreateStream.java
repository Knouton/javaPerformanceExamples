package org.demo.streamApi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {




	public static void main(String[] args) throws Exception {
		//стрим из коллекции
		List<String> collection = Arrays.asList("A", "B", "C");
		Stream<String> streamFromCollection = collection.stream();
		streamFromCollection.forEach(System.out::println);

		//стрим из значений

		Stream<String> streamFromValues = Stream.of("A", "B", "C");
		System.out.println(streamFromValues.collect(Collectors.toList()));

		//стрим из массива
		String[] array = {"a1","a2","a3"};
		Stream<String> streamFromArrays = Arrays.stream(array);


		//стрим из файла
		//Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));


		//стрим из строки
		IntStream streamFromString = "123".chars();

		//стрим из builder
		Stream.builder().add("a1").add("a2").add("a3").build();

		//создание параллельного стрима
		Stream<String> stream = collection.parallelStream();

		//создание бесконечного стрима
		Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
		System.out.println("streamFromIterate: "+ streamFromIterate.limit(10).collect(Collectors.toList()));

		Stream<String> streamFromGenerate = Stream.generate(() -> "a");
		System.out.println("streamFromGenerate: " + streamFromGenerate.limit(10).collect(Collectors.toList()));


		Stream<Integer> stream1 = Stream.of(1, 3, 5);
		Stream<Integer> stream2 = Stream.of(2, 4, 6);
		Stream<Integer> stream3 = Stream.of(18, 15, 36);

		System.out.println(Stream.concat(
				Stream.concat(stream1, stream2), stream3).collect(Collectors.toList()));

	}



}
