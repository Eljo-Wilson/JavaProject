package control_statements;

public class Stringpgm {

	public static void main(String[] args) {

//		.concat()
		String s = "hello";
		String s1 = "welcome";
		String s2 = "hello welcome to luminar";
		String s3 = "Welcome";
		System.out.println(s.concat(s1));
//		concat using +
		System.out.println(3 + 2 + s + 5 + 1);

//		.equals()
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s3));
//		.equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s3));

//		.contains()
		System.out.println(s2.contains("luminar"));

//		.toUpperCase() and .toL owerCase();
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

//		.startsWith() and .endsWith()
		System.out.println(s2.startsWith("hello"));
		System.out.println(s2.endsWith("luminar"));

//		.trim()
		String s4 = "    hello    ";
		System.out.println(s4);
		System.out.println(s4.trim());

//		.charAt()
		System.out.println(s2.charAt(3));

//		.length()
		System.out.println(s2.length());

//		.substring()
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(1));

//		.replace()
		System.out.println(s2.replace("hello", "hai"));

//		.split()
		String ar[] = s2.split(" ");
		for (String v : ar) {
			System.out.println(v);
		}

//		.toCharArray()
		char ar2[] = s1.toCharArray();
		for (char c : ar2) {
			System.out.println(c);
		}

	}

}
