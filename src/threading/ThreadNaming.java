package threading;

public class ThreadNaming extends Thread{
	
	ThreadNaming(String threadName){
		super(threadName);
	}
	
	public void run() {
		System.out.println("Running...");
		System.out.println(Thread.currentThread().getName());  
	}

	public static void main(String[] args) {
//		ThreadNaming th1 = new ThreadNaming();
//		ThreadNaming th2 = new ThreadNaming();
		ThreadNaming th1 = new ThreadNaming("First thread");
		ThreadNaming th2 = new ThreadNaming("Second thread");
		System.out.println("Name of thread th1 : " + th1.getName());
		System.out.println("Name of thread th2 : " + th2.getName());
		th1.start();
		th2.start();
		th1.setName("Vipul Roy");
		System.out.println("Name of thread th1 after chaning its name : " + th1.getName());
		System.out.println("Current thread : " + Thread.currentThread().getName());
	}

}
