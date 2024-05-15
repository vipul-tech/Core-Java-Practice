package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name;
	int age;
	int salary;
	String desig;
	
	public Employee(String name, int age, int salary, String desig) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desig = desig;
	}
	
	public String toString() {
		return "("+name+", "+age+", "+salary+", "+desig+")";
	}
}

public class StreamAPI5 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Vipul", 25, 71000, "Programmer"));
		list.add(new Employee("Rohit", 27, 91000, "Manager"));
		list.add(new Employee("Riya", 24, 61000, "Programmer"));
		list.add(new Employee("Ananya", 22, 70000, "Tester"));
		list.add(new Employee("Raushan", 29, 50000, "Tester"));
		list.add(new Employee("Sahil", 27, 84000, "Programmer"));
		list.add(new Employee("Varun", 25, 56000, "Tester"));
		list.add(new Employee("Sakshi", 30, 98000, "Manager"));
		list.add(new Employee("Sumit", 22, 75000, "Programmer"));
		list.add(new Employee("Payal", 31, 98000, "Manager"));
		
		Map<Boolean, List<Employee>> m1 = list.stream().collect(Collectors.partitioningBy(e->e.age>26));
		System.out.println(m1);
		
		Map<Boolean, Long> m2 = list.stream().collect(Collectors.partitioningBy(e->e.age>26, Collectors.counting()));
		System.out.println(m2);
		
		Map<String, List<Employee>> m3 = list.stream().collect(Collectors.groupingBy(e->e.desig));
		System.out.println(m3);
		
		Map<String, Long> m4 = list.stream().collect(Collectors.groupingBy(e->e.desig, Collectors.counting()));
		System.out.println(m4);
		
		Map<String, List<String>> m5 = list.stream().collect(Collectors.groupingBy(e->e.desig, Collectors.mapping(e->e.name.toUpperCase(), Collectors.toList())));
		System.out.println(m5);
		
		Map<String, Integer> m6 = list.stream().collect(Collectors.groupingBy(e->e.desig, Collectors.summingInt(e->e.salary)));
		System.out.println(m6);
	}

}
