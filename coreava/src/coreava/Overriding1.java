package coreava;

public class Overriding1 {

	public static void main(String[] args) {

	}

}

class C{
	public int get(long c) {
		return 1;
	}
}

class B extends C{
	
	@Override
	public int get(long c) {
		return 1;
	}
	
	public long get(double g) {
		return 1;
	}
	
	public void get(int i) {
		System.out.println("hello");
	}
}
