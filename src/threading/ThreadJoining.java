package threading;

class ThreadJoin extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("The current thread name is " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadJoining extends Thread{

	public static void main(String[] args) {
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();
		
		System.out.println("Current thread name is " + Thread.currentThread().getName());
		th1.start();
		
		try {
			System.out.println("Current thread : " + Thread.currentThread().getName());
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
			System.out.println("Current thread : " + Thread.currentThread().getName());
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th3.start();
//		try {
//			th3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Current thread name is " + Thread.currentThread().getName());
	}

}
