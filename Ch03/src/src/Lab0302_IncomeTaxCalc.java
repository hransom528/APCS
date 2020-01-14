package src;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab0302_IncomeTaxCalc {

	public static void main(String[] args) {
		//Declares variables and objects
		Scanner scnr = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		double incomeTax;
		int fileStatus = 0, income = 0, remainingIncome;
		
		//Total money in a bracket, single and joint
		final int bracket1 = 9525;
		final int bracket2 = 29175;
		final int bracket3 = 43800; 
		final int bracket4 = 75000;
		final int bracket5 = 42500;
		final int bracket6 = 300000;
		
		final int jbracket1 = 19050;
		final int jbracket2 = 58350;
		final int jbracket3 = 87600;
		final int jbracket4 = 150000;
		final int jbracket5 = 85000;
		final int jbracket6 = 200000;
		
		
		//Gets input
		System.out.println("Choose your filing status.");
		System.out.print("Please enter \"1\" for Single, \"2\" for Joint: ");
		fileStatus = scnr.nextInt();
		System.out.print("Enter your yearly taxable income: ");
		income = scnr.nextInt();
		remainingIncome = income;
		scnr.close();

		//Calculates income tax
		if (fileStatus == 1) { //Single filer
			if (income <= 9525) {
				incomeTax = .1 * income;  
			}
			else if (income <= 38700) {
				incomeTax = .1 * bracket1;
				remainingIncome -= 9525;
				incomeTax += (.12 * remainingIncome);
			}
			else if (income <= 82500) {
				incomeTax = .1 * bracket1;
				incomeTax += (.12 * bracket2);
				remainingIncome -= (38700);
				incomeTax += (.22 * remainingIncome);
			}
			else if (income <= 157500) {
				incomeTax = .1 * bracket1;
				incomeTax += (.12 * bracket2);
				incomeTax += (.22 * bracket3);
				remainingIncome -= (82500);
				incomeTax += (.24 * remainingIncome);
			}
			else if (income <= 200000) {
				incomeTax = .1 * bracket1;
				incomeTax += (.12 * bracket2);
				incomeTax += (.22 * bracket3);
				incomeTax += (.24 * bracket4);
				remainingIncome -= (157500);
				incomeTax += (.32 * remainingIncome);
			}
			else if (income <= 500000) {
				incomeTax = .1 * bracket1;
				incomeTax += (.12 * bracket2);
				incomeTax += (.22 * bracket3);
				incomeTax += (.24 * bracket4);
				incomeTax += (.32 * bracket5);
				remainingIncome -= (200000);
				incomeTax += (.35 * remainingIncome);
			}
			else {	
				incomeTax = .1 * bracket1;
				incomeTax += (.12 * bracket2);
				incomeTax += (.22 * bracket3);
				incomeTax += (.24 * bracket4);
				incomeTax += (.32 * bracket5);
				incomeTax += (.35 * bracket6);
				remainingIncome -= (500000);
				incomeTax += (.37 * remainingIncome);
			}
			System.out.println("Income tax: " + df.format(incomeTax));
		}
		else if (fileStatus == 2) { //Joint filer
			if (income <= 19050) {
				incomeTax = .1 * income;
			}
			else if (income <= 77400) {
				incomeTax = .1 * jbracket1;
				remainingIncome -= 19050;
				incomeTax += (.12 * remainingIncome);
			}
			else if (income <= 165000) {
				incomeTax = .1 * jbracket1;
				incomeTax += (.12 * jbracket2);
				remainingIncome -= (77400);
				incomeTax += (.22 * remainingIncome);
			}
			else if (income <= 315000) {
				incomeTax = .1 * jbracket1;
				incomeTax += (.12 * jbracket2);
				incomeTax += (.22 * jbracket3);
				remainingIncome -= (165000);
				incomeTax += (.24 * remainingIncome);
			}
			else if (income <= 400000) {
				incomeTax = .1 * jbracket1;
				incomeTax += (.12 * jbracket2);
				incomeTax += (.22 * jbracket3);
				incomeTax += (.24 * bracket4);
				remainingIncome -= (315000);
				incomeTax += (.32 * remainingIncome);
			}
			else if (income <= 600000) {
				incomeTax = .1 * jbracket1;
				incomeTax += (.12 * jbracket2);
				incomeTax += (.22 * jbracket3);
				incomeTax += (.24 * jbracket4);
				incomeTax += (.32 * jbracket5);
				remainingIncome -= (400000);
				incomeTax += (.35 * remainingIncome);
			}
			else {	
				incomeTax = .1 * jbracket1;
				incomeTax += (.12 * jbracket2);
				incomeTax += (.22 * jbracket3);
				incomeTax += (.24 * jbracket4);
				incomeTax += (.32 * jbracket5);
				incomeTax += (.35 * jbracket6);
				remainingIncome -= (600000);
				incomeTax += (.37 * remainingIncome);
			}
			System.out.println("Income tax: " + df.format(incomeTax));
		}
		else {
			System.out.println("Error: Invalid filing status.");
		}
		
	}

}
