package java8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ConcurrencyAPI9 {

	public static void main(String[] args) {
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println(processors);
		
		int[] numbers = new int[1000];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i;
		}
		ForkJoinPool forkjoinpool = new ForkJoinPool(processors);
		Long result= forkjoinpool.invoke(new Sum2(numbers, 0, numbers.length));
		System.out.println("Result : "+result);
	}

}

class Sum2 extends RecursiveTask<Long>{
	int low;
	int high;
	int[] array;
	Sum2(int[] array, int low, int high){
		this.array=array;
		this.low=low;
		this.high=high;
	}
	protected Long compute() {
		if(high-low<=10) {
			long sum=0;
			for(int i=low;i<high;i++)
				sum+=array[i];
			return sum;
		}else {
			int mid = low+(high-low)/2;
			Sum2 left = new Sum2(array,low,mid);
			Sum2 right = new Sum2(array, mid, high);
			left.fork();
			long rightResult = right.compute();
			long leftResult = left.compute();
			return rightResult+leftResult;
		}
	}
	
}
