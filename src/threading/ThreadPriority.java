package threading;

public class ThreadPriority extends Thread{
	
	public void run() {
		System.out.println("Inside run() method");
	}

	public static void main(String[] args) {
		ThreadPriority th1 = new ThreadPriority();
		ThreadPriority th2 = new ThreadPriority();
		ThreadPriority th3 = new ThreadPriority();
		
		System.out.println("Priority of th1 thread : " + th1.getPriority());
		System.out.println("Priority of th2 thread : " + th2.getPriority());
		System.out.println("Priority of th3 thread : " + th3.getPriority());
		
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9);  
		
		System.out.println("Priority of th1 thread : " + th1.getPriority());
		System.out.println("Priority of th2 thread : " + th2.getPriority());
		System.out.println("Priority of th3 thread : " + th3.getPriority());
		
		System.out.println("Current executing thread : " + Thread.currentThread().getName());
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7);
		
		System.out.println("Priority of " + Thread.currentThread().getName() + " thread "
				+ Thread.currentThread().getPriority());
		
	}

}
