package src;
import java.util.Scanner;

public class LabProgram_PasswordModifier {

	public static void main(String[] args) {
		//Declares scnr and vars
		Scanner scnr = new Scanner(System.in);
		String passwordString = "";
		
		//Gets input
		passwordString = scnr.next();
		scnr.close();
		
		//Strengthens password
		passwordString = passwordString.replaceAll("i", "!");
		passwordString = passwordString.replaceAll("a", "@");
		passwordString = passwordString.replaceAll("m", "M");
		passwordString = passwordString.replaceAll("B", "8");
		passwordString = passwordString.replaceAll("o", ".");
		passwordString = passwordString += "q*s";
		System.out.println(passwordString);
	}

}
