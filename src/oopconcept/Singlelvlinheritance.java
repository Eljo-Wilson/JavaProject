package oopconcept;

public class Singlelvlinheritance {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.job();

	}

}

class Parent {

	public void job() {
		System.out.println("Job Details");
	}
}

class Child extends Parent {

	public void childmethod() {
		System.out.println("Child Details");
	}
}
