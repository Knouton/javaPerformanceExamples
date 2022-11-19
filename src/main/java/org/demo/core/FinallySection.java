package org.demo.core;

import java.util.concurrent.TimeUnit;


public class FinallySection {
	public static void main(String[] args) throws Exception {
		//пример когда блок finally не выполнится
		Thread t = new Thread(new Runnable(){
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println(Thread.currentThread() + ": " + i);
						TimeUnit.SECONDS.sleep(1);
					}
				} catch (InterruptedException e) {
					System.out.println("Interrupted!");
				} finally {
					System.out.println("I'm in the finally block!");
				}
			}
		});
		t.setDaemon(true);
		t.start();

		TimeUnit.SECONDS.sleep(5);
		System.out.println("main() finished");
	}
}

