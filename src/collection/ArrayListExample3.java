package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(90);
		list.add(51);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\Back-endProject\\file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Desktop\\Back-endProject\\file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}

}
