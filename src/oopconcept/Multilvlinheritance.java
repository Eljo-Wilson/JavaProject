package oopconcept;

public class Multilvlinheritance {

	public static void main(String[] args) {

		ClassC obj = new ClassC();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}

class ClassA {
	public void display1() {
		System.out.println("Inside ClassA display1 method");
	}
}

class ClassB extends ClassA {
	public void display2() {
		System.out.println("Inside ClassB display2 method");
	}
}

class ClassC extends ClassB {
	public void display3() {
		System.out.println("Inside ClassC display3 method");
	}
}
