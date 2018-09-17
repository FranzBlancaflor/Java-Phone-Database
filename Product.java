
public class Product {

	//Attributes
	private String name;//Name of Product
	private String description;//Description of Product
	private double price;//Price of Product
	private int productID;//ID of product
	private static int ID = 0;//ID increments the counter by one
	
	
	//Constructor
	@SuppressWarnings("static-access")
	public Product(String name,String description,double price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.ID += 1;
		this.productID = ID;
	}
	
	//Get Methods
	public String getName()
	{
		return this.name; 
	}
	
	public String getDesc()
	{
		return this.description; 
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getID()
	{
		return this.productID; 
	}
	
	
	//Set Methods

	public void setName(String n) {
		this.name = n;
	}
	
	public void setDesc(String d) {
		this.description = d;
	}

	public void setPrice(double p) {
		this.price = p;
	}
	
	
	//Extra Functions
	public String toString()
	{
		String product =" ";
		product += "Name:" + this.name + " \n" + "Description:" + this.description + " \n" + "Price:€" + this.price;
		return product;
	}
	
	public void print()
	{
		System.out.println(toString()); 
	}
}
