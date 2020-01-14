package src;
import java.util.Scanner;

public class Lab0402_DrawRightTriangle {

	public static void main(String[] args) {
		//Declares vars and scnr
		Scanner scnr = new Scanner(System.in);
		char triangleChar;
		int triangleHeight;
		String lineString = "";

		//Gets input
		System.out.println("Enter a character:");
		triangleChar = scnr.next().charAt(0);  
		System.out.println("Enter triangle height:");
		triangleHeight = scnr.nextInt();
		System.out.print("\n");
		scnr.close();
		
		//Draws triangle
		for (int i = 0; i < triangleHeight; i++) {
			lineString += triangleChar; 
			lineString += " ";
			System.out.println(lineString);
		}
	}

}
