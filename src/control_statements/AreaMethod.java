package control_statements;

import java.util.Scanner;

public class AreaMethod {
	float area;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaMethod ob = new AreaMethod();

//		method to find area of circle, triangle, square, rectangle
		System.out.println("1.Circle  2.Square  3.Triangle  4.Rectangle");
		System.out.println("Select an option: ");
		int ch = sc.nextInt();
		float a, b;
		switch (ch) {
		case 1:
			System.out.println("Enter Radius : ");
			a = sc.nextFloat();
			System.out.println("Area : " + ob.circle(a));
			break;

		case 2:
			System.out.println("Enter length : ");
			a = sc.nextFloat();
			System.out.println("Area : " + ob.square(a));
			break;

		case 3:
			System.out.println("Enter Lenght & Height : ");
			a = sc.nextFloat();
			b = sc.nextFloat();
			System.out.println("Area : " + ob.triangle(a, b));
			break;

		case 4:
			System.out.println("Enter Length & Breadth : ");
			a = sc.nextFloat();
			b = sc.nextFloat();
			System.out.println("Area : " + ob.rectangle(a, b));
			break;
		default:
			System.out.println("Invalid Choice");
		}

	}

	public float circle(float a) {
		area = (3.15f * a * a);
		return area;
	}

	public float square(float a) {
		area = a * a;
		return area;
	}

	public float triangle(float a, float b) {
		area = (1 / 2f * a * b);
		return area;
	}

	public float rectangle(float a, float b) {
		area = (a * b);
		return area;
	}

}
