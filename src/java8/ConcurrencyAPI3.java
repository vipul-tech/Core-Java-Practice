package java8;

import java.util.concurrent.CyclicBarrier;

public class ConcurrencyAPI3 {

	public static void main(String[] args) throws InterruptedException {
			CyclicBarrier cb = new CyclicBarrier(3, new Action());
			System.out.println("starting...");
			for(int i=0;i<12;i++) {
				new MyThread("Thread "+i, cb);
				Thread.sleep(1000);
			}
	}

}

class MyThread implements Runnable {
	String name;
	CyclicBarrier cb;
	public MyThread(String name, CyclicBarrier cb) {
		this.name= name;
		this.cb = cb;
		new Thread(this).start();
	}
	public void run() {
		try {
			System.out.println(name);
			cb.await();
			System.out.println(name + " again");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

class Action implements Runnable{
	public void run() {
		System.out.println("finished...");
	}
}