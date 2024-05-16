package oopconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {

		
//		Run Time Exception
		try {
			int a = 30, b = 0;
			double c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(" Arithmetic Exception");

		try {
			String s = null;
			System.out.println(s.length());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Null Pointer Exception");

		
//		File Not Found Exception
//		Using trycatch block
//		try {
//			FileInputStream ob = new FileInputStream("E://Book1.xlsx");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		Using Throws
		FileInputStream ob = new FileInputStream("E://Book1.xlsx");
		System.out.println("File Not Found Exception");
	}

}
