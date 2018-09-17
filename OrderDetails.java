public class OrderDetails
{

	// Attributes
	private Product product; // The name of the product
	private int quantity; // The number of product

	
	// Constructors
	public OrderDetails(Product p, int q)
	{
		this.product = p;
		this.quantity = q;
	}

	
	// Get Methods
	public Product getProduct()
	{
		return product;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	
	// Set Methods
	public void setProduct(Product p) 
	{
		this.product = p;
	}

	public void setQuantity(int q)
	{
		this.quantity = q;
	}

	
	// Extra Functionality
	public void print() {
		String details = new String();
		
		if(product instanceof TV)
			details += "Make: " + (((TV) this.product).getMake()) + "\nScreen Type: " + (((TV) this.product).getType()) + "\nQuantity: " + this.quantity;
		
		if(product instanceof Phone)
			details += "Make: " + (((Phone) this.product).getMake()) + "\nModel:" + (((Phone) this.product).getModel()) + "\nQuantity: " + this.quantity;
		
		System.out.println(details);
	}
}