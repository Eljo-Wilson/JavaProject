package control_statements;

import java.util.Scanner;

public class ArrayLargeElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int large = 0, ar[] = new int[5];

		System.out.println("Enter Array Values");
		for (int i = 0; i < 5; i++) {
			ar[i] = sc.nextInt();
			if (large < ar[i]) {
				large = ar[i];
			}
		}
		System.out.println("Entered Array");
		for (int i = 0; i < 5; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("Large Value : " + large);

		sc.close();
	}

}
