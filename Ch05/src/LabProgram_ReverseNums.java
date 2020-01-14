import java.util.Scanner;

public class LabProgram_ReverseNums {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] userList;   // List of numElement integers specified by the user
		int numElements;  // Number of integers in user's list

		numElements = scnr.nextInt();   // Input begins with number of integers that follow
		userList = new int[numElements];

		//Gets input
		for (int i = 0; i < numElements; i++) {
			userList[i] = scnr.nextInt(); 
		}
		scnr.close();

		//Reverses array
		for (int i = 0; i < (userList.length / 2); i++) {
			int tempVal = userList[i];

			userList[i] = userList[userList.length - i - 1];
			userList[userList.length - i - 1] = tempVal;
		}

		//Outputs array
		for (int i = 0; i < userList.length; i++) {
			System.out.print(userList[i] + " ");
		}
		System.out.println();
	}
}