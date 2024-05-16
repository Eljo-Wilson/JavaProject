package pkg;

public class Swaping {

	public static void main(String[] args) {
		
		// Swapping with variable a = 10, b = 20
		System.out.println("Swapping with Variable");
		int a = 10, b = 20, c;
		System.out.println("Before Swapping");
		System.out.println("a = " + a +'\n' +  "b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping");
		System.out.println("a = " + a +'\n' +  "b = " + b);
		
		// Swapping without variable a = 10, b = 20
		System.out.println("Swapping without Variable");
		int a1 = 40, b1 = 50;
		System.out.println("Before Swapping");
		System.out.println("a1 = " + a1 + '\n' + "b1 = " + b1 );
		a1 = a1 + b1; 
		b1 = a1 - b1;
		a1 = a1 - b1;
		System.out.println("After Swapping");
		System.out.println("a1 = " + a1 + '\n' + "b1 = " + b1);
	
		int c1 = 18;
		System.out.println(c1 % 10);
	}

}
