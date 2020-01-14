package src;
import java.util.Scanner;

public class LabProgram_LeapYear {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		int year;
		
		//Gets input
		year = scnr.nextInt();
		scnr.close();
		
		//Calculates if the year is a leap year
		if ((year % 100 == 0) && (year % 400 == 0) && (year % 4 == 0)) {
			System.out.println(year + " is a leap year.");
		}
		else if ((year % 100 != 0) && (year % 4 == 0)) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
