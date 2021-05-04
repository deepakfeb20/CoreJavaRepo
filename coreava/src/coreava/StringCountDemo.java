package coreava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StringCountDemo {

	public static void main(String[] args) {
		String str = "ffffdddddj  jjjiiiiiffff";
		
		char[] cr = str.toCharArray();
	    /*Arrays.sort(cr);
		System.out.println(cr);*/
		for(int i=0;i<cr.length;i++) {
			if(Character.isWhitespace(cr[i])) {
				
			}
		}
         
		
		List<Character> l = new ArrayList<>();
		
		String a = "";
		for(int i=0;i<str.length();i++) {
			if(a.contains(""+str.charAt(i))) {
				
			}
		}
		
		/*
		 * Map<Character, Integer> m = new HashMap<>(); for (int i = 0; i <
		 * str.length(); i++) { if (m.containsKey(str.charAt(i))) { int count =
		 * m.get(str.charAt(i)); m.put(str.charAt(i), count + 1); } else {
		 * m.put(str.charAt(i), 1); } } System.out.println(m);
		 */

	}

}
