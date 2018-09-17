
public class TV extends Product
{
	//Attributes
	private String make;//Make of he TV
	private byte screen;//Size of screen in inches
	private String type;//Type of TV(Plasma,LED,etc)
	private boolean capable;//3D capable
	private final static String NAME = "TV"; //Name is TV
	
	
	//Constructor
	public TV(String make, byte screen, String type, boolean capable, String description, double price)
	{ 
		super(NAME, description, price); 
		this.make = make;
		this.screen = screen;
		this.type = type;
		this.capable = capable;
	} 
	
	
	//Get Methods
		public String getMake()
		{
			return this.make; 
		}
		
		public int getScreen()
		{
			return this.screen; 
		}
		
		public String getType()
		{
			return this.type;
		}
		
		public boolean getCapable()
		{
			return this.capable;
		}
		
		
		//Set Methods
		public void setMake(String m)
		{
			this.make = m;
		}
			
		public void setScreen(byte s)
		{
			this.screen = s;
		}

		public void setType(String t)
		{
			this.type = t;
		}
		
		public void setCapable(boolean c)
		{
			this.capable = c;
		}
		
			
		//Extra Functions
		public void print()
		{
			super.print(); 
			System.out.println("Make: " + this.make + "\nScreen Size: " + this.screen + "\nScreen Type: "+ this.type + "\nProduct ID: " + this.getID());
		}
	}




