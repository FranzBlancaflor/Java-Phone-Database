import java.util.Scanner;
import java.util.ArrayList;
public class Order 
{
	final static Scanner kb = new Scanner(System.in);
	ArrayList<OrderDetails> orderList; 

	
	// Constructors
	public Order()
	{
		orderList = new ArrayList<OrderDetails>(); 
	}
	
		
	// Get Methods
	public ArrayList<OrderDetails> getOrder() 
	{
		return this.orderList;
	}
		
	
	// Extra Functionality
	public void addProduct(Product p, int q)
	{
		OrderDetails o = new OrderDetails(p, q);
		this.orderList.add(o);
		System.out.println("Added new product to index: " + (this.orderList.size()-1) + "\nQuantity: " + q);
	}
	
	
	public void printAll()
	{
		for(int i = 0; i < orderList.size(); i++) 
		{
			orderList.get(i).print();
		}
	}

}
