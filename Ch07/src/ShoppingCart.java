import java.util.ArrayList;

public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

	//Default constructor
	public ShoppingCart() {
		customerName = "none";
		currentDate = "January 1, 2016";
	}

	//Parameterized constructor
	public ShoppingCart(String newCustomerName, String newCurrentDate) {
		customerName = newCustomerName;
		currentDate = newCurrentDate;
	}

	//Gets customer name
	public String getCustomerName() {
		return customerName;
	}

	//Gets current date
	public String getDate() {
		return currentDate;
	}

	//Adds new ItemToPurchase to cart
	public void addItem(ItemToPurchase item) {
		cartItems.add(item);
	}

	//Returns a specific item from the cart based off of a name
	public ItemToPurchase getItemFromName(String searchString) {
		ItemToPurchase tempItem = null;
		for (int i = 0; i < cartItems.size(); i++) {
			if (cartItems.get(i).getName().equalsIgnoreCase(searchString)) {
				tempItem = cartItems.get(i);
			}
		}
		return tempItem;
	}

	//Removes item from cart list, outputs error if no item is found to remove
	public void removeItem(String itemName) {
		boolean found = false;

		for (int i = 0; i < cartItems.size(); i++) {
			if (cartItems.get(i).getName().equalsIgnoreCase(itemName)) {
				cartItems.remove(i);
			}
		}

		if (!found) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}

	//Modifies a specified item
	public void modifyItem(ItemToPurchase item) { 
		boolean found = false;

		//Finds and modifies item
		for (int j = 0; j < cartItems.size(); j++) {
			if (cartItems.get(j).getName().equalsIgnoreCase(item.getName())) {
				found = true;
				//Detects if item doesn't have default values
				if (!((cartItems.get(j).getDescription().equalsIgnoreCase("none")) && (cartItems.get(j).getName().equalsIgnoreCase("none")) && (cartItems.get(j).getPrice() == 0) && (cartItems.get(j).getQuantity() == 0))) {
					cartItems.remove(j);
					cartItems.add(j, item);
				}
			}
		}

		//If item is not found by name
		if (!found) {
			System.out.println("Item not found in cart. Nothing modified.");
		}

	}

	//Gets the ammount of items in the cart
	public int getNumItemsInCart() {
		return cartItems.size();
	}

	//Gets the subtotal of the cart
	public double getCostOfCart() {
		double subTotal = 0;
		for (int i = 0; i < cartItems.size(); i++) {
			subTotal += (cartItems.get(i).getPrice()) * (cartItems.get(i).getQuantity());
		}
		return subTotal;
	}

	//Prints the total of the cart
	public void printTotal() {
		System.out.println(this.getCustomerName() + "'s Shopping Cart - " + this.getDate() + "\n");
		System.out.println("Number of items: " + cartItems.size() + "\n");

		if (cartItems.isEmpty()) {
			System.out.println("SHOPPING CART IS EMPTY");
		}
		else {
			for (int i = 0; i < cartItems.size(); i++) {
				cartItems.get(i).printItemCost();
			}
		}

		System.out.println("\nTotal: $" + this.getCostOfCart());
	}

	//Prints the descriptions of items in cart
	public void printDescriptions() {
		System.out.println(this.getCustomerName() + "'s Shopping Cart - " + this.getDate() + "\n");
		System.out.println("Item descriptions");
		for (int i = 0; i < cartItems.size(); i++) {
			System.out.println("" + cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
		}
	}
}