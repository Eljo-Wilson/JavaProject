package control_statements;

public class OddEvenCount {

	public static void main(String[] args) {
//		count of odd and even in 50 numbers
		int count1 = 0, count2 = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("count of even number : " + count1 + '\n' + "count of odd number : " + count2);

//		sum of 1 to 10 numbers
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum of numbers : " + sum);

	}

}
