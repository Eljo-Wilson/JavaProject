package oopconcept;

public class Employee {
	String empname;
	int empid;

	public static void main(String[] args) {
		
		Employee obj = new Employee("abc", 101);
		System.out.println(obj.empname);
		System.out.println(obj.empid);
		
		AccessModifier ob = new AccessModifier();
		System.out.println("Accessing Private Variable From AccessModifier Class");
//		System.out.println(ob.a);
		System.out.println("Accessing Protected Variable fom AccessModifier Class");
		System.out.println(ob.b);
		System.out.println("Accessing Default Variable fom AccessModifier Class");
		System.out.println(ob.c);
		
	}

	public Employee(String empname, int empid) {
		
		this.empname = empname;
		this.empid = empid;
	}

}
