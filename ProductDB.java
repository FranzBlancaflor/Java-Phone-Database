import java.util.Scanner;
import java.util.ArrayList;
public class ProductDB 
{
	final static Scanner keyboard = new Scanner(System.in);
	ArrayList<Product> productDB;
	
	
	//Constructors
	public ProductDB() 
	{
		productDB = new ArrayList<Product>();
	}

	
	//Get Methods
	public ArrayList<Product> getDB() 
	{
		return this.productDB;
	}
	
	
	//Adding a Product to list
	public void addProduct(Product p)
	{
		if (p != null)
		{
			this.productDB.add(p);
			System.out.println("Added new product: " + this.productDB.indexOf(p));
			
		}

		else
			System.out.println("Null"); 
	}
	
	
	//Remove a Product from list
	public void removeProduct()
	{
		System.out.println("Put in the Product Unique ID to remove(Note id starts at 1): ");
		int ID = keyboard.nextInt();
		this.productDB.remove(ID);
		keyboard.nextLine();
		System.out.println("Product Removed");
	}
	
	
	//Find by Unique ID
	public Product findID(int id)
	{
		Product res = null;
		
		for (int i = 0; i < productDB.size(); i++)
		{
			if (productDB.get(i) != null)
			{
				if (id == productDB.get(i).getID()) 
				{
					System.out.println("Product found at index: " + i);
					res = productDB.get(i);
					break;
				}
			}
		}
		return res;
	}
	
	
	//Print by instance of
	public void print() 
	{
		for(int i = 0; i < productDB.size();i++) 
		{
			
			if(productDB.get(i) instanceof TV)
				((TV) productDB.get(i)).print();
			
			else if(productDB.get(i) instanceof Phone)
				((Phone) productDB.get(i)).print();
		
		}
	}
	
	
	//Print by ID
	public void printID(int id)
	{ 
		Product p = findID(id);
		p.print();
	}
}
