package oopconcept;

public class MethodOverriding {

	public static void main(String[] args) {
		Father ob1 =new Father();
		Son ob2 = new Son();
//		ob1.phone();
		ob2.phone();

	}

}

class Father {
	public void phone() {
		System.out.println("Samsung");
	}
}

class Son extends Father {

	@Override
	public void phone() {
		
		System.out.println("Nokia");
		super.phone();
	}
}
