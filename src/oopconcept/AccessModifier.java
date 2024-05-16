package oopconcept;

public class AccessModifier {
	
	private int a = 10;
	protected int b = 20;
	int c = 40; // declaring as default
	
	public static void main(String[] args) {
		
		AccessModifier ob = new AccessModifier();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
	}

}
