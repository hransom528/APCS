import java.util.Scanner;

public class Lab0703_ShoppingCartManager {
	static private String cartName = "";
	static private String date = "";

	//Outputs menu for user to choose from
	public static char printMenu(ShoppingCart cartObj, Scanner scanObj) {
		char userChar; 
		System.out.println("\nMENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println("\nChoose an option:");
		userChar = scanObj.next().charAt(0);
		return userChar;
	}

	//Outputs the current shopping cart
	public static void outputCart(ShoppingCart cartObj) {
		System.out.println("OUTPUT SHOPPING CART");
		cartObj.printTotal();
	}

	//Outputs the item's descriptions in the cart
	public static void outputDescriptions(ShoppingCart cartObj) {
		System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
		cartObj.printDescriptions();
	}
	
	//Adds a new item to the cart
	public static void addItemToCart(ShoppingCart cartObj, Scanner scanObj) {
		ItemToPurchase itemObj = new ItemToPurchase();
		
		//Gets item parameters
		System.out.println("ADD ITEM TO CART");
		System.out.println("Enter the item name:");
		scanObj.nextLine();
		itemObj.setName(scanObj.nextLine());
		System.out.println("Enter the item description:");
		itemObj.setDescription(scanObj.nextLine());
		System.out.println("Enter the item price:");
		itemObj.setPrice(scanObj.nextInt());
		System.out.println("Enter the item quantity:");
		itemObj.setQuantity(scanObj.nextInt());
		
		cartObj.addItem(itemObj);
	}
	
	//Removes an item from the cart
	public static void removeItemFromCart(ShoppingCart cartObj, Scanner scanObj) {
		String name;
		
		//Gets name of item to remove
		System.out.println("REMOVE ITEM FROM CART");
		System.out.println("Enter name of item to remove:");
		name = scanObj.nextLine();
		
		cartObj.removeItem(name);
	}
	
	//Changes the item quantity 
	public static void changeItemQuantity(ShoppingCart cartObj, Scanner scanObj) {
		ItemToPurchase itemObj = new ItemToPurchase();
		String name;
		int quantity = 0;
		
		//Gets input for ItemToPurchase
		System.out.println("CHANGE ITEM QUANTITY");
		System.out.println("Enter the item name:");
		scanObj.nextLine();
		name = scanObj.nextLine();
		System.out.println("Enter the new quantity:");
		quantity = scanObj.nextInt();
		
		//Assigns itemObj 
		for (int i = 0; i < cartObj.getNumItemsInCart(); i++) {
			
		}
		itemObj = cartObj.getItemFromName(name);
		itemObj.setQuantity(quantity);
		cartObj.modifyItem(itemObj);
				
		 //TODO: Finish Lab0703
	}
	
	//MAIN
	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		char userChoice; 

		//Gets input for ShoppingCart class
		System.out.print("Enter Customer's Name: ");
		cartName = scnr.nextLine();
		System.out.print("Enter Today's Date: ");
		date = scnr.nextLine();
		System.out.println("Customer Name: " + cartName);
		System.out.println("Today's Date: " + date);

		//Initializes new cart class
		ShoppingCart cart = new ShoppingCart(cartName, date);

		//Prints menu initially
		userChoice = printMenu(cart, scnr);
		
		//Loops until program is quit
		while (userChoice != 'q') {
			//Gets new option
			System.out.println("Choose an option: ");
			userChoice = scnr.next().charAt(0);
			
			//Detects which option the user selected
			switch (userChoice) {
			case 'a': //Adds item
				addItemToCart(cart, scnr); 
				break;
			case 'd': //Removes item
				removeItemFromCart(cart, scnr);
				break;
			case 'c': //Changes item quantity
				changeItemQuantity(cart, scnr);
				break;
			case 'i': //Outputs descriptions
				outputDescriptions(cart);
				break;
			case 'o': //Outputs the cart
				outputCart(cart);
				break;
			case 'q': //Quits 
				scnr.close();
				cart = null;
				System.exit(0);
				break;
			default:
				System.out.println("\nChoose an option: ");
			
			
			}
		}
	}

}