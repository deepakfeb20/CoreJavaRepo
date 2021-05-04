package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		Integer[] ids = { 1, 3, 5, 4, 3, 5, 6, 7, 9 };
		Stream.of(ids).toArray();
		Emp emp = new Emp();
		
		Map<Integer, Emp> ml = Stream.of(ids).distinct().map(emp :: getById).collect(Collectors.toMap(e->e.id, e->e));
		System.out.println(ml);

		Map<Object, List<Integer>> sum = Stream.of(ids).collect(Collectors.groupingBy(i->(i<=3)?"A":(i>3&&i<=6)?"B":"C"));
		
		/*
		 * System.out.println(sum);
		 * 
		 * Set<Emp> l = Stream.of(ids) .map(emp :: getById).collect(Collectors.toSet());
		 * System.out.println(l); String str = l.stream().map(emp2 ->
		 * emp2.name).collect(Collectors.joining(", ")); System.out.println(str);
		 */
		
		/*
		 * List<Emp> l = Stream.of(ids) .map(emp :: getById) .filter(e->e!=null)
		 * .filter(e->e.salary>=50000) .sorted(Comparator.comparing(Emp :: getSalary))
		 * .distinct() .collect(Collectors.toList()); Emp emp2 = Stream.of(ids) .map(emp
		 * :: getById) .filter(e->e!=null) .filter(e->e.salary>=50000)
		 * .sorted((e1,e2)->-e1.name.compareTo(e2.name)) .findFirst() .orElse(null);
		 * System.out.println(emp2);
		 * 
		 * Stream.of(ids).map(e->e*2).collect(Collectors.toList());
		 * 
		 * List<Integer> l3 =
		 * Stream.of(ids).peek(emp::getById).peek(System.out::println).collect(
		 * Collectors.toList());
		 */
	}

}

class Emp {
	int id;
	String name;
	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	Emp() {

	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	Emp getById(int id) {
		return new Emp(id, "dee" + id, 10000 * id);
	}

	@Override
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		 if(this.name.equals(e.name)&&this.id==e.id&&this.salary==e.salary) {
		    	 return true;
		 }else {
			 return false;
		 }
		 
	}
}
