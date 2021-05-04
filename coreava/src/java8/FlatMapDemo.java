package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5);
		Arrays.asList("dee","mee");
		
        List<List<String>> l = Arrays.asList(
        		Arrays.asList("aee","bee"),
        		Arrays.asList("aee","bee"),
        		Arrays.asList("aee","bee")
             );
        System.out.println(l);
        List<String> l2 =  l.stream().flatMap(Collection::stream).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
	}

}
