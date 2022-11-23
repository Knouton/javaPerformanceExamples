package org.demo.core.inputOutput;

import java.util.ArrayList;
import java.util.List;

public class IOExample {
	private void orderOfClosingResources() throws Exception {
		try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
		     AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {
			af.doSomething();
			as.doSomething();
		}
	}
	//для использования в try-with-resources нужно чтобы реализовывался интерфейс AutoCloseable
	public class AutoCloseableResourcesFirst implements AutoCloseable {

		public AutoCloseableResourcesFirst() {
			System.out.println("Constructor: первый AutoCloseableResources");
		}

		public void doSomething() {
			System.out.println("Something: первый AutoCloseableResources");
		}

		@Override
		public void close() throws Exception {
			System.out.println("закрытие первого AutoCloseableResources");
		}
	}
	public class AutoCloseableResourcesSecond implements AutoCloseable {

		public AutoCloseableResourcesSecond() {
			System.out.println("Constructor: второй AutoCloseableResources");
		}

		public void doSomething() {
			System.out.println("Something: второй AutoCloseableResources");
		}

		@Override
		public void close() throws Exception {
			System.out.println("закрытие второго AutoCloseableResources");
		}
	}

	public static void main(String[] args) throws Exception {
		IOExample ioExample = new IOExample();
		ioExample.orderOfClosingResources();
	}

}
