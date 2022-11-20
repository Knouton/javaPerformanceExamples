package org.demo.functional;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		//проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение true.
		// В качестве параметра лямбда-выражение принимает объект типа T
		Predicate<Integer> isPositive = x -> x > 0;

		System.out.println(isPositive.test(5)); // true
		System.out.println(isPositive.test(-7)); // false
	}
}
