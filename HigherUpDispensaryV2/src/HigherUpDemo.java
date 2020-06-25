import java.util.Scanner;

public class HigherUpDemo {

	
	public static void main(String[] args) {
		/**
		 * Age Verification: 
		 * If the User Is Below 21 or Above 100 They are unable to enter the Application 
		 */
		int age; //To Verify user's age 
		
		//Keyboard to hold Age 
		Scanner input = new Scanner(System.in);  
	
		//Asks For Age 
		System.out.println( "Enter your Age");
		age = input.nextInt(); 
		
		//If User is Less than 21 or Older than 100 It closes the program, otherwise the user can continue 
		if(age < 21)
		{
			//Error Message 
			System.out.println("Sorry You are not old enough to acess this program");
			System.exit(0); 
		}
		else if (age > 100)
		{
			System.out.println("You are probably not this old, Ending Program..");
			System.exit(0);
		}
	    
	    
	    /******************************************
	     * INTRODUCTION 
	     *******************************************/
	    System.out.println("Welcome to the HigherUpDispensary, Below is a menu, Please Select a Number to continue! ");
	    
	    /**
	     * Main Menu 
	     */
	    
	    //Create Menu Object 
	    Menus menu = new Menus(); 
	    
	    //Create an int Variable to store the result of MainMenu() method 
	    int menuselect = Menus.MainMenu();
	    
	    if(menuselect == 1)
	    {
	    	System.out.println("You Selected: Buying ");
	    	System.out.println("Taking you to Buying Page...");
	    }
	    else if(menuselect == 2)
	    {
	    	System.out.println("You Selected: Information");
	    	System.out.println("\nTaking you to Information page...");
	    	
	    }
	 
	    //Create a switch case for Menu options 
	    switch(menuselect)
	    {
	    case 1: 
	    	
	    	/*******************************************
	    	 *BUYING MENU OPTION 
	    	 *******************************************/
	    	
	    	//Variable
	    	int menuItem; //To Hold Menu Selection input 
	    	
	    	//Displays Bud Menu and Takes User Option Inpuit 
	        menuItem = Menus.BudMenu(); 
	    	
	    	
	    	switch(menuItem)
	    	{
			   /********************************************************************************
			    *  FIRST OPTION - BLUE ZKITTLES 
			    *******************************************************************************/
			   case 1:
				   //Create Blue Zkittles Object
				   BlueZkittles BZ = new BlueZkittles(); 
				   
				   //Calculation for Blue Zkittles 
				   BZ.CalculateBlueZkittle();
			
		       break; 
		       
		       /******************************************************************************
			    *  SECOND OPTION -GORILLA GLUE  
			    *******************************************************************************/
		       
			   case 2:
				   
				   //Create Gorilla Glue Object
				 GorillaGlue GG = new GorillaGlue();
				 
				 //Calculation for Gorilla Glue 
				 GG.CalculateGorillaGlue();
	

				   break;
				   
				   /******************************************************************************
				    *  THIRD OPTION - LAVA CAKE 
				    *******************************************************************************/
			   case 3:
				   
				   //Create Lava Cake Object
				   LavaCake LC = new LavaCake(); 
				   
				   //Calculation for Lava Cake 
				   LC.CalculateLavaCake();
		
				   break; 
				   /******************************************************************************
				    *  FOURTH OPTION - OG KUSH 
				    *******************************************************************************/
			   case 4: 
				   
				   //Create OG Kush Object
				   OGKush OGK = new OGKush(); 
				   //Calculation for OG Kush 
				   OGK.CalculateOGKush();
				
				  break; 
			   }  
	    	
	    
	    	
	    	/*******************************************************
			 *         BUD INFORMATION SECTION 
			 ********************************************************/
	    case 2: 
	    	
	    	//Variable 
	    	int option1; //To Store Option #
	    	
	    	
	    	//Information Menu w/data  
	    	option1 = Menus.InformationMenu();
	    	
	    	switch(option1)
	    	{
	    	    /********************************************************************************
			    * DISCOUNT INFORMATION 
			    *******************************************************************************/
	    	case 0: 
	    		//Create Discount Object 
	    		Discount discount = new Discount(); 
	    		
	    		//Discount Information 
	    		discount.Information();
	    		
	    		break; 
	    		
	 	        /********************************************************************************
			    * BLUE ZKITTLES 
			    *******************************************************************************/
	    	case 1: 
	    		//Create Blue Zkittles Object 
	    		BlueZkittles info = new BlueZkittles(); 
	    		
	    		//Information about Blue Zkittles 
	    		info.Information();
	    		
	    		break; 
	    		   /********************************************************************************
				    * GORILLA GLUE 
				    *******************************************************************************/
	    	case 2: 
	    		//Create Gorilla Glue Object 
	    		GorillaGlue GG = new GorillaGlue(); 
	    		
	    		//Information about Gorilla Glue 
	    		GG.Information();
	    		break; 
	    		
	    		   /********************************************************************************
				    * LAVA CAKE 
				    *******************************************************************************/
	    	case 3: 
	    		// Create Lava Cake Object 
	    		LavaCake LC = new LavaCake(); 
	    		//Information about LavaCake 
	    		LC.Information();
	    		break;
	    		
	    		    /********************************************************************************
				    * OG KUSH
				    *******************************************************************************/
	    	case 4: 
	    		//Create OG Kush Object
	    		OGKush OGK = new OGKush(); 

	    		//Information about OG Kush 
	    		OGK.Information();
	    		break; 
	    	}
	   
	    } 
	    
	    }
	    
	}
	


