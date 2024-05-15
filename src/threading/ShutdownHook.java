package threading;

class MyThread extends Thread{
	public void run() {
		System.out.println("Shut down hook task completed...");
	}
}

public class ShutdownHook {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		//r.addShutdownHook(new MyThread());
		r.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Shut down hook task completed...");
			}
		}
				);
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
