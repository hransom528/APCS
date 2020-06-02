import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
	/**Partitioning algorithm
	 * @param userIDs
	 * @param i - start index
	 * @param k - last index
	 * @return h - index of last element in low partition
	 */
	public static int partition(ArrayList<String> userIDs, int i, int k) {
		//Gets pivot as middle value
		int midpoint = i + (k - i) / 2;
		String pivot = userIDs.get(midpoint);

		//Initializes l and h
		int l = i;
		int h = k;

		//Loops through to correctly partition list
		boolean done = false;
		while (!done) {
			//Increment l while l is alphabetically < pivot
			while (userIDs.get(l).compareTo(pivot) < 0) {
				++l;
			}

			//Decrement h while pivot is alphabetically < h
			while (pivot.compareTo(userIDs.get(h)) < 0) {
				--h;
			}
			
			/* If there are zero or one items remaining,
	    	all numbers are partitioned. Return h */
			if (l >= h) {
				done = true;
			}
			else {
				//Swap l and h, update l and h
				String temp = userIDs.get(l);
				userIDs.set(l, userIDs.get(h));
				userIDs.set(h, temp);
				++l;
				--h;
			}
		}
		return h;
	}

	//Quick sort algorithm that recursively sorts the low and high partitions
	public static void quicksort(ArrayList<String> userIDs, int i, int k) {
		//Base case: partition is 1 or 0 elements
		if (i >= k) {
			return;
		}
		
		//Partition list
		int j = partition(userIDs, i, k);
		
		//Recursively sort low and high partitions
		quicksort(userIDs, i, j);
		quicksort(userIDs, j + 1, k);
	}

	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> userIDList = new ArrayList<String>();
		String userID;

		//Gets input
		userID = scnr.next();
		while (!userID.equals("-1")) {
			userIDList.add(userID);
			userID = scnr.next();
		}
		scnr.close();

		//Initial call to quick sort algorithm 
		quicksort(userIDList, 0, userIDList.size() - 1);

		//Outputs final list
		for (int i = 0; i < userIDList.size(); ++i) {
			System.out.println(userIDList.get(i));
		}
	}
}
