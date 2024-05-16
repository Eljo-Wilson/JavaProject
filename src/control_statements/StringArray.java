package control_statements;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Reading String Array");
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		String[] str = new String[size];
		System.out.println("Enter  string values : ");
		for (int i = 0; i < size; i++) {
			str[i] = sc.next();
		}
		System.out.println("Entered String");
		for (int i = 0; i < size; i++) {
			System.out.println(str[i]);
		}
		sc.close();

	}

}
