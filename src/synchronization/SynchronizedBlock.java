package synchronization;

class TableBlock{
	public void printTable(int n) {
		synchronized(this) {
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
}

class ThreadBlock1 extends Thread{
	TableBlock t;
	public ThreadBlock1(TableBlock t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);  
	}
}

class ThreadBlock2 extends Thread{
	TableBlock t;
	public ThreadBlock2(TableBlock t) {
		this.t = t;
	}
	public void run() {
		t.printTable(15);  
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		TableBlock t = new TableBlock();
		ThreadBlock1 th1 = new ThreadBlock1(t);
		ThreadBlock2 th2 = new ThreadBlock2(t);
		th1.start();
		th2.start();
	}

}
