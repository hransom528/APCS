package src;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GasMileageCalc {

	public static void main(String[] args) {
		//Sets up scanner and gets name
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scnr.next();

		//Gets price per gallon
		System.out.println("Enter price per gallon: ");
		double pricePerGal = scnr.nextDouble();

		//Gets price for total fill up
		System.out.println("Enter total price for fill up: ");
		double fillUp = scnr.nextDouble();

		//Gets initial odometer reading
		System.out.println("Enter initial odometer reading: ");
		int initOdomReading = scnr.nextInt();

		//Gets final odometer reading
		System.out.println("Enter final odometer reading: ");
		int finalOdomReading = scnr.nextInt();
		scnr.close();
		
		//Does calculations and displays formatted result
		int totalMilesDriven = finalOdomReading - initOdomReading; // Gets total miles driven
		double gallonsUsed = fillUp / pricePerGal; 				   // Gets gallons used
		double mpg = totalMilesDriven / gallonsUsed;			   // Gets miles per gallon
		
		DecimalFormat df = new DecimalFormat("##.#");			   // Sets up decimal formatter
		System.out.println(name + ", you drove " + totalMilesDriven + " miles using \n" + df.format(gallonsUsed) + " gallons with a mpg of " + df.format(mpg));
	}

}
