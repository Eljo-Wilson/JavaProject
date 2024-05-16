package control_statements;

import java.util.Scanner;

public class ScannerPgm {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Entered number is : " + a);

		System.out.println("Enter Two Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum of Entered Number : " + (num1 + num2));
		sc.close();  // avoid memory leak, After this we canot use Scanner object 
	}

}
