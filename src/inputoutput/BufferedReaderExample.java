package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("G:\\IOStream\\file3.txt");
			BufferedReader br = new BufferedReader(fr);
			int i=0;
			while((i=br.read())!=-1) {
				System.out.print((char)i);
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		InputStreamReader r =new InputStreamReader(System.in); 
		BufferedReader br2 = new BufferedReader(r);
		System.out.println();
		System.out.print("Enter your name : ");    
		String name = null;
		try {
			name = br2.readLine();
			br2.close();
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
		System.out.println("Welcome "+name); 

	}

}
