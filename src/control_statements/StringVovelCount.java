package control_statements;

import java.util.Scanner;

public class StringVovelCount {
	String vovels = "aeiou";
	int vcount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringVovelCount ob = new StringVovelCount();

		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Count of Vovels: " + ob.vovel(str));
		sc.close();
	}

	public int vovel(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (vovels.indexOf(str.charAt(i)) >= 0) {
				vcount++;
			}
		}
		return vcount;

//		for (int i = 0; i < str.length(); i++) {
//
//			for (int j = 0; j < vovels.length(); j++) {
//
//				if (str.charAt(i) == vovels.charAt(j)) {
//					vcount++;
//					break;
//				} else {
//					continue;
//				}
//			}
//
//		}

	}

}
