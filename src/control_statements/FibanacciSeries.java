package control_statements;

import java.util.Scanner;
import java.math.BigInteger;

public class FibanacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger zero = BigInteger.ZERO;

//		BigInteger a = zero;
//		BigInteger b = BigInteger.ONE;
//		BigInteger c = zero;
		int a = 0, b = 1, c = 0;

		System.out.println("Fibanocci Series from 1 to 10");
		for (int i = 0; i < 10; i++) {

			System.out.println(c);
			c = a + b;
			a = c;
			b = c - b;
//			c = a.add(b);
//			a = c;
//			b = a.subtract(b);

		}

	}

}
