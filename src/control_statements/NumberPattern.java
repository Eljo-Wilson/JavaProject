package control_statements;

public class NumberPattern {

	public static void main(String[] args) {
//		Number pattern
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
		System.out.println("Number Pattern");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		Number pattern
//		1
//		2 3
//		4 5 6
//		7 8 9 10
		System.out.println("Number Pattern 2");
		int count = 1;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++, count++) {

				System.out.print(count + " ");
			}

			System.out.println();
		}

	}

}
