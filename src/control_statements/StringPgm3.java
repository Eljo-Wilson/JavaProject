package control_statements;

public class StringPgm3 {

	public static void main(String[] args) {
		
//		i/p - Testing Training Center, o/p - Center Training Testing
		String str = "Testing Training Center";
		String ar[] = str.split(" ");
		for (int i = ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+ " ");
		}
		
		System.out.println();
//		"Update hello world" to "hi world"
		String s2 = "Hello World";
		
		System.out.println(s2.replace("Hello", "hi"));

//		pattern 
//		1
//		22
//		333
//		4444
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
//		print odd numbers from 1 to 99
		for(int i = 1; i<=99; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
//		Insert word in the middle of another string
		String st = "Another String";
		st = st.replace(" ", " Inserted Word ");
		System.out.println(st);
		
	}

}
