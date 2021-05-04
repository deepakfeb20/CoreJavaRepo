package java8;

public class Student {
	
	int age;
	public String name;
	int marks;
	public Student(int age, String name, int marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
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
