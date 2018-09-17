import java.util.InputMismatchException;
import java.util.*;

public class Test 
{
	final static Scanner keyboard = new Scanner(System.in);
	static ProductDB database = new ProductDB();
	static ArrayList<Customer> customerList = new ArrayList<Customer>();

	public static void main(String[] args)
	{
	//Attributes	
	boolean exit = false; //Allows user to exit and terminate
		
	
	//Switch Scenario/Menu
	while (exit == false) 
	{
		System.out.println("Please enter a menu option");

		System.out.println("1. Create New Phone");
		System.out.println("2. Search for a product by supplying the product ID");
		System.out.println("3. Display all products");
		System.out.println("4. Order Products");
		System.out.println("5. Display all orders");
		System.out.println("6. Quit");

			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch (choice) {

			case 1:
				printTitle("Create New Phone:");
				addPhone();
				break;
				
			case 2:
				printTitle("Search for a product by supplying the product ID:");
				searchID();
				break;
				
			case 3:
				printTitle("Display all products:");
				printDatabase();
				break;
				
			case 4:
				printTitle("Order Products:");
				addOrder();
				break;
				
			case 5:
				printTitle("Display all orders:");
				displayAllOrders();
				break;
				
			case 6:
				System.out.println("Goodbye");
				exit = true;
				break;
				
			}
			System.out.println("\nPress Return to continue");
			keyboard.nextLine();
		}

	}

	
	//Menu Methods(Prints Title Card)
	/**
	 * 
	 * @param title
	 *           
	 */
	private static void printTitle(String title) 
	{
		System.out.println(title);
	}

	
	//Verify String Methods
	/**
	 * 
	 * @param prompt1 = Question 
	 * @param prompt2 = Error 
	 * @return res
	 * 
	 */
	private static String stringInput(String prompt1, String prompt2)
	{
		String res;
		System.out.println(prompt1);
		res = keyboard.nextLine();
		
		while (res.isEmpty())
		{
			System.out.println(prompt2);
			res = keyboard.nextLine();
		}

		return res;

	}
	
	
	//Verify Num Methods
	/**
	 * 
	 * @param param = Number must be higher
	 * @param prompt = Question
	 * @return 
	 */
	private static int verifyNum(int param, String prompt)
	{
		int startPoint = -1; //Auto caught on the InputMismatch unless changed
		System.out.println(prompt);
		do
		{
			try 
			{
				startPoint = keyboard.nextInt();
			}

			catch (InputMismatchException e)//Catches incorrect Data type
			{ 
				System.out.println("Enter a Number: ");
				keyboard.next();
			}
			if (startPoint < param) 
			{
				System.out.println("Enter a number greater than or equal to " + param);
			}
		} while (startPoint < param);

		return startPoint;
	}

	
	//Case 1 Methods
	private static void addPhone() 
	{
		//Variables
		String make;
		String model;
		int space = -1;//Auto caught on the InputMismatch unless changed
		String description;
		double price = -1;//Auto caught on the InputMismatch unless changed
		
		//Sets and Verify
		make = stringInput("Input Make", "Error");
		model = stringInput("Input Model", "Error");
		description = stringInput("Input Description", "Error");
		price = verifyNum(0, "Input Price");
		space = verifyNum(0, "Input Storage(in GB)");
		
		//Adds product to Database
		database.addProduct(new Phone(make, model, space, description, price));
	}
		
	
	//Case 2 Methods
	private static void searchID()
	{
		System.out.println("Find by Product Unique ID");
		System.out.println("Enter product Unique ID (Note ID starts at 1):");
		int id = keyboard.nextInt();
		database.printID(id);
	}

	
	//Case 3 Methods
	private static void printDatabase()
	{
		database.print();
	}

	
	// Case 4 Methods
	private static void addOrder() 
	{
		//Variables
		int input;
		int id;
		int quantity;
		String name;
		boolean verify = false;
	
		//ArrayLists
		Customer c = null;
		Order o = null;
		OrderDetails od = null;
		Product temp = null;
		
		name = stringInput("Enter Customer Name: ", "Error");
		c = new Customer(name);
		o = new Order();
		do {
			verify = false;
			id = -1;//Auto caught on the InputMismatch unless changed
			while (id < 1)
				id = verifyNum(0,"Enter the product ID for the product you wish to order: ");

			quantity = -1;//Auto caught on the InputMismatch unless changed
			while (quantity < 1)
				quantity = verifyNum(0,"Enter the quantity you wish to order: ");

			temp = database.findID(id);//Puts product in temp storage 

			o.addProduct(temp, quantity);

			input = -1;//Auto caught on the InputMismatch unless changed
			while (input < 1 || input > 2)
				input = verifyNum(0,"Add another order? \n1. Yes \n2. No");
				

			if (input == 2) 
			{
				verify = true;
				c.addOrder(o);
				customerList.add(c);
			}
		} while (verify == false);
	}
	
	
	//Case 5 Methods
	private static void displayAllOrders()
	{
		String name = new String();
		Customer c = null;
		name = stringInput("Enter Name of Customer: ", "Error");

		for (int i = 0; i < customerList.size(); i++)
		{
			if (name.equals(customerList.get(i).getName())) 
			{
				customerList.get(i).printOrders();
				break;
			}
		}
	}
}
