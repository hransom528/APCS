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

	//Gets size of cart in terms of unique items
	public int getSize() {
		return cartItems.size();
	}
	
	//Adds new ItemToPurchase to cart
	public void addItem(ItemToPurchase item) {
		cartItems.add(item);
	}

	//Removes item from cart list, outputs error if no item is found to remove
	public void removeItem(String itemName) {
		boolean found = false;

		//Determines if an item by that name exists
		for (int i = 0; i < cartItems.size(); i++) {
			if (cartItems.get(i).getName().equalsIgnoreCase(itemName)) {
				found = true;
			}
		}

		//If found, remove the item
		if (!found) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
		else {
			for (int i = 0; i < cartItems.size(); i++) {
				if (cartItems.get(i).getName().equalsIgnoreCase(itemName)) {
					cartItems.remove(i);
				}
			}
		}
	}

	//Modifies a specified item
	public void modifyItem(ItemToPurchase item) { 
		boolean found = false;

		//Finds and modifies item
		for (int j = 0; j < cartItems.size(); j++) {
			if (cartItems.get(j).getName().equalsIgnoreCase(item.getName())) {
				found = true;
			}
		}

		//If item is not found by name
		if (!found) {
			System.out.println("Item not found in cart. Nothing modified.");
		}
		else {
			for (int j = 0; j < cartItems.size(); j++) {
				//Detects if item doesn't have default values
				if (!((cartItems.get(j).getDescription().equalsIgnoreCase("none")) && (cartItems.get(j).getName().equalsIgnoreCase("none")) && (cartItems.get(j).getPrice() == 0) && (cartItems.get(j).getQuantity() == 0))) {
					cartItems.set(j, item);
				}
			}
		}	
	}

	//Gets the ammount of items in the cart
	@SuppressWarnings("unused")
	public int getNumItemsInCart() {
		int size = 0;
		for (ItemToPurchase item : cartItems) {
			size += item.getQuantity();
		}
		return size;
	}

	//Gets the subtotal of the cart
	public int getCostOfCart() {
		int subTotal = 0;
		for (int i = 0; i < cartItems.size(); i++) {
			subTotal += ((cartItems.get(i).getPrice()) * (cartItems.get(i).getQuantity()));
		}
		return subTotal;
	}

	//Prints the total of the cart
	public void printTotal() {
		System.out.println(this.getCustomerName() + "'s Shopping Cart - " + this.getDate() + "\n");
		System.out.println("Number of items: " + this.getNumItemsInCart() + "\n");

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
			cartItems.get(i).printItemDescription();
		}
	}
	
	//Gets an ItemToPurchase from a cart index
	public ItemToPurchase getItemIncart(int index) {
		return cartItems.get(index);
	}
	
	/*
	//Returns a specific item from the cart based off of a name
	public ItemToPurchase getItemFromName(String searchString) {
		ItemToPurchase tempItem = null;
		for (int i = 0; i < cartItems.size(); i++) {
			if (cartItems.get(i).getName().equalsIgnoreCase(searchString)) {
				tempItem = cartItems.get(i);
			}
		}
		return tempItem;
		*/
}