package exception;

public class ExceptionHandling8 {
	public static void main(String[] args) {
		ExceptionHandling8 obj = new ExceptionHandling8();
		System.out.println("Hashcode : " + obj.hashCode());
		obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");    
	}
	
	protected void finalize() {
		System.out.println("Inside finalize method...");
	}
}
