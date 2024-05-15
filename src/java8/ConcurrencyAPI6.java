package java8;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyAPI6 {

	public static void main(String[] args) {
		ReentrantLock rl = new ReentrantLock();
		new MyThread4("A", rl);
		new MyThread4("B", rl);
		new MyThread4("C", rl);
		new MyThread4("D", rl);
		new MyThread4("E", rl);
	}

}

class Shared2 {
	static int count = 0;
}

class MyThread4 implements Runnable {
	String name;
	ReentrantLock rl;
	MyThread4(String name, ReentrantLock rl){
		this.name=name;
		this.rl=rl;
		new Thread(this).start();
	}
	public void run() {
		System.out.println("Starting..."+name);
		rl.lock();
		System.out.println(name+" is waiting to lock the count variable");
		rl.lock();
		System.out.println(name+" has locked the count");
		Shared.count++;
		System.out.println(name+" : "+Shared.count);
		System.out.println(name+" is releasing the lock on count");
		rl.unlock();
		System.out.println("Finished...."+name);
		rl.unlock();
	}
	
}
