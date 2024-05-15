package synchronization;

public class InterruptingThread extends Thread {
	
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");  
		} catch (InterruptedException e) {
			e.printStackTrace();
			//throw new RuntimeException("Thread interrupted : " +e);
		}
		System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		InterruptingThread th1 = new InterruptingThread();
		th1.start();
//		try {
//			th1.interrupt();
//		}catch(Exception e) {
//			System.out.println("Exception handled "+e);
//		}
		
		th1.interrupt();
	}

}
