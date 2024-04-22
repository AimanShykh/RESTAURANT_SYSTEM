package Project;
import java.util.ArrayList;


	public abstract class Order  {
	    private ArrayList<Item> ordered;
	    public double totalAmount;

	    // Constructor
	    public Order(ArrayList<Item> b) {
	        
	        this.ordered = new ArrayList<>();
	        this.totalAmount = 0.0;
	       
	    }
	   abstract public void display();
	   abstract public void confirmOrder();
	   abstract public void charges();
	    	
	    public void calculateTotalAmount() {
	        for (Item item : ordered) {
	            totalAmount += item.getPrice();
	        }}
	    
		
	   
	   
	}



