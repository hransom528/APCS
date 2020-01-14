import java.util.Scanner;

public class LabProgram_EvenOddArrayValues {
	//Determines if array has all even numbers
	public static boolean isArrayEven(int[] arrayValues, int arraySize) {
		boolean isEven = true;
		
		for (int i = 0; i < arraySize; i++) {
			if (arrayValues[i] % 2 != 0) {
				isEven = false;
			}
		}
		
		return isEven;
	}
	
	//Determines if array has all odd numbers
	public static boolean isArrayOdd(int[] arrayValues, int arraySize) {
		boolean isOdd = true;
		
		for (int i = 0; i < arraySize; i++) {
			if (arrayValues[i] % 2 == 0) {
				isOdd = false;
			}
		}
		
		return isOdd;
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		int[] nums = new int[size];
		boolean isEven, isOdd;
		
		//Gets input
		for (int i = 0; i < size; i++) {
			nums[i] = scnr.nextInt(); 
		}
		scnr.close();

		//Determines if array is even, odd, or neither
		isEven = isArrayEven(nums, size);
		isOdd = isArrayOdd(nums, size);
		if (isEven) {
			System.out.println("all even");
		}
		else if (isOdd) {
			System.out.println("all odd");
		}
		else {
			System.out.println("not even or odd");
		}
	}

}