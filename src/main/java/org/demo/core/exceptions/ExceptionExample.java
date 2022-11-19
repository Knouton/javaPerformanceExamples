package org.demo.core.exceptions;

public class ExceptionExample {
	public static class Factorial{
		public static int getFactorial(int num) throws FactorialException {

			int result=1;
			//создали исключение и выбросили его
			if ( num < 1) throw new FactorialException("The number is less than 1", num);

			for(int i = 1; i <= num; i++){

				result *= i;
			}
			return result;
		}
	}


	static class FactorialException extends Exception {

		private int number;
		public int getNumber() {
			return number;
		}
		public FactorialException(String message, int num) {
			super(message);
			number = num;
		}
	}

	public static void main(String[] args) {

		try {
			int result = Factorial.getFactorial(0);
			System.out.println(result);
		}
		catch(FactorialException ex){

			System.out.println(ex.getMessage());
			System.out.println(ex.getNumber());
		}
	}

}

