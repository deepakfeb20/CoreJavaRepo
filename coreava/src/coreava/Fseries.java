package coreava;

import java.util.Scanner;

public class Fseries {

	public static void main(String[] args) {
        int a = 0, b = -1, c = 1;
        Scanner sc= new  Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
        	a=b;
        	b=c;
        	c=a+b;
        	System.out.println(c);
        }
	}

}
