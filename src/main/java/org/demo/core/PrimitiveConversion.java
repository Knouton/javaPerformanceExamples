package org.demo.core;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveConversion {
	public static void main(String[] args) throws Exception {
		int intVar = 1;
		byte byteVar = 1;
		short shortVar = 1;
		long longVar = 1;

		//float floatVar = 1.1; --ошибка
		float floatVar = 1;
		double doubleVar = 1.1;

		//ошибки:
		/*byte c = byteVar + 1;
		float d = floatVar + 1.1;
		short s = shortVar + 1;*/


		long l = longVar + 1;

		int intToFloat = Integer.MAX_VALUE;
		System.out.println(intToFloat);
		float floatFromInt = intToFloat; //обрезаются значения
		System.out.println(floatFromInt);
	}
}
