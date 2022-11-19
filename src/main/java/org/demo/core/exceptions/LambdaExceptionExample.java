package org.demo.core.exceptions;


public class LambdaExceptionExample {

	@FunctionalInterface
	interface IDivNumbers {
		// Объявить метод, который делит два числа
		double Division(double a, double b);
	}

	public static void main(String[] args) {

		// 1. Объявить ссылку на IDivNumbers
		IDivNumbers ref;

		// 2. Реализовать лямбда-выражение, которое делит два числа и
		//    при необходимости генерирует исключение
		ref = (a, b) -> {
			try {
				// Обработать проверку деления на 0
				if (b==0)
					throw new ArithmeticException("Exception: divide by zero.");
				return a/b; // если b!=0, то вернуть результат деления
			}
			catch (ArithmeticException e) {
				System.out.println(e.getMessage()); // Вывести сообщение
				return 0.0;
			}
		};

		double res = ref.Division(5, 0); // Exception: divide by zero.

		System.out.println("res = " + res); // res = 0.0
	}
}
