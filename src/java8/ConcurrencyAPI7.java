package java8;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyAPI7 {

	public static void main(String[] args) {
		new MyThread5();
		new MyThread5();
		new MyThread5();
		new MyThread5();
		new MyThread5();
	}

}

class Shared3 {
	static AtomicInteger count = new AtomicInteger(0);
}

class MyThread5 implements Runnable {
	MyThread5(){
		new Thread(this).start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : " + Shared3.count.getAndIncrement());
		}
	}
	
}
