package coreava;

class A{
	static void m1() {
		System.out.println("parent");
	}
	
	void m2() {
		System.out.println("parent");
	}
}

public class StaticMethodDemo extends A {

	static void m1() {
		System.out.println("child");
	}
	
	void m2() {
		System.out.println("child");
	}
	
	
	public static void main(String[] args) {
       A a1 = new StaticMethodDemo();
       a1.m2();
	}

}
