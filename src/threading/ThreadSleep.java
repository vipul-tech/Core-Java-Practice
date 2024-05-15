package threading;

public class ThreadSleep extends Thread{

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
		
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		t1.start();
		t2.start();
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			for(int i =0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println("From Main() : " + i);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}

	}

}
