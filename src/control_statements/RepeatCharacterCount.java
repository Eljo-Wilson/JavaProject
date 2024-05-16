package control_statements;

import java.util.Scanner;

public class RepeatCharacterCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		find count of repeated characters in string
		System.out.println("Enter the String: ");
		String s = sc.next();

		char ar[] = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] == ar[j]) {

					ar[j] = '0';

					count++;
				}
			}
			if (ar[i] != '0') {
				System.out.println("Count of " + ar[i] + ": " + count);
			}
		}

	}

}
