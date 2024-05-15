package threading;

class ThreadNew extends Thread{
	public ThreadNew(ThreadGroup tg, String threadName) {
		super(tg, threadName);
		start();
	}
	public void run() {
		for(int j=0;j<1000;j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread has finished executing");
	}
}

public class ThreadGrouping1 {

	public static void main(String[] args) throws SecurityException, InterruptedException {
		ThreadGroup tg = new ThreadGroup("Parent thread group");
		ThreadGroup tg1 = new ThreadGroup(tg,"Child thread group");
		
		ThreadNew th1 = new ThreadNew(tg, "first");
		System.out.println("Starting the first...");
		
		ThreadNew th2 = new ThreadNew(tg, "second");
		System.out.println("Starting the second...");
		
//		tg.interrupt();
		
		System.out.println("Total number of active threads : " + tg.activeCount());
		System.out.println("The total number of active thread groups are : " + tg.activeGroupCount());
		
//		th1.join();
//		th2.join();
		
//		tg1.destroy();
//		System.out.println(tg1.getName() + " is destroyed");
//		
//		tg.destroy();
//		System.out.println(tg.getName() + " is destroyed");
		
		Thread[] grp = new Thread[tg.activeCount()];
		int count = tg.enumerate(grp);
		for(int i=0;i<count;i++) {
			System.out.println("Thread " + grp[i].getName() + " is found.");
		}
		
		int priority = tg.getMaxPriority();
		System.out.println("Maximum priority of parent threadgroup : " + priority);
		
		System.out.println("Parent ThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());
		System.out.println("Parent ThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());
	
//		if(tg.isDaemon())
//			System.out.println("The group is a daemon group");
//		else
//			System.out.println("The group is not a daemon group");
//		tg1.destroy();
//		if(tg1.isDestroyed())
//			System.out.println("The group has been destroyed");
//		else
//			System.out.println("The group has not been destroyed");
	}

}
