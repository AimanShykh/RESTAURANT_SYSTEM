package Project;

import java.util.ArrayList;


	public  class Dinein extends Order{
		 private static int tablenum=0;
		 public int num;
		public Dinein( ArrayList<Item> b) {
			super( b);
			tablenum++;
			this.num=tablenum;
	
		}
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("\n\nThis is your order For DineIn");

		}
		public void confirmOrder() {
			System.out.println("Table reservation confirmed for table number: "+num );
	       
	    }
		

		@Override
		public void charges() {
		        System.out.println("Additional tax of 10%");
		}}


