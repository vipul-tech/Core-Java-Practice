package inputoutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample {

	public static void main(String[] args) throws IOException {
		String srg = "1##2#34###12";  
		byte ary[] = srg.getBytes();  
		ByteArrayInputStream array = new ByteArrayInputStream(ary);  
		PushbackInputStream push = new PushbackInputStream(array);  
		int i;        
		while( (i = push.read())!= -1) {  
			if(i == '#') {  
				int j;  
				if( (j = push.read()) == '#'){  
					System.out.print("**");  
				}else {  
					push.unread(j);  
					System.out.print((char)i);  
				}  
			}else {  
				System.out.print((char)i);  
			}  
		}        
	}

}
