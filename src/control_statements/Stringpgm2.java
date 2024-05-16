package control_statements;

public class Stringpgm2 {

	public static void main(String[] args) {
//		java is platform independent language
//		check this contains platform
		String s1 = "java is platform independent language";
		System.out.println(s1.contains("platform"));
		
//		jmeter is a performance testing tool
//		split this by word by word
		String s2 = "jmeter is a performance testing tool";
		String a[] = s2.split(" ");
		System.out.println("String After Spliting");
		for(String n : a) {
			System.out.println(n);
		}
		
	}

}
