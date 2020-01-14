import java.util.Scanner;

public class LabProgram_MaxMinNums {

	//Gets largest number of 3 integers
	public static int largestNumber(int item1, int item2, int item3) {
		int max;
		
		if ((item1 > item2) && (item1 > item3)) {
			max = item1;
		}
		else if ((item2 > item1) && (item2 > item3)) {
			max = item2;
		}
		else {
			max = item3;
		}
		
		return max;
	}
	
	//Gets smallest number of 3 integers
	public static int smallestNumber(int item1, int item2, int item3) {
		int min;

		if ((item1 < item2) && (item1 < item3)) {
			min = item1;
		}
		else if ((item2 < item1) && (item2 < item3)) {
			min = item2;
		}
		else {
			min = item3;
		}
		
		return min;
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3;
		
		//Gets input
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		scnr.close();
		
		//Outputs largest and smallest nums
		System.out.println("largest: " + largestNumber(num1, num2, num3));
		System.out.println("smallest: " + smallestNumber(num1, num2, num3));
	}

}
