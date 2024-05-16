package control_statements;

public class Calculator_Switch {

	public static void main(String[] args) {
		// Calculator using switch
		System.out.println("Calculator Using Switch");
		char a = '0';
		int num1 = 10, num2 = 50;
		switch (a) {
		case '+':
			System.out.println(num1 + " " + a + " " + num2 + " = " + (num1 + num2));
			break;

		case '-':
			System.out.println(num1 + " " + a + " " + num2 + " = " + (num1 - num2));
			break;

		case '/':
			System.out.println(num1 + " " + a + " " + num2 + " = " + (num1 / num2));
			break;

		case '*':
			System.out.println(num1 + " " + a + " " + num2 + " = " + (num1 * num2));
			break;

		default:
			System.out.println("Invalid operator");
		}

	}

}
