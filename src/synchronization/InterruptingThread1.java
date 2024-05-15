package synchronization;

public class InterruptingThread1 extends Thread {
	
	public void run() {
		for(int i=1;i<=5;i++)  
			System.out.println(i); 
	}

	public static void main(String[] args) {
		InterruptingThread1 th1 = new InterruptingThread1();
		th1.start();

		System.out.println("Is thread interrupted : " + th1.isInterrupted());
		th1.interrupt();
		System.out.println("Is thread interrupted : " + th1.isInterrupted());
	}

}

