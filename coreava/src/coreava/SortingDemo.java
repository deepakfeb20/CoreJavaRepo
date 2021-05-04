package coreava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp{
	int id;
	String name;
	
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

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class SortingDemo {

	public static void main(String[] args) {
		List<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(4,"A"));
		l.add(new Emp(1,"T"));
		l.add(new Emp(7,"Y"));
		l.add(new Emp(8,"R"));
		l.add(new Emp(9,"H"));
		/*
		 * Collections.sort(l,(e1,e2)->{ //return (e1.name < e2.name) ? -1 : (e1.name >
		 * e2.name) ? 1 : 0; return -e1.name.compareTo(e2.name); });
		 */
		List<Integer> l2 = Arrays.asList(1,26,33,4,55,6,7);
		Optional<Integer> n = l2.stream().min((e1,e2)->{
			return (e1<e2)?-1:(e1>e2)?1:0;
		});/*
			 * System.out.println(n.get()); System.out.println(l2);
			 */
      
		 List l3 = l2.stream().filter(e->e%2==0).collect(Collectors.toList());
		 System.out.println(l3);
		 
		 List l4 = l2.stream().map(e->e*2).collect(Collectors.toList());
		 System.out.println(l4);
	}

}


















