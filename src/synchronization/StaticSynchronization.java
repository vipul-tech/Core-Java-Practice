package synchronization;

class StaticTable{
	public static synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		Thread th1 = new Thread() {
			public void run() {
				StaticTable.printTable(1);  
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				StaticTable.printTable(5);
			}
		};
		th1.start();
		th2.start();
	}

}
