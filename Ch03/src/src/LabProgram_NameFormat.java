package src;
import java.util.Scanner;

public class LabProgram_NameFormat {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		String name;
		String firstName;
		String lastName;
		String middleName;
		char middleInitial;
		
		//Gets name
		name = scnr.nextLine();
		String[] splitName = name.split(" ");
		scnr.close();
		firstName = splitName[0];
		middleName = splitName[1];
		middleInitial = middleName.charAt(0);
		
		//Formats and outputs name
		if (splitName.length == 3) {
			lastName = splitName[2];
			System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
		}
		else if (splitName.length == 2) {
			System.out.println("" + middleName + ", " + firstName);
		}
		else {
			System.out.println("Error! Invalid name.");
		}
		
	}

}
