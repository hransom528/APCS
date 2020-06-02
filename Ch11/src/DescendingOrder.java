import java.util.Scanner;

public class DescendingOrder {
	//Descending selection sort
	public static void selectionSortDescendTrace(int [] numbers, int numElements) {
		int indexLargest, temp;
		for (int i = 0; i < numElements - 1; ++i) {
			// Find index of largest remaining element
			indexLargest = i;
			for (int j = i + 1; j < numElements; ++j) {
				if (numbers[j] > numbers[indexLargest]) {
					indexLargest = j;
				}
			}

			// Swaps sorted indexSmallest and i
			temp = numbers[i];
			numbers[i] = numbers[indexLargest];
			numbers[indexLargest] = temp;

			//Outputs array
			for (int j = 0; j < numElements; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}
	}

	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int input, i = 0;
		int numElements = 0;
		int [] numbers = new int[10];

		//Gets input
		for (int j = 0; j < 10; j++) {
			input = scnr.nextInt();
			if (input != -1) {
				numbers[i] = input;
				numElements++;
				i++;
			}
			else {
				j = 11; //Prevents loop from running again if input = -1
			}
		}
		scnr.close();

		//Applies a descending selection sort to the finalNums array
		selectionSortDescendTrace(numbers, numElements);
	}
}
