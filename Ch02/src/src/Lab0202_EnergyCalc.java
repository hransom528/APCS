package src;
import java.util.Scanner;

public class Lab0202_EnergyCalc {

	public static void main(String[] args) {
		//Gets input of mass in kg
		Scanner scnr = new Scanner(System.in);
		double mass = scnr.nextDouble();
		scnr.close();
		
		//Calculates and displays result 
		final double c = (3 * Math.pow(10, 8));
		double energy = (mass * Math.pow(c, 2));
		System.out.println(energy + " Joules");
	}

}
