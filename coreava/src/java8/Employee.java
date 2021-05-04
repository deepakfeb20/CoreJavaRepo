package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	int id;
	String name;
	int salary;
	public Employee() {
		
	}
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] str) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(1,"deepak",2000));
		l.add(new Employee(2,"dee",2000));
		l.add(new Employee(3,"nee",2000));
		l.add(new Employee(4,"mee",2000));
		l.add(new Employee(5,"pee",2000));
		l.add(new Employee(6,"gee",2000));
		
		Map<Integer, Employee> m = new HashMap<Integer, Employee>();
		
		m = l.stream().collect(Collectors.toMap(e->e.getId(), e->e));
		 System.out.println(m);
		 Stream.of(1,2,3,4,5,6);
	 }

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


