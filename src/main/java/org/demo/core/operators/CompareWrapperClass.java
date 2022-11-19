package org.demo.core.operators;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CompareWrapperClass {
	public static void main(String[] args) throws Exception {
		// При сравнении классов-обёрток оператором == или !=, происходит сравнение по ссылкам, а не по значениям
		//но есть нюансы
		//сравним два инта
		Integer intA = 127;
		Integer intB = 127;
		//т.к.  для int в диапазоне от -128 до + 127 объекты-обёртки кешируются
		//фактически вызывается java.lang.Integer.valueOf(int)
		//размер можно настроить через: -Djava.lang.Integer.IntegerCache.high=<size>
		//то получаем true при сравнивании
		System.out.println("Int в диапазоне хеширования: " + (intA == intB));

		Integer intC = 128;
		Integer intD = 128;
		//однако выйдя за этот диапазон кэширования не будет
		System.out.println("Int вне диапазона хеширования: " + (intC == intD));

		//если создать явно, то будет ссылка на уже новый объект
		Integer intK = new Integer(127);
		//соответстенно получим false
		System.out.println("Создали через new Integer: " + (intA == intK));


		Short shortA = 127;
		Short shortB = 127;
		System.out.println("Справедливо и для других целочисленных: " + (shortB == shortA));

		Byte byteA = -128;
		Byte byteB = -128;
		System.out.println("Byte: " + (byteA == byteB));

		Double doubleA = 1.01;
		Double doubleB = 1.01;

		System.out.println("Сравнение double: " + (doubleA == doubleB));
	}
}
