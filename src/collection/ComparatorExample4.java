package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
	int rollno;    
	String name;    
	int age;    
	Student2(int rollno,String name,int age){    
		this.rollno=rollno;    
		this.name=name;    
		this.age=age;    
	}  

	public int getRollno() {  
		return rollno;  
	}  

	public void setRollno(int rollno) {  
		this.rollno = rollno;  
	}  

	public String getName() {  
		return name;  
	}  

	public void setName(String name) {  
		this.name = name;  
	}  

	public int getAge() {  
		return age;  
	}  

	public void setAge(int age) {  
		this.age = age;  
	}  
}

public class ComparatorExample4 {

	public static void main(String[] args) {
		ArrayList<Student2> al=new ArrayList<Student2>();    
		al.add(new Student2(101,"Vijay",23));    
		al.add(new Student2(106,"Ajay",27));    
		al.add(new Student2(105,"Jai",21));
		al.add(new Student2(102,null,21));

		Comparator<Student2> cm3=Comparator.comparing(Student2::getName,Comparator.nullsFirst(String::compareTo));  
		Collections.sort(al,cm3);
		System.out.println("Considers null to be less than non-null");  
		for(Student2 st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		Comparator<Student2> cm4=Comparator.comparing(Student2::getName,Comparator.nullsLast(String::compareTo));  
		Collections.sort(al,cm4);  
		System.out.println("Considers null to be greater than non-null");  
		for(Student2 st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}

