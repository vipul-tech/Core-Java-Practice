package java8;

import java.util.concurrent.Semaphore;

public class ConcurrencyAPI {

	public static void main(String[] args) {
		Semaphore s = new Semaphore(2);
		new IncThread("A", s);
		new DecThread("B", s);
		new IncThread("C", s);
		new IncThread("D", s);
		new DecThread("E", s);
	}

}

class Shared {
	static int count=0;
}

class IncThread extends Thread {
	String name;
	Semaphore s;
	public IncThread(String name, Semaphore s) {
		this.name=name;
		this.s = s;
		new Thread(this).start();
	}
	public void run() {
		try {
			System.out.println(name + " is waiting for permission");
			s.acquire();
			System.out.println(name + " got permission");
			for(int i=0;i<5;i++) {
				Shared.count++;
				System.out.println(name + " : " + Shared.count);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		s.release();
		System.out.println(name + " released permission");
	}
}

class DecThread extends Thread {
	String name;
	Semaphore s;
	public DecThread(String name, Semaphore s) {
		this.name=name;
		this.s = s;
		new Thread(this).start();
	}
	public void run() {
		try {
			System.out.println(name + " is waiting for permission");
			s.acquire();
			System.out.println(name + " got permission");
			for(int i=0;i<5;i++) {
				Shared.count--;
				System.out.println(name + " : " + Shared.count);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		s.release();
		System.out.println(name + " released permission");
	}
}
