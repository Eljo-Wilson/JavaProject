package control_statements;

public class Nested_Foor_Pattern {

	public static void main(String[] args) {
//		create pattern with nested loop
//		* * * *
//		* * * *
//		* * * *

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

