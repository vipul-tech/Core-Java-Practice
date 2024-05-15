package collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//Create an empty vector with initial capacity 4  
		Vector<String> vec = new Vector<String>(4);  
		//Adding elements to a vector  
		vec.add("Tiger");  
		vec.add("Lion");  
		vec.add("Dog");  
		vec.add("Elephant");  
		//Check size and capacity  
		System.out.println("Size is: "+vec.size());  
		System.out.println("Default capacity is: "+vec.capacity());  
		//Display Vector elements  
		System.out.println("Vector element is: "+vec);  
		vec.addElement("Rat");  
		vec.addElement("Cat");  
		vec.addElement("Deer");  
		//Again check size and capacity after two insertions  
		System.out.println("Size after addition: "+vec.size());  
		System.out.println("Capacity after addition is: "+vec.capacity());  
		//Display Vector elements again  
		System.out.println("Elements are: "+vec);  
		//Checking if Tiger is present or not in this vector         
		if(vec.contains("Tiger"))  
		{  
			System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
		}  
		else  
		{  
			System.out.println("Tiger is not present in the list.");  
		}  
		//Get the first element  
		System.out.println("The first animal of the vector is = "+vec.firstElement());   
		//Get the last element  
		System.out.println("The last animal of the vector is = "+vec.lastElement());  

		//Create an empty Vector        
		Vector<Integer> in = new Vector<>();  
		//Add elements in the vector  
		in.add(100);  
		in.add(200);  
		in.add(300);  
		in.add(200);  
		in.add(400);  
		in.add(500);  
		in.add(600);  
		in.add(700);  
		//Display the vector elements  
		System.out.println("Values in vector: " +in);  
		//use remove() method to delete the first occurence of an element  
		System.out.println("Remove first occourence of element 200: "+in.remove((Integer)200));  
		//Display the vector elements afre remove() method  
		System.out.println("Values in vector: " +in);  
		//Remove the element at index 4  
		System.out.println("Remove element at index 4: " +in.remove(4));  
		System.out.println("New Value list in vector: " +in);  
		//Remove an element  
		in.removeElementAt(5);        
		//Checking vector and displays the element  
		System.out.println("Vector element after removal: " +in);  
		//Get the hashcode for this vector  
		System.out.println("Hash code of this vector = "+in.hashCode());  
		//Get the element at specified index  
		System.out.println("Element at index 1 is = "+in.get(1));  
	}

}
