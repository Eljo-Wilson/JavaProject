package oopconcept;
import java.util.Scanner;

public class Inheritancepgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee1 ob = new Employee1();
		Manager obj = new Manager();
		Member obj1 = new Member();
		
		System.out.println("Enter Name : ");
		obj1.name = sc.next();

		
		System.out.println("Enter Age : ");
		obj1.age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Address : ");
		obj1.address = sc.nextLine();
		
		
		System.out.println("Enter Phone Number : ");
		obj1.phoneNumber = sc.nextLine();
		
		System.out.println("Enter Salary : ");
		obj1.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Specialization : ");
		ob.specialization = sc.nextLine();
		
		System.out.println("Enter Department : ");
		obj.department = sc.next();
		
		obj1.printDetails();
		System.out.println("Specialization : " + ob.specialization);
		System.out.println("Department : " + obj.department);
		
		
		sc.close();
	}

}

class Member {
	
	String name, address, phoneNumber;
	int age, salary;
	
	
	public void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		System.out.println("PhoneNumber : " + phoneNumber);
		System.out.println("Salary : " + salary);
		
	}
	
}

class Employee1 extends Member {
	String specialization;
	
}

class Manager extends Member {
	String department;
}
