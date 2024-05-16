package control_statements;

public class NestedIf {

	public static void main(String[] args) {
		// age>18, weight>50 can donate blood using nested if
		int age = 18, weight = 50;
		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("The Person can donate blood");
			} else {
				System.out.println("The person can't donate blood, weight is lesser");
			}
		} else {
			System.out.println("The Person can't donate blood, age is lesser");
		}

	}

}
