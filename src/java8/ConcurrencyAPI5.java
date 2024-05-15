package java8;

import java.util.concurrent.Phaser;

public class ConcurrencyAPI5 {
	public static void main(String[] args) {
		Phaser phsr = new Phaser(1);
		new MyThread3(phsr, "A");
		new MyThread3(phsr, "B");
		new MyThread3(phsr, "C");
		new MyThread3(phsr, "D");
		new MyThread3(phsr, "E");
		
		int currPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase "+currPhase+" completed");
		
		currPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase "+currPhase+" completed");
		
		currPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase "+currPhase+" completed");
		
		phsr.arriveAndDeregister();
		if(phsr.isTerminated())
			System.out.println("Finished...");
	}
}

class MyThread3 implements Runnable {
	Phaser phsr;
	String name;
	MyThread3(Phaser phsr, String name){
		this.phsr=phsr;
		this.name=name;
		new Thread(this).start();
	}
	public void run() {
		System.out.println("Thread "+name+" begining phase one");
		phsr.arriveAndAwaitAdvance();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread "+name+" begining phase two");
		phsr.arriveAndAwaitAdvance();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread "+name+" begining phase three");
		phsr.arriveAndDeregister();
	}
	
}
