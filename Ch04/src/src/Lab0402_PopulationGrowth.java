package src;
import java.util.Scanner;

public class Lab0402_PopulationGrowth {

	public static void main(String[] args) {
		//Declares vars and scnr 
		Scanner scnr = new Scanner(System.in);
		double numOrganisms, rateOfGrowth, numHoursRate, numHoursGrow;

		//Gets input
		System.out.println("Please enter positive numbers only:");
		System.out.println("Number of organisms: ");
		numOrganisms = scnr.nextDouble();
		System.out.println("Rate of growth: ");
		rateOfGrowth = scnr.nextDouble();
		System.out.println("Number of Hours to achieve the rate: ");
		numHoursRate = scnr.nextDouble();
		System.out.println("Number of hours organism allowed to grow: ");
		numHoursGrow = scnr.nextDouble();

		//Tests if input is negative
		while ((numOrganisms <= 0) || (rateOfGrowth <= 0) || (numHoursRate <= 0) || (numHoursGrow <= 0)) {
			System.out.println("\nPlease enter positive numbers only:");
			if (numOrganisms <= 0) {
				System.out.println("Number of organisms: ");
				numOrganisms = scnr.nextDouble();
			}
			if (rateOfGrowth <= 0) {
				System.out.println("Rate of growth: ");
				rateOfGrowth = scnr.nextDouble();
			}
			if (numHoursRate <= 0) {
				System.out.println("Number of Hours to achieve the rate: ");
				numHoursRate = scnr.nextDouble();
			}
			if (numHoursGrow <= 0) {
				System.out.println("Number of hours organism allowed to grow: ");
				numHoursGrow = scnr.nextDouble();
			}
		}
		scnr.close();

		//Calculates population and outputs result 
		for (int i = (int) numHoursRate; i <= numHoursGrow; i += numHoursRate) {
			numOrganisms *= rateOfGrowth;
		}
		int dispNumOrganisms = (int) numOrganisms; //Removes decimal point for displaying results 
		int dispNumHoursGrow = (int) numHoursGrow;
		System.out.println("\nAfter " + dispNumHoursGrow + " hour(s), there will be " + dispNumOrganisms + " organisms.");

	}

}
