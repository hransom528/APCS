import java.util.Scanner;

public class LabProgram_RemoveSpaces {
	
	//Removes all spaces from a string
	public static String removeSpaces(String userString) {
		return (userString.replaceAll(" ", ""));
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println(removeSpaces(scnr.nextLine()));
		scnr.close();

	}

}