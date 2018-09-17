import java.util.ArrayList;
public class Customer
{
	ArrayList<Order> order;
	
	// Attributes
	private String name; 
	private static int count;
	private int id; 
	
	
	// Constructors
	public Customer(String nameCustomer) 
	{ 
		this.name = nameCustomer;
		
		order = new ArrayList<Order>();
		count++;
		id = count;
	}
	

	// Get Methods	
	public String getName()
	{
		return name;
	}

	public int getID()
	{
		return id;
	}
	
	public Order getOrder(int i) 
	{	
		return order.get(i);
	}
	
	public void addOrder(Order order)
	{
		this.order.add(order);
	}

	
	// Set Methods
	public void setName(String n)
	{
		this.name = n;
	}
	
	
	// Extra Functionality
	public void printOrders() {
		
		for(int i = 0; i < order.size(); i++)
		{
			System.out.println("Order: " + (i + 1));
			order.get(i).printAll();
		}
	}
	
}
