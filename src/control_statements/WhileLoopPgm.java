package control_statements;

public class WhileLoopPgm {

	public static void main(String[] args) {
//		Print 1 to 10 using while
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
//		digit count of 1234 using while
		System.out.println("Digit Count Using while");
		int a = 589685, j = 0;
		while (a > 0) {
			a = (a / 10);
			j++;
		}
		System.out.println("Count of digits : " + j);

	}

}
