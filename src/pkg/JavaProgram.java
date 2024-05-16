package pkg;

public class JavaProgram {

	public static void main(String[] args) {
		
		System.out.println("New Program IN Eclipse");
		System.out.print("Printing in same line");
		System.out.println("Printing in same line 2");
		JavaProgram obj = new JavaProgram();
		obj.method();
		obj.display();  // here no use calling display with class object
		display();  // static method can call without using class object
		int value = obj.add();
		System.out.println("sum of value:" +value);
	}
	
	public void method() {
		System.out.println("Inside  Method");
	}
	
	public static void display() {
		System.out.println("Inside display method");
	}
	
	int add() {
		int a=10, b=10, c;
		c = a+b;
		return c;
	}

}
