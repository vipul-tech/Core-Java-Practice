package java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyAPI8 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = es.submit(new Sum(10));
		Future<Integer> f2 = es.submit(new Square(11));
		Future<Double> f3 = es.submit(new Cube(6.0));
		
		es.execute(new MyThread7());
		es.submit(new MyThread7());
		
		System.out.println("Sum result : "+ f1.get());
		System.out.println("Square result : "+ f2.get());
		System.out.println("Cube result : "+ f3.get());
	}
}

class Sum implements Callable<Integer> {
	int value;
	Sum(int value){
		this.value=value;
	}
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=value;i++) {
			sum+=value;
		}
		return sum;
	}
}

class Square implements Callable<Integer> {
	int value;
	Square(int value){
		this.value=value;
	}
	public Integer call() throws Exception {
		return value*value;
	}
}

class Cube implements Callable<Double> {
	double value;
	Cube(double value){
		this.value=value;
	}
	public Double call() throws Exception {
		return value*value*value;
	}
}

class MyThread7 implements Runnable{
//	MyThread7(){
//		new Thread(this).start();
//	}
	public void run() {
		System.out.println("From MyThread7 class...");
	}
}
