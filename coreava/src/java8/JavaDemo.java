package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaDemo {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
		l.add(new Student(18,"Jon",60));
		l.add(new Student(16,"Aon",70));
		l.add(new Student(13,"Bon",80));
		l.add(new Student(15,"Con",50));
		l.add(new Student(20,"Kon",30));
		l.add(new Student(19,"Don",90));
		l.add(new Student(19,"Lon",90));
		l.add(new Student(19,"Lon",90));
		l.add(new Student(20,"Kon",30));
		
		List l2 = l.stream().filter(s->s.age<18&&s.marks>=60).map(s->s.name).sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		Optional<Object> name = l.stream().max((s1,s2)->(s1.marks<s2.marks)?-1:(s1.marks>s2.marks)?1:0).map(s->s.name);
		System.out.println(name.get());
		//l.stream().distinct();
		long lng = l.stream().map(s-> s.age).count();
		System.out.println(lng);

	}

}
