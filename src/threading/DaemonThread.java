package threading;

public class DaemonThread extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon())
			System.out.println(Thread.currentThread().getName() + " Daemon thread is working...");
		else
			System.out.println(Thread.currentThread().getName() + " User thread is working...");
	}

	public static void main(String[] args) {
		DaemonThread th1 = new DaemonThread();
		DaemonThread th2 = new DaemonThread();
		DaemonThread th3 = new DaemonThread();
		
		System.out.println("Is th1 thread daemon : " + th1.isDaemon());
		System.out.println("Is th2 thread daemon : " + th2.isDaemon());
		System.out.println("Is th3 thread daemon : " + th3.isDaemon());
		
		th1.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
		//th2.setDaemon(true);//will throw exception, it must be set before starting the thread
		
		System.out.println("Is th1 thread daemon : " + th1.isDaemon());
		System.out.println("Is th2 thread daemon : " + th2.isDaemon());
		System.out.println("Is th3 thread daemon : " + th3.isDaemon());
	}

}
