package inputoutput;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		String path = "";  
        boolean bool = false;  
		File file = new File("G:\\IOStream\\textFile.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("New file is created...");
			}else {
				System.out.println("File already exist...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file);	
		File file2 = file.getCanonicalFile();
		System.out.println(file2);
		bool = file2.exists();
		path = file2.getAbsolutePath();
		System.out.println(bool);
		if(bool)
			System.out.println(path + " exist? " + bool);
		
		System.out.println("-------------------");
		//G:\IOStream
		File f = new File("G:\\IOStream");
		String[] fileNames = f.list();
		
		for(String fileName : fileNames) {
			System.out.println(fileName);
		}
		
		File files[]=f.listFiles();
	    for(File fileName2 :files){  
	        System.out.println(fileName2.getName()+" Can Write: "+fileName2.canWrite()+"    Is Hidden: "+fileName2.isHidden()+" Length: "+fileName2.length()+" bytes");  
	    }
	}

}
