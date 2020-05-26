import java.util.ArrayList;
import java.util.Scanner;

public class PhotoLineups {

	//Creates and outputs all permutations of the list of names.
	@SuppressWarnings("unchecked")
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		ArrayList<String> names = (ArrayList<String>) nameList.clone();
		String tempString;
		
		if (names.isEmpty()) { //Base case: no more left in branch, output permute
			for (String item : permList) {
				System.out.print(item + " ");
			}
			System.out.print("\n");
		}
		else {
			for (int i = 0; i < names.size(); i++) {
				//Moves item from names to permList
				tempString = names.remove(i); 
				permList.add(tempString);
				
				//Recursively get next in list
				allPermutations(permList, names);
				
				//Put item back into list, move on to next branch
				names.add(i, tempString);
				permList.remove(tempString);
			}
		}
	}

	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();

		//Reads in names until number (-1) is detected
		while (!scnr.hasNextInt()) {
			nameList.add(scnr.next());
		}
		scnr.close();
		
		//Recursively gets all permutations of the list of names
		allPermutations(permList, nameList);
	}
}
