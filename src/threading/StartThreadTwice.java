package threading;

public class StartThreadTwice extends Thread{
	
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
		
		StartThreadTwice thread1 = new StartThreadTwice();
		thread1.start();
		// will throw IllegalThreadStateException
		thread1.start();
	}

}
