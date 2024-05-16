package oopconcept;

public class Interfacepgm {

	public static void main(String[] args) {

		ClassA1 ob = new ClassA1();
		ob.method1();
		ob.method2();
		System.out.println();

		ClassB1 obj = new ClassB1();
		obj.method1();
		obj.method2();
		System.out.println();

		ClassC1 obj1 = new ClassC1();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();

		interface1 obj2 = new ClassC1(); // Accessing methods using interface1 reference
		obj2.method1();
		obj2.method2();
//		obj2.method3(); Here we cant access method3 using interface1 reference

		interface2 obj3 = new ClassC1(); // Accessing methods using interface2 reference
		obj3.method3();
		obj3.method4();
//		obj3.method1(); Here we cant access method1 using interface2 reference

	}

}

interface interface1 {

	public void method1();

	public void method2();

}

interface interface2 {
	public void method3();

	public void method4();
}

class ClassA1 implements interface1 {

	@Override
	public void method1() {
		System.out.println("Inside ClassA1 method1 ");
	}

	@Override
	public void method2() {
		System.out.println("Inside ClassA1 method2 ");
	}

}

class ClassB1 implements interface1 {

	@Override
	public void method1() {
		System.out.println("Inside ClassB1 method1");

	}

	@Override
	public void method2() {

		System.out.println("Inside ClassB1 method2");

	}

}

//Here we Achieving Multiple Inheritance using interface
class ClassC1 implements interface1, interface2 {

	@Override
	public void method3() {
		System.out.println("Inside ClassC1 method3 ");

	}

	@Override
	public void method4() {
		System.out.println("Inside ClassC1 method4 ");

	}

	@Override
	public void method1() {
		System.out.println("Inside ClassC1 method1 ");

	}

	@Override
	public void method2() {
		System.out.println("Inside ClassC1 method4 ");

	}

}