package org.demo.core.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) throws Exception {
		Optional<String> opt = Optional.of("dasdas");
		System.out.println(opt.isPresent());

		opt = Optional.ofNullable(null);
		System.out.println(opt.isPresent());

		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "orElseName");
		System.out.println(name);

		Integer year = 2022;
		Optional<Integer> yearOptional = Optional.of(year);
		System.out.println(yearOptional.filter(y -> y == 2022).isPresent());
		System.out.println(yearOptional.filter(y -> y == 2023).isPresent());

		List<String> companyNames = Arrays.asList(
				"java", "oracle", "", "microsoft", "");
		Optional<List<String>> listOptional = Optional.of(companyNames);

		System.out.println(companyNames.get(2).isEmpty());

		int size = listOptional
				.map(List::size)
				.orElse(0);
		System.out.println(size);
	}
}
