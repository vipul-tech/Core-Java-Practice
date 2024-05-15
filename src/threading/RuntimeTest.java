package threading;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
//		Runtime.getRuntime().exec("notepad");
//		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
//		System.out.println("Available processors : " + Runtime.getRuntime().availableProcessors());
//		System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory());
//		System.out.println("Max Memory : " + Runtime.getRuntime().maxMemory());
//		System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory());
		
		Runtime r=Runtime.getRuntime();  
		System.out.println("Total Memory: "+r.totalMemory());  
		System.out.println("Free Memory: "+r.freeMemory());  

		for(int i=0;i<10000;i++){  
			new RuntimeTest();  
		}  
		System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		System.gc();  
		System.out.println("After gc(), Free Memory: "+r.freeMemory());  
	}

}
