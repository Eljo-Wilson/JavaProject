package oopconcept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading ob = new MethodOverloading();
		ob.add(5.4, 5.8);
		ob.add(5.6, 6);
		;
		ob.add(5, 8.5);
		ob.add(7, 3);
		ob.add(3, 3, 3);

	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Inside method 1");
		System.out.println(c);

	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Inside method 2");
		System.out.println(d);
	}

	public void add(double a, double b) {
		System.out.println("Inside method 3");
		double c = a + b;
		System.out.println(c);
	}

	public void add(int a, double b) {
		System.out.println("Inside method 4");
		double c = a + b;
		System.out.println(c);
	}

	public void add(double a, int b) {
		System.out.println("Inside method 5");
		double c = a + b;
		System.out.println(c);
	}

}
