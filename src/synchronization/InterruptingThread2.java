package synchronization;

public class InterruptingThread2 extends Thread{

	public void run(){  
		for(int i=1;i<=2;i++){  
			if(Thread.interrupted()){  
				System.out.println(Thread.currentThread().getName()+" : code for interrupted thread");  
			}  
			else{  
				System.out.println(Thread.currentThread().getName()+" : code for normal thread");  
			}  

		}//end of for loop  
	}  

	public static void main(String[] args) {
		InterruptingThread2 th1 = new InterruptingThread2();
		InterruptingThread2 th2 = new InterruptingThread2();
		
		th1.start();
		
		th1.interrupt();
		
		th2.start();
		
		th2.interrupt();
	}

}
