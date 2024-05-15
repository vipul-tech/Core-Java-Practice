package java8;

import java.util.concurrent.CountDownLatch;

public class ConcurrencyAPI4 {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch cdl = new CountDownLatch(3);
		System.out.println("Starting...");
		new MyThread2(cdl);
		cdl.await();
		System.out.println("Finished...");
	}

}

class MyThread2 implements Runnable {
	CountDownLatch cdl;
	public MyThread2(CountDownLatch cdl){
		this.cdl=cdl;
		new Thread(this).start();
	}
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				cdl.countDown();
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
