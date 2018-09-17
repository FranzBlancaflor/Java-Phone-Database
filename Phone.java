
public class Phone extends Product
{
	//Attributes
	private String make;//Make of phone
	private String model;//Model of phone
	private int space;//Space allowed in gigabytes
	private final static String NAME = "Phone"; //Name is Phone
	
	
	//Constructor
	public Phone(String make, String model, int space, String description, double price)
	{ 
		super(NAME, description, price); 
		this.make = make;
		this.model = model;
		this.space = space;
	}
	
	
	//Get Methods
	public String getMake()
	{
		return this.make; 
	}
	
	public String getModel()
	{
		return this.model; 
	}
	
	public int getSpace()
	{
		return this.space;
	}
		
	
	//Set Methods
	public void setMake(String m)
	{
		this.make = m;
	}
		
	public void setModel(String mo)
	{
		this.model = mo;
	}

	public void setSpace(byte s)
	{
		this.space = s;
	}
		
		
	//Extra Functions
	public void print()
	{
		super.print(); 
		System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nSpace: " + this.space + "GB \nProduct ID:" + this.getID()); 
	}
}
