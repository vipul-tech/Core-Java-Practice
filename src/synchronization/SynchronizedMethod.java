package synchronization;

class Table{
	synchronized public void printTable(int n) {
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

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);  
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(15);  
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		Table t = new Table();
		MyThread1 th1 = new MyThread1(t);
		MyThread2 th2 = new MyThread2(t);
		th1.start();
		th2.start();
	}

}
