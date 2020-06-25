 import java.util.Scanner; 
public class Menus {
/**
 * This MainMenu() method will Display a Menu, The User will Select from the options 
 */
	
public static int MainMenu() 
	{
	//Variable 
		int selection; 
		
		//Keyboard 
		@SuppressWarnings("resource")
		Scanner option = new Scanner(System.in); 
		
		System.out.println("==========================================");
	    System.out.println("|   HigherUp Dispensary Menu Selection    |");
	    System.out.println("==========================================");
	    System.out.println("| Options:                                |");
	    System.out.println("|        1. Buying                        |");
	    System.out.println("|        2. Informaiton                   |");
	    System.out.println("|        3. Exit                          |");
	    System.out.println("===========================================");
	    
	    System.out.println("Select a Option: ");
	    selection = option.nextInt(); 
	    
	    return selection; 
	   
	    
	}

	
/*
 * The InformationMenu() Method is for the Information Section
 */

public static int InformationMenu()
{
	//Variable 
	int select; // Holds input of Option
	
	//Keyboard 
	@SuppressWarnings("resource")
	Scanner op = new Scanner(System.in); 
	
	System.out.println("==========================================");
    System.out.println("|   HigherUp Dispensary InfoMenu          |");
    System.out.println("===========================================");
    System.out.println("Options:");
    System.out.println("0. Discount Information");
    System.out.println("1. Blue Zkittlez");
    System.out.println("2. Gorilla Glue");
    System.out.println("3. Lava Cake");
    System.out.println("4. OG Kush");
    System.out.println("5. Exit"); 
    
    //Asking for User Input 
    System.out.println("Select a number from the options menu: ");

    //Storing User Input
    select = op.nextInt(); 
    
    /**
     * If-Then Statement to Determaine what was Chosen 
     */
    if (select == 0)
    {
    	System.out.println("You Chose Discount Information");
    	System.out.println("/n");
    }
    else if(select == 1)
    {
    	System.out.println("You Chose: Blue Zkittles!");
    	System.out.println("/n");
    }
    else if(select == 2)
     {
    	System.out.println("You Chose: Gorilla Glue");
    	System.out.println("/n");

     }
    else if(select == 3) 
    {
    	System.out.println("You Chose: Lava Cake");
    	System.out.println("/n");

    }
    else if (select == 4)
    {
    	System.out.println("You Chose: OG Kush");
    	System.out.println("/n");

    }
    else if (select == 5)
    {
    	System.out.println("You Chose: Exit!");
    	System.out.println("Exiting...");
    	System.exit(0);
    }
  
    
    return select; 

}

/****************************
 * 
 * BUD SELECTION / BUD MENU
 * 
 ****************************/

public static int BudMenu() 
{   
	int selection1; //Holds input 
	//Menu 
	System.out.println("==========================================");
    System.out.println("|   HigherUp Dispensary Menu Selection    |");
    System.out.println("===========================================");
    System.out.println("| Options:                                |");
    System.out.println("|        1. Blue Zkittles                 |");
    System.out.println("|        2. Gorilla Glue                  |");
    System.out.println("|        3. Lava Cake                     |");
    System.out.println("|        4. OG Kush                       |");
    System.out.println("|        5. Wedding Crusher               |");
    System.out.println("|        6. Exit                           |");
    System.out.println("===========================================");
    
    //Keyboard to Store input 
    @SuppressWarnings("resource")
	Scanner option = new Scanner(System.in); 
    do {
    System.out.println("Select # Option(1-5): ");
    selection1 = option.nextInt(); 
    /* 
     * If-Then Statement to determen next actions 
     */
   
    
    if(selection1 == 1)
    {
    	System.out.println("You Chose: Blue Zkittles!");
    }
    else if(selection1 == 2)
    {
    	System.out.println("You Chose: Gorilla Glue");
    }
    else if(selection1 == 3)
    {
    	System.out.println("You Chose: Lava Cake");
    }
    else if(selection1 == 4)
    {
    	System.out.println("You Chose: OG Kush");
    }
    else if(selection1 == 5)
    {
    	System.out.println("You Chose: Wedding Crasher");
    }
    else if(selection1 == 6)
    {
    	System.out.println("You Chose: Exit");
    	System.exit(0);
    }
    else 
    {
    	System.out.println("Invalid Option...Try Again");
    }
      
     
    //Return Int 
    return selection1; 
    
} while(selection1 > 6);   

}

} 