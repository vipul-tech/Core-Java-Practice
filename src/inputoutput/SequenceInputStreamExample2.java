package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample2 {

	public static void main(String[] args) {
		try {
			FileInputStream fin1 = new FileInputStream("G:\\IOStream\\testin1.txt");
			FileInputStream fin2 = new FileInputStream("G:\\IOStream\\testin2.txt");
			FileInputStream fin3 = new FileInputStream("G:\\IOStream\\testing.txt");
			FileInputStream fin4 = new FileInputStream("G:\\IOStream\\testing1.txt");
			
			Vector<FileInputStream> v = new Vector<FileInputStream>();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			v.add(fin4);
			
			Enumeration<FileInputStream> e = v.elements();
			SequenceInputStream sis = new SequenceInputStream(e);
			
			int i=0;
			
			while(i!=-1) {
				i = sis.read();
				System.out.print((char)i);
			}
			
			sis.close();
			fin1.close();
			fin2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
