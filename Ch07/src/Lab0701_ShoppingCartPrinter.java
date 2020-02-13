import java.util.Scanner;

public class Lab0701_ShoppingCartPrinter {
	public static void main(String[] args) {
		//Initializes scanner object and variables
		Scanner scnr = new Scanner(System.in);
		int item1Total = 0;
		int item2Total = 0;
		int totalTotal = 0;
		
		//Initializes ItemsToPurchase object
		ItemToPurchaseOld item1 = new ItemToPurchaseOld();
		ItemToPurchaseOld item2 = new ItemToPurchaseOld(); //Used with older version of ItemToPurchase without parameterized constructor
		
		//Gets input for item 1
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		item1.setName(scnr.nextLine());
		System.out.println("Enter the item price:");
		item1.setPrice(scnr.nextInt());
		System.out.println("Enter the item quantity:");
		item1.setQuantity(scnr.nextInt());

		//Gets input for item 2
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		scnr.nextLine();
		item2.setName(scnr.nextLine());
		System.out.println("Enter the item price:");
		item2.setPrice(scnr.nextInt());
		System.out.println("Enter the item quantity:");
		item2.setQuantity(scnr.nextInt());
		scnr.close();
		
		//Calculates totals
		item1Total = item1.getQuantity() * item1.getPrice();
		item2Total = item2.getQuantity() * item2.getPrice();
		totalTotal = item1Total + item2Total;
		
		//Outputs total costs
		System.out.println("TOTAL COST");
		System.out.print("" + item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1Total + "\n");
		System.out.print("" + item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2Total + "\n");
		System.out.println("Total: $" + totalTotal);
	}
}