package java8;

import java.util.concurrent.Exchanger;

public class ConcurrencyAPI2 {

	public static void main(String[] args) {
		Exchanger<String> ex = new Exchanger<String>();
		new Sender(ex);
		new Receiver(ex);
	}

}

class Sender implements Runnable{
	Exchanger<String> ex;
	public  Sender(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}
	public void run() {
		try {
			String[] names = {"Ankit", "Vipul", "Ananya", "Riya", "Puja", "Archikka"};
			for(int i=0;i<names.length;i++) {
				String msg = ex.exchange(names[i]);
				System.out.println("From receiver : " + msg);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

class Receiver implements Runnable{
	Exchanger<String> ex;
	public  Receiver(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}
	public void run() {
		try {
			for(int i=0;i<6;i++) {
				String msg = ex.exchange("Demo");
				System.out.println("Received : " + msg);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
