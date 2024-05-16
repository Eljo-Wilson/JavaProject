package control_statements;

import java.util.Scanner;

public class SingleDimenArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[4];
		System.out.println("Enter values : ");
		for (int i = 0; i < 4; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Entered Numbers");
		for (int j = 0; j < 4; j++) {
			System.out.println(ar[j]);
		}

		sc.close();
	}

}
