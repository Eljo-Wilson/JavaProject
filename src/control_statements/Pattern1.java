package control_statements;

public class Pattern1 {

	public static void main(String[] args) {
//		create pattern
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
