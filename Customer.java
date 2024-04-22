package Project;

import java.util.*;

public class Customer {
	Menu menu;
	ArrayList<Item>items=new ArrayList<>();
	ArrayList<Item>orderedItems=new ArrayList<>();
	 double totalBill;
	
	
	 public Customer(Menu menu,ArrayList<Item> items) {
	        this.menu=menu;
	        this.items=items;
	    }
	 public void displayMenu() {
	       menu.displayMenu();
	    }

	 public void placeOrder() {
	        Scanner scanner = new Scanner(System.in);
            int b;
	        // Display menu
	        displayMenu();
	        System.out.println("\nDo you want to order  (Y/N)");
            Scanner sc=new Scanner(System.in);
    	    b=sc.next().charAt(0);
    	    if(b=='Y') {

	        // Create order
	        String itemName;
	        char choose;
	        do {
	            System.out.println("\nEnter the name of the item you want to order");
	            itemName = scanner.nextLine();
	         
	    	    if (menu.containsItem(itemName)) {
	                double itemPrice = menu.getItemPrice(itemName);
	                totalBill += itemPrice;
	                orderedItems.add(new Item(itemName, itemPrice));
	                System.out.println(itemName + " added to order.");
	           }else {
	    System.out.println("Item not found in the menu. Please enter a valid item name.");
	            }
	    	    System.out.println("\nDo you want to order more (Y/N)");
	           
	    	    choose=sc.next().charAt(0);
	        }
	        while(choose=='Y');
	         
	       
	    }
	             else {
	    	  System.exit(0);
	      }}
	 public void preference(ArrayList<Item> alist,Dinein f ,Delivery d) {
		 int cus;
		 System.out.println("\n\nSelect Your preference:");
    	 System.out.println("1. DINE-In ");
         System.out.println("2. DELIVERY ");
         Scanner sc = new Scanner(System.in);
         cus=sc.nextInt();
         
         if (cus==1) {
        	 
        	 f.display();
        	 f.confirmOrder();
        	 double taxRate = 0.10; // 10% tax rate
		        double taxAmount = totalBill * taxRate;
		        totalBill += taxAmount;
        	 f.charges();
         }
         else { 
        	 d.display();
        	 d.confirmOrder();
        	 totalBill += 5;
        	 d.charges();
         }
	 }
	         public void displayBill(Customer c) {
		 System.out.println("\n\nYour Order:");
	        for (Item orderedItem : orderedItems) {
	            System.out.println(orderedItem.getName()+ " - $" +orderedItem.getPrice());
	        }
	        System.out.println("Total Bill: $" + c.totalBill);
	        System.out.print("\n\nThank you For ordering!!!!!");
	        System.out.println(Character.toString(0x1F60E));
	        System.out.println("\n\n");
	        
	        }}
	 


