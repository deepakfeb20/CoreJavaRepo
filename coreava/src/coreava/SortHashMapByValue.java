package coreava;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String,Integer> std = new HashMap<>();
		std.put("dee", 60);
		std.put("mee", 70);
		std.put("pee", 30);
		std.put("iee", 20);
		std.put("yee", 10);
		std.put("ree", 80);
		std.put("tee", 90);
		/*
		 * LinkedHashMap<String, Integer> m2 =
		 * std.entrySet().stream().sorted(Map.Entry.comparingByKey((e1,e2)->-e1.
		 * compareTo(e2))) .collect(Collectors.toMap(e->e.getKey(),e->
		 * e.getValue(),(oldValue,newVAlue)->oldValue,LinkedHashMap::new));
		 */
		LinkedHashMap<String, Integer> m2 = std.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newVAlue) -> oldValue, LinkedHashMap::new));
		System.out.println(m2);
	}

}

class Student{
	int id;
	String name;
	int marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
