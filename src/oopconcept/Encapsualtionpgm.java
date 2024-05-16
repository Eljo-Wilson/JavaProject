package oopconcept;

public class Encapsualtionpgm {

	public static void main(String[] args) {
		
		Encap ob = new Encap();
		System.out.println(ob.get_empid());
		System.out.println(ob.get_empname());
		
		
		System.out.println("After Setting Values in private variable");
		ob.set_empid(101);
		System.out.println(ob.get_empid());
		ob.set_empname("Manoj");
		System.out.println(ob.get_empname());
	}

}

class Encap {
	private String empname;
	private int empid;
	
	public String get_empname() {		
		return empname;		
	}
	
	public int get_empid() {
		return empid;
	}
	
	public void set_empname(String empname) {
		this.empname = empname;
	}
	
	public void set_empid(int empid) {
		this.empid = empid;
	}
	
	
}
