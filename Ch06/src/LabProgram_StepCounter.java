import java.util.Scanner;

public class LabProgram_StepCounter {

	//Converts steps to miles
	public static double stepsToMiles(int userSteps) {
		return (userSteps / 2000.0);
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.printf("%.2f", stepsToMiles(scnr.nextInt())); scnr.close();
	}
	
}