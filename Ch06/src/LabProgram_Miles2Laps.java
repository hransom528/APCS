import java.util.Scanner;

public class LabProgram_Miles2Laps {

	//Converts miles to track laps
	public static double milesToLaps(double userMiles) {
		return (userMiles * 4.0);
	}
	
	//MAIN
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.printf("%.2f", milesToLaps(new Scanner(System.in).nextDouble())); 

	}
	
}