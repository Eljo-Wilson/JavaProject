package control_statements;

public class Employee {
	String empname;
	int empid;

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empname = "abc";
		System.out.println(emp1.empname = "Hello");
		System.out.println(emp1.empid = 102);
				
		Employee emp2 = new Employee();
		System.out.println(emp2.empname = "another Object");
		System.out.println(emp2.empid = 201);
	}

}
