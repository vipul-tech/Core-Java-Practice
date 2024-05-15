package collection;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	String dept;
	
	public Employee(int id, String name, int age, String dept) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

	@Override
	public int compareTo(Employee e) {
		if(id>e.id)
			return 1;
		else if(id<e.id)
			return -1;
		else
			return 0;
	}
}

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<>();
		
		Employee e1 = new Employee(11, "Shivam", 22, "IT");
		Employee e2 = new Employee(2, "Ankit", 25, "Security");
		Employee e3 = new Employee(34, "Archikka", 21, "Operation");
		Employee e4 = new Employee(17, "Riya", 28, "Surgery");
		Employee e5 = new Employee(24, "Puja", 29, "HR");
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for(Employee e : ts)
			System.out.println(e.id + " " + e.name + " " + e.age + " " + e.dept);
	}

}
