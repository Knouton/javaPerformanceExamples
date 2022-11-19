package org.demo.core;

import java.util.concurrent.Callable;

public class OuterClassWithInnerClass {
	public class InnerClass{
	}

	public static class StaticInnerClass{
		public static void methodExample() {
			System.out.println("static inner class");
		}

	}

	//можно наследовать от статического вложенного класса
	public class InnerClass2 extends StaticInnerClass{
	}

	//анонимный класс
	public void someMethod(){
		Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				return null;
			}
		};
	}
}
