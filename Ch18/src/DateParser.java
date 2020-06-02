import java.util.ArrayList;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class DateParser {
	public static int getMonthAsInt(String monthString) {
		int monthInt;

		// Java switch/case statement                                                                
		switch (monthString) {
		case "January": 
			monthInt = 01; 
			break;
		case "February": 
			monthInt = 02; 
			break;
		case "March": 
			monthInt = 03; 
			break;
		case "April": 
			monthInt = 04; 
			break;
		case "May": 
			monthInt = 05; 
			break;
		case "June": 
			monthInt = 06; 
			break;
		case "July": 
			monthInt = 07; 
			break;
		case "August": 
			monthInt = 8; 
			break;
		case "September": 
			monthInt = 9; 
			break;
		case "October": 
			monthInt = 10; 
			break;
		case "November": 
			monthInt = 11; 
			break;
		case "December": 
			monthInt = 12; 
			break;
		default: 
			monthInt = 00;
		}

		return monthInt;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> dates = new ArrayList<String>();
		String tempString = "";
		int tempMonthInt;
		int tempDayInt;
		int tempYearInt;
		
		// TODO: Read dates from input, parse the dates to find the one
		//       in the correct format, and output in mm/dd/yyyy format
		
		//Gets input
		while (!tempString.contains("-1")) {
			tempString = scnr.nextLine();
			dates.add(tempString);
		}
		scnr.close();
		
		//Parses strings
		for (String item: dates) {
			
		}
		
		//Outputs correctly formatted strings
		for (String item : dates) {
			System.out.println(item);
		}
	}
}