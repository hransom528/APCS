package src;
import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {

	public static void main(String[] args) {
		//Declares vars and scnr
		Scanner scnr = new Scanner(System.in);
		double wallHeight;
		double wallWidth;
		double wallArea;

		//Gets wall height
		System.out.println("Enter wall height (feet):");
		wallHeight = scnr.nextDouble();

		//Gets wall width
		System.out.println("Enter wall width (feet):");
		wallWidth = scnr.nextDouble();                      
		scnr.close();
		
		// Calculate and output wall area
		wallArea = wallWidth * wallHeight;                  
		System.out.println("Wall area: " + wallArea + " square feet");     

		//Calculate and output the amount of paint in gallons needed to paint the wallArea
		double paintNeeded;
		final int AREA_PER_GAL = 350;
		paintNeeded = (wallArea / AREA_PER_GAL);
		System.out.println("Paint needed: " + paintNeeded + " gallons");
		
		//Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
		int cans = (int) Math.ceil(paintNeeded);
		System.out.println("Cans needed: " + cans + " can(s)");
	}

}
