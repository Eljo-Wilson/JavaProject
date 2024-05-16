package control_statements;
import oopconcept.AccessModifier;

public class AccessModifier2 extends AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier ob = new AccessModifier();
		AccessModifier2 obj = new AccessModifier2();
		System.out.println("Accessing Protected Variable fom AccessModifier Class");
//		System.out.println(ob.b); use this line without inheriting
		System.out.println("Accessing Protected Variable fom AccessModifier after inheriting Class");
		System.out.println(obj.b);
	}

}
