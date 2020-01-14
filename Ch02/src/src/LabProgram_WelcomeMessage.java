package src;
import java.util.Scanner;

public class LabProgram_WelcomeMessage {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		String userName;

		//Gets name of person
		userName = scnr.next();
		scnr.close();
		
		//Outputs personalized message
		System.out.println("Hello " + userName + ", and welcome to CS Online!");
	}

}
