package control_statements;

public class ReverseNumber {

	public static void main(String[] args) {
//		Reverse of number 2768
		int num = 13231;
		for (int i = num; i > 0; i = (i / 10)) {
			System.out.print(i % 10);
		}

//		using while
		System.out.println('\n' + "Using while");
		int j = num, rev = 0;
		while (j > 0) {
			rev = (rev * 10) + (j % 10);
//			System.out.print(j % 10);
			j /= 10;
		}
		System.out.println("Reverse Number : " + rev);
		if (num == rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

}
