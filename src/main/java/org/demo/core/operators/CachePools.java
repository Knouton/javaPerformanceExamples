package org.demo.core.operators;

public class CachePools {
	public static void main(String[] args) throws Exception {
		//пул стрингов
		String stringA = "test";
		String stringB = "test";
		System.out.println("Выдаст true если сделать строку " +
				                   "через просто '=', т.е. бдут ссылаться на одну " +
				                   "и ту же строку в памяти: "+(stringA == stringB));

		String stringC = new String("test");
		String stringD = new String("test");
		System.out.println("Выдаст false если создать строки через new: " + (stringC == stringD));



	}
}
