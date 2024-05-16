package control_statements;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.next();
		String str1 = "";

//		char ar[] = str.toCharArray();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
//			System.out.print(ar[i] + "");
			str1 += str.charAt(i);
		}
		String str3 = str.equals(str1) ? "String is Palindrome" : "String not Palindrome";
		System.out.println(str3);
	}

}
