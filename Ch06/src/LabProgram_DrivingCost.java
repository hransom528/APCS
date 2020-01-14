import java.util.Scanner;

public class LabProgram_DrivingCost {
	//Gets cost of driving a certain amount of miles 
	public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
		return (drivenMiles / milesPerGallon) * dollarsPerGallon;
	}
	
	//MAIN
	public static void main(String[] args) {
		//Gets user input
		Scanner scnr = new Scanner(System.in);
		double mpg = scnr.nextDouble();
		double dpg = scnr.nextDouble();
		scnr.close();
		
		//Outputs driving cost
		System.out.printf("%.2f", drivingCost(10, mpg, dpg));
		System.out.print(" ");
		System.out.printf("%.2f", drivingCost(50, mpg, dpg));
		System.out.print(" ");
		System.out.printf("%.2f", drivingCost(400, mpg, dpg));
		System.out.println();
	}
}