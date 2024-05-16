package control_statements;

import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		array to find count of +ve, -ve, zero numbers
		int size = 4, pcount = 0, ncount = 0, zcount;
		int ar[] = new int[size];
		System.out.println("Enter Array Values : ");
		for (int i = 0; i < 4; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] > 0) {
				pcount++;
			} else if (ar[i] < 0) {
				ncount++;
			}
		}
		zcount = size - (pcount + ncount);
		System.out.println("Entered Array");
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("+ve count: " + pcount);
		System.out.println("-ve count: " + ncount);
		System.out.println("zero count: " + zcount);

		sc.close();
	}

}
