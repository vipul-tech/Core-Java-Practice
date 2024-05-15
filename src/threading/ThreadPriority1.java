package threading;

public class ThreadPriority1 extends Thread{

	public void run() {
		System.out.println("Inside run() method...");
	}
	
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());

		ThreadPriority1 th1 = new ThreadPriority1();
		//since th1 thread is a child thread of main thread, so its prority is also same
		System.out.println("Priority of th1 thread " + th1.getPriority());
	}

}
