package control_statements;

import java.util.Scanner;

public class CalculatorSwitchReading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter symbol(+,/,-,*,%) of operation you want :");
		char a = sc.next().charAt(0);
		switch (a) {
		case '+':

			System.out.println(num1 + " " + a + " " + num2 + " " + "= " + (num1 + num2));
			break;

		case '-':
			System.out.println(num1 + " " + a + " " + num2 + " " + "= " + (num1 - num2));
			break;

		case '*':
			System.out.println(num1 + " " + a + " " + num2 + " " + "= " + (num1 * num2));
			break;

		case '/':
			System.out.println(num1 + " " + a + " " + num2 + " " + "= " + (num1 / num2));
			break;

		case '%':
			System.out.println(num1 + " " + a + " " + num2 + " " + "= " + (num1 % num2));
			break;

		default:
			System.out.println("Choose Correct Symbol");

		}
		sc.close();
	}

}
