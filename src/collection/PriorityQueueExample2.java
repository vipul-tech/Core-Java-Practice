package collection;

import java.util.PriorityQueue;

class StudentDetails implements Comparable<StudentDetails>{
	int rollno;
	String name;
	int age;
	String city;
	
	public StudentDetails(int rollno, String name, int age, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public int compareTo(StudentDetails s) {
		if(name.compareTo(s.name)>0)
			return -1;
		else if(name.compareTo(s.name)<0)
			return 1;
		else
			return 0;
	}
	
}

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		PriorityQueue<StudentDetails> pq = new PriorityQueue<>();
		
		StudentDetails s1 = new StudentDetails(88, "Somesh Kumar", 24, "Patna");
		StudentDetails s2 = new StudentDetails(34, "Ramesh Kumar", 21, "Kolkata");
		StudentDetails s3 = new StudentDetails(67, "Vinesh Kumar", 29, "Ranchi");
		
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		
		for(StudentDetails s : pq)
			System.out.println(s.rollno + " " + s.name + " " + s.age + " " + s.city);
	}

}
