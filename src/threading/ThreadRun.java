package threading;

public class ThreadRun extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) {
		// when we call run() method instead of start() method, then it will behave like normal object
		ThreadRun thread1 = new ThreadRun();
		ThreadRun thread2 = new ThreadRun();
		thread1.run();
		thread2.run();
		
	}

}
