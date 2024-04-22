package Project;

import java.util.ArrayList;
import java.util.Scanner;


	 public class Delivery extends Order{
		 

			public Delivery(ArrayList<Item> b) {
				super( b);
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("\n\nThis is your order For Delivery");
			}

			@Override
			public void confirmOrder() {
				// TODO Auto-generated method stub
				System.out.println("Enter delivery address: " );
				String s;
				Scanner sc=new Scanner(System.in);
				s=sc.nextLine();
				System.out.println("Delivery confirmed to address: "+s );
				
			}

			@Override
			public void charges() {
				// TODO Auto-generated method stub
				System.out.println("Delivery charges: $10");
			}}


