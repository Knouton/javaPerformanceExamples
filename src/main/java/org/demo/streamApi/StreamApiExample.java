package org.demo.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) throws Exception {

		String regexPattern = " ";
		String actualString
				= "Test Test test simple string string";

		//4.6.2 Stream. Способы создания потока строк и потока из файла, splitAsStream
		Stream<String> stream = getStreamSplitStrings(actualString, regexPattern);
		System.out.println("Строки полученные с помощью splitAsStream:");
		stream.forEach(System.out::println);
		stream = getStreamSplitStrings(actualString, regexPattern);

		//4.6.5 Stream. Конверсия  Collectors в список, множество, карту, коллекцию
		List<String> stringList = stream.collect(Collectors.toList());
		//преобразуем лист к мапе, <строка, сколько раз она встречается>
		Map<String, Long> mapStringsCount = stringList.stream()
				.collect(Collectors.groupingBy(Function.identity(),
						                     Collectors.counting())
				);
		System.out.println("Map:");
		System.out.println(mapStringsCount);

		//4.6.6 Stream. Операторы collect()
		ArrayList<String> stringArrayList = getStreamSplitStrings(actualString, regexPattern)
				.filter(s -> s.length() < 5)
				.distinct()
				.collect(
						() -> new ArrayList<String>(),
						(list, item)->list.add(item), // добавляем в список элемент
						(list1, list2)-> list1.addAll(list2)); // добавляем в список другой список
		System.out.println("ArrayList со строками в которых меньше 5 символов:");
		stringArrayList.forEach(System.out::println);

		//reduce
		System.out.println("reduce example: ");
		Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
		Optional<String> sentence = wordsStream.reduce((x, y)-> x + " " + y);
		System.out.println(sentence.get());

		//4.6.8	Stream API	Stream. Операторы поиска
		System.out.println("Операторы поиска: ");
		ArrayList<String> chars = new ArrayList<String>();
		chars.addAll(Arrays.asList("AAA", "B", "C", "C", "D", "A", "QQQ", "Ooooo","oooo"));

		Optional<String> first = chars.stream()
				.findFirst();
		System.out.println(first.get());

		Optional<String> any = chars.stream()
				.filter(str -> str.equals("C"))
				.findAny();
		System.out.println(any.get());

		//4.6.9	Stream API	Stream. Оператор sorted()

		chars.stream()
				.sorted()
				.filter(str -> str.length() > 1)
				.forEach(str -> System.out.println(str));
	}

	private static Stream<String> getStreamSplitStrings(String stringToSplit, String patternForSplit){
		return Pattern.compile(patternForSplit)
				.splitAsStream(stringToSplit);
	}

}


