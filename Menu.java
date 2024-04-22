package Project;
import java.util.ArrayList;



	public class Menu {
	    private ArrayList<Item> items;

	    // Constructor
	    public Menu(ArrayList<Item> b) {
	        this.items = b;
	    }

	    // Add new item to the menu
	    public void addItem(Item item) {
	        items.add(item);
	        System.out.println("item added"+item.getName());
	    }
	    public void displayMenu() {
	        for (Item item : items) {
	            System.out.println(item.getName() + " - $" + item.getPrice());
	        }}
//	 
	    public boolean containsItem(String itemName) {
	        for (Item item : items) {
	            if (item.getName().equalsIgnoreCase(itemName)) {
	                return true;
	            }}
	        return false;
	    }

	    public double getItemPrice(String itemName) {
	       
			for (Item item : items) {
	            if (item.getName().equalsIgnoreCase(itemName)) {
	                return item.getPrice();
	            }}
	        return 0.0; // Return 0 if item not found
	    }
	    

	}


