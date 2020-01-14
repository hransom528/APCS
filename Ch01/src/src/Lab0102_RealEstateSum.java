package src;
import java.util.Scanner;

public class Lab0102_RealEstateSum {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int currentPrice; 
		int lastMonthsPrice; 
		currentPrice = scnr.nextInt(); 
		lastMonthsPrice = scnr.nextInt();
		scnr.close();
		int change = currentPrice - lastMonthsPrice;
		double monthlyMortgage = (currentPrice * 0.045) / 12;
		
		System.out.println("This house is $" + currentPrice + ". The change is $" + change + " since last month.");
		System.out.println("The estimated monthly mortgage is $" + monthlyMortgage + ".");
	}

}
