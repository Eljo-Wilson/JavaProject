package control_statements;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		int sum = 0;

		System.out.println("Enter Array Values: ");
		for (int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		System.out.println("Sum of Array values : " + sum);

	}

}
