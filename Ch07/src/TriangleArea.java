import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		//Declares classes and variables
		Scanner scnr = new Scanner(System.in);
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();
		double triangle1Base, triangle1Height;
		double triangle2Base, triangle2Height;
		double triangle1Area = -1;
		double triangle2Area = -1;

		//Gets triangle1 input
		triangle1Base = scnr.nextDouble();
		triangle1.setBase(triangle1Base);
		triangle1Height = scnr.nextDouble();
		triangle1.setHeight(triangle1Height);

		//Gets triangle2 input
		triangle2Base = scnr.nextDouble();
		triangle2.setBase(triangle2Base);
		triangle2Height = scnr.nextDouble();
		triangle2.setHeight(triangle2Height);
		scnr.close();
		
		//Calculates larger area
		triangle1Area = triangle1.getArea();
		triangle2Area = triangle2.getArea();
		System.out.println("Triangle with larger area:");
		if (triangle1Area > triangle2Area) {
			triangle1.printInfo();
		}
		else {
			triangle2.printInfo();
		}
	}
}
