package control_statements;

public class MethodPgm {

	public static void main(String[] args) {
		
		MethodPgm obj = new MethodPgm();
		obj.add();
		obj.add(10, 40);
		System.out.println("add1 = " + obj.add1(10, 60));
		System.out.println("add1 = " + obj.add1());
	}
	
//	Method without Parameter & without Return type
	public void add() {
		int a = 20, b = 30;
		int c;
		c = a+b;
		System.out.println("Method without Parameter & without Return type");
		System.out.println("add = " + c);
	}
	
//	Method with Parameter & without Return type
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Method with Parameter & without Return type");
		System.out.println("add = " + c);
	}

//	Method with Parameter & with Return type
	public int add1(int a, int b) {
		int c = a + b;
		System.out.println("Method with Parameter & with Return type");
		return c;
	}
	
//	Method without Parameter & with Return type
	public int add1() {
		int a = 10, b= 40;
		int c = a + b;
		System.out.println("Method without Parameter & with Return type");
		return c;
	}
}
