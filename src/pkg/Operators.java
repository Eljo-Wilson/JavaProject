package pkg;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operator
		
		int a = 20, b = 30;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		// Assignment Operators
		System.out.println("Assignment Operator");
		int c = a;
		System.out.println("a += b = " + (a += b)); // a = a + b
		System.out.println("a -= b = " + (a -= b)); // a = a - b
		
		// Relational Operators
		System.out.println("Relational Operators");
		int v1 = 10, v2 = 20;
		System.out.println(v1 < v2);
		System.out.println(v1 <= v2);
		System.out.println(v1 > v2);
		System.out.println(v1 >= v2);
		System.out.println(v1 == v2);
		System.out.println(v1 != v2);
		
		// Logical Operators
		System.out.println("Logical Operators");
		
//		A	B	A&&B	A||B	!A	!B
//		0	0	 0		 0		 1	 1
//		0	1	 0	 	 1		 1	 0
//		1 	0	 0 		 1	 	 0 	 1
//		1 	1 	 1		 1		 0 	 0
		
		String userName = "abc";
		String password = "abc123";
		System.out.println(userName == "abc" && password == "abc123");
		System.out.println(userName != "abcd" && password != "abc1234");
	
		// Unary Operator
		System.out.println("Unary Operator");
		// ++ increment by 1
		// -- decrement by 1
		// postincrement 
		int a1 = 20; // Here value increment by 1 after printing
		System.out.println("a1++ = " + a1 ++);
		// preincrement
		int a2 = 30;
		System.out.println("++a1 = " + ++ a2);
		
		// Ternary Operator
		System.out.println("Ternary Operator");
		// Syntax variable = condition? exp1:exp2
		int z = 20, x = 50;
		String var = z > x ? z + " is greater" : x + " is greater";
		System.out.println(var);
		
		
		
		
		
	}
	

}
