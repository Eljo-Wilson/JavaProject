package oopconcept;

public class InterfacesInheritances {

	public static void main(String[] args) {
		
		Tv ob = new Tv();
		ob.method1();
		ob.method2();
	}

}

interface tv_remote {
	public void method1();
	
}

interface smart_tv_remote extends tv_remote {
	public void method2();
}

class Tv implements smart_tv_remote {

	@Override
	public void method1() {
		System.out.println("Inside method1");
		
	}

	@Override
	public void method2() {
		System.out.println("Inside method2");
		
	}
	
}