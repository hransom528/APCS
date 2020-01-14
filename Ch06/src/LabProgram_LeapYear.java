import java.util.Scanner;

public class LabProgram_LeapYear {
	//Determines if given year is a leap year
	public static boolean isLeapYear(int userYear) {
		boolean leapYear = false;
		if (userYear % 100 == 0) {
			if (userYear % 400 == 0) {
				leapYear = true;
				
			}
		}
		else if (userYear % 4 == 0) {
			leapYear = true;
		}
		return leapYear;
	}
	
	//Main
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int year = scnr.nextInt(); scnr.close();
		if (isLeapYear(year)) {
			System.out.println("" + year + " is a leap year.");
		}
		else {
			System.out.println("" + year + " is not a leap year.");
		}
	}
}