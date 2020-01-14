package src;
import java.util.Scanner;

public class Lab0302_ClassifyTriangles {
		
	public static void main(String[] args) {
		//Initializes scanner and side vars
		Scanner scnr = new Scanner(System.in);
		int side1 = -1,side2 = -1,side3 = -1;
		
		//Gets input
		System.out.println("Please enter 3 sides of a triangle: ");
		System.out.println("First side: "); 
		side1 = scnr.nextInt();
		System.out.println("Second side: ");
		side2 = scnr.nextInt();
		System.out.println("Third side: ");
		side3 = scnr.nextInt();
		scnr.close();
		
		//Gets hypotenuse
		int a=-1, b=-1, c=-1;
		if ((side1 > side2) && (side1 > side3)) {
			c = side1;
			a = side2;
			b = side3;
		}
		else if ((side2 > side1) && (side2 > side3)) {
			c = side2;
			a = side1;
			b = side3;
		}
		else if ((side3 > side1) && (side3 > side2)) {
			c = side3;
			a = side1;
			b = side2;
		}
		else if ((side1 == side2) && (side2 == side3)) {
			c = side1;
			a = side2;
			b = side3;
		}
		else {
			System.out.println("Error in obtaining a,b, and c sides.");
		}
		
		//Does pythagorean theorem
		double c2 = Math.pow(c, 2);
		double ab = Math.pow(a, 2) + Math.pow(b,  2);
		
		//Tests triangle
		if ((a + b) <= c) {
			System.out.println("Side lengths do not form a triangle.");
		}
		else if (c2 == ab) {
			System.out.println("The triangle is a right triangle.");		
		}
		else if (ab < c2) {
			System.out.println("The triangle is an obtuse triangle.");
		}
		else {
			System.out.println("The triangle is an acute triangle.");
		}
		
	}

}
