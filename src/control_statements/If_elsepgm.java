package control_statements;

public class If_elsepgm {

	public static void main(String[] args) {
		int a = 20, b = 40;
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		// finding greatest number from 3 numbers using else if ladder
		int num1 = 60, num2 = 70, num3 = 100;
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " " + "is greater");
		} else if (num2 > num3) {
			System.out.println(num2 + " " + "is greater");
		} else {
			System.out.println(num3 + " " + "is greater");
		}

	}

}
