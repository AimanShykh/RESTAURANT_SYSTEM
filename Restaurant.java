package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {

	int user;
	ArrayList<Item>alist=new ArrayList<>();
	Menu m=new Menu(alist);
	Item a = new Item("Fries",12.99);
	Customer c1=new Customer(m, alist);
	Dinein f=new Dinein(alist);
	Dinein g=new Dinein(alist);
	Delivery d=new Delivery(alist);
	
        alist.add(new Item( "beef burger", 9.99));
        alist.add(new Item( "Margherita pizza", 12.99));
        alist.add(new Item("Caesar salad", 7.99));
        Scanner sc=new Scanner(System.in);
        
	
        
    	
         System.out.println("Welcome, Customer1!");
         System.out.println("Here is the menu:");
       
         c1.placeOrder();
         c1.preference(alist, f,d);
        
      
        	
             
        	 c1.displayBill(c1);
        	 System.out.println("Welcome, Customer2!");
        	 Customer c2=new Customer(m, alist);
             System.out.println("Here is the menu:");
        	 c2.placeOrder();
             c2.preference(alist, g,d);
        	 c2.displayBill(c2);

             
}}	
         
      
        
 



