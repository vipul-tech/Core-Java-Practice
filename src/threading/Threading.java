package threading;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("thread1 is running...");
	}
}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("thread2 is running...");
	}
}

class MyThread3 implements Runnable{
	public void run() {
		System.out.println("thread3 is running...");
	}
}

public class Threading {
	
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		Runnable thread2 = new MyThread2();
		Thread t2 = new Thread(thread2);
		t2.start();
		Runnable thread3 = new MyThread3();
		Thread t3 = new Thread(thread3,"My first thread");
		t3.start();
		System.out.println(t3.getName());
		Thread t4 = new Thread("My second thread");
		System.out.println(t4.getName());
	}
	
}
