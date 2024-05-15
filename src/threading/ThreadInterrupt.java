package threading;

class Xyz extends Thread  
{  
	Thread threadToInterrupt;  
	// overriding the run() method  
	public void run()  
	{  
		// invoking the method interrupt  
		System.out.println("Current thread : " + Thread.currentThread().getName());
		threadToInterrupt.interrupt();  
	}  
}  


public class ThreadInterrupt
{  
	// main method  
	public static void main(String[] argvs)  
	{  
		try  
		{  
			// creating an object of the class ABC  
			Xyz th1 = new Xyz();  

			th1.threadToInterrupt = Thread.currentThread();  
			System.out.println("Current thread is : " + Thread.currentThread().getName());
			th1.start();  
			System.out.println("Current thread is : " + Thread.currentThread().getName());
			// invoking the join() method leads   
			// to the generation of InterruptedException  
			th1.join();  
		}  
		catch (InterruptedException ex)  
		{  
			System.out.println("The exception has been caught. " + ex);  
		}  
	}  
}  