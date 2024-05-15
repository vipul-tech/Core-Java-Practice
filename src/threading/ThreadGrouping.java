package threading;

public class ThreadGrouping implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Runnable runnable = new ThreadGrouping();
		ThreadGroup tg = new ThreadGroup("Parent thread group");
		
		Thread th1 = new Thread(tg, runnable, "one");
		th1.start();
		
		Thread th2 = new Thread(tg, runnable, "two");
		th2.start();
		
		Thread th3 = new Thread(tg, runnable, "three");
		th3.start();
		
		System.out.println("Thread group name : " + tg.getName());
        tg.list();    

	}

}
