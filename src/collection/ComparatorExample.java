package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
	int rollno;  
	String name;  
	int age;  
	Students(int rollno,String name,int age){
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}

class AgeComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.age>o2.age)
			return 1;
		else if(o1.age<o2.age)
			return -1;
		else
			return 0;
	}
	
}

class NameComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<>();
		al.add(new Students(101,"Vijay",23));  
		al.add(new Students(102,"Ajay",27));  
		al.add(new Students(103,"Jai",21)); 
		al.add(new Students(104,"Ravi",24));  
		al.add(new Students(105,"Sohan",20));  
		al.add(new Students(106,"Ankit",29));
		
		System.out.println("Original list---------");
		for(Students s : al)
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		
		Collections.sort(al, new AgeComparator());
		System.out.println("Sorted list by age---------");
		for(Students s : al)
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		
		Collections.sort(al, new NameComparator());
		System.out.println("Sorted list by name---------");
		for(Students s : al)
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		
	}

}
