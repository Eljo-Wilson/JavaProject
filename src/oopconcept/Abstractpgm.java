package oopconcept;

public class Abstractpgm {

	public static void main(String[] args) {
	
		Another ob = new Another();
		ob.abstract_method();
		ob.normal_method();
	}

}


abstract class Abstract_Class {
	
	abstract public void abstract_method();
	public void normal_method() {
		System.out.println("Inside Abstract class Normal Method");
	}
}

class Another extends Abstract_Class {
	
	@Override
	public void abstract_method() {
		System.out.println("Inside another class abstract_method implementation");
		
	}
	
}	
