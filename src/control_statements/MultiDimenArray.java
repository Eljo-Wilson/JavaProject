package control_statements;

import java.util.Scanner;

public class MultiDimenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[][] = new int[3][3];
		System.out.println("Enter Array Values : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered Array");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print(ar[i][j] + " ");
//			}
//			System.out.println();
//		}
//		Printing Values Using foreach loop
		for (int v[] : ar) {
			for (int v1 : v) {
				System.out.print(v1 + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
