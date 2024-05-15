package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	private String message;
	public WorkerThread(String message){
		 this.message = message;
	 }

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message : " + message);
		processMessage();
		System.out.println("(End)");
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=1;i<=10;i++) {
			Runnable worker = new WorkerThread(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}System.out.println("Finished all threads");
	}

}
