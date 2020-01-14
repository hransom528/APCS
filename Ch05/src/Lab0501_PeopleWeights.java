import java.util.Scanner;

public class Lab0501_PeopleWeights {

	public static void main(String[] args) {
		//Declares scnr and weights array
		Scanner scnr = new Scanner(System.in);
		double[] weights = new double[5];
		double avg = 0, totalWeight = 0, maxWeight = 0;
		
		//Gets input
		for (int i = 0; i < weights.length; i++) {
			int tempVal = (i + 1);
			System.out.println("Enter weight " + tempVal + ":");
			weights[i]= scnr.nextDouble(); 
		}
		scnr.close();
		
		//Outputs weights on one line
		System.out.print("\nYou entered: ");
		for (int i = 0; i < weights.length; i++) {
			System.out.print("" + weights[i] + " " );
		}
		
		//Calculates total weight  and max weight
		for (int i = 0; i < weights.length; i++) {
			totalWeight += weights[i];
		}
		
		//Calculates average
		for (int i = 0; i < weights.length; i++) {
			avg += weights[i]; 
		}
		avg /= 5;
		
		//Calculates max weight
		maxWeight = weights[0];
		for (int i = 0; i < weights.length; i++) {
			if (weights[i] > maxWeight) {
				maxWeight = weights[i];
			}
		}
		
		//Outputs calculations
		System.out.println("\nTotal weight: " + totalWeight);
		System.out.println("Average weight: " + avg);
		System.out.println("Max weight: " + maxWeight);
		
	}

}
