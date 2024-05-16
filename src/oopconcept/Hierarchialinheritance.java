package oopconcept;

public class Hierarchialinheritance {

	public static void main(String[] args) {
		
		ClassBB obj1 = new ClassBB();
		ClassCC obj2 = new ClassCC();
		System.out.println("Calling methods in ClassB");
		obj1.display1();
		obj1.display2();
		System.out.println("Calling methods in ClassC");
		obj2.display1();
		obj2.display3();
		
	}

}

class ClassAA {
	public void display1() {
		System.out.println("Inside display1 method");
	}
}

class ClassBB extends ClassAA {
	public void display2() {
		System.out.println("Inside display2 method");
	}
}

class ClassCC extends ClassAA {
	public void display3() {
		System.out.println("Inside display3 method");
	}
}
