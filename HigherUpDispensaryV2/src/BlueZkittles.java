import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
//import javax.swing.JOptionPane; 

/*
 * This Program is for the BlueZkittles. Within this program holds the following: 
 * 
 * CalculateBlueZkittle() method for User input and Calculation  
 * 
 * Information() method for the information about the BlueZkittles Strand. 
 */
public class BlueZkittles {
	
	public void CalculateBlueZkittle() {
		//Variables 
	    double numOfGrams; //Number of Grams User inputs 
	    int memberAnswer = 0;  
		double tax = 0.06; // Default Tax Amount 
		double discountTotal; //The Total Amount with Discount 
		double grandTotal; //Final Sale Amount 
		double totalBTax; // Total Before Tax 
		double taxedAmount; //Amount that is taxed 
		double basePrice = 10.00; //Default Price
		
		//Keyboard 
		Scanner choice = new Scanner(System.in);
		
		   //Ask User How many Grams 
		   //JOptionPane.showInputDialog("Enter Amount of Grams you would like to purchase?: "); 
		   System.out.println("How Many grams would you Like: ");
		   numOfGrams = choice.nextDouble(); 
		   
		   // Output "You Chose the amount of grams entered from numOfGrams  of Blue Zkittles 
		   System.out.println("You Chose " + numOfGrams + " Grams of Blue Zkittles"); 
	       if(numOfGrams == 3.5 || numOfGrams == 7 || numOfGrams == 14 || numOfGrams == 28 || numOfGrams == 448)
	       {
		   //Ask User about Member Status 
		   System.out.println("\nAre you a member? Yes or no? (Press 1 To say Yes you are a member, 2 For No ");
		   memberAnswer = choice.nextInt(); 
	       } 
		
	     //If-Else for Discount Prices 
		   
			/*******************************************************************************
			 * If the user is a member they get the Discount Price on the select amounts 
			 * However if the user Is not a member they pay regular Price  
			 *******************************************************************************/
			
			/*******************************************************************************
			*  The following Deals with Users 
			 * who are members buying the discount amounts  
			 *******************************************************************************/
	       
	       //The user is a member and Chose 3.5 
		   if (memberAnswer == 1 && numOfGrams == 3.5  )
			{
			   //Output for If Member
			System.out.println("Thank you for being a member! you Qualify for our discount!!");
			
			//Amount being taken off Full price 
			double discountAmount = 12.10; 
			
			//Equations
			totalBTax =  basePrice * numOfGrams; 
			taxedAmount = totalBTax * tax;  
			grandTotal = totalBTax + taxedAmount; 
			discountTotal = grandTotal - discountAmount;
			
			//Calculation Output 
			System.out.println("---------------------------------------------");
			System.out.println("Your total Before tax is: $" + totalBTax);
			System.out.println("Taxed Amount : $" + taxedAmount); 
			System.out.println("Total(Before Discount):$" + grandTotal);
			System.out.println("Discount: $" + discountAmount);
			System.out.println("---------------------------------------------");
			System.out.println("Grand Total(After Discount): $" + discountTotal); 
			}
			//User is a member and Chose 7 Grams 
			   else if (memberAnswer == 1 && numOfGrams == 7  )
				{
				   //Amount being taken off Full price 
					double discountAmount = 19.20; 
					
					//Equation 
					totalBTax =  basePrice * numOfGrams; 
					taxedAmount = totalBTax * tax;  
					grandTotal = totalBTax + taxedAmount; 
					discountTotal = grandTotal - discountAmount; 
					
					//Calculation Output 
					System.out.println("---------------------------------------------");
					System.out.println("Your total Before tax is: $" + totalBTax);
					System.out.println("Taxed Amount : $" + taxedAmount); 
					System.out.println("Total(Before Discount):$" + grandTotal);
					System.out.println("Discount: $" + discountAmount);
					System.out.println("---------------------------------------------");
					System.out.println("Grand Total(After Discount): $" + discountTotal); 
				  
					//User is a Member And chose 14 Grams 
				} else if (memberAnswer == 1 && numOfGrams == 14)
				{
					//Amount being taken off full price 
					double discountAmount = 48.00; 
					
					//Equation 
					totalBTax =  basePrice * numOfGrams; 
					taxedAmount = totalBTax * tax;  
					grandTotal = totalBTax + taxedAmount; 
					discountTotal = grandTotal - discountAmount; 
					
					//Calculation Output 
					System.out.println("---------------------------------------------");
					System.out.println("Your total Before tax is: $" + totalBTax);
					System.out.println("Taxed Amount : $" + taxedAmount); 
					System.out.println("Total(Before Discount):$" + grandTotal);
					System.out.println("Discount: $" + discountAmount);
					System.out.println("---------------------------------------------");
					System.out.println("Grand Total(After Discount): $" + discountTotal); 
					
					//User Is A Member And Number of grams Was 28 
				}else if (memberAnswer == 1 && numOfGrams == 28)
				{
					//Amount taken off full price 
					double discountAmount = 121.80; 
					
					//Equations 
					totalBTax =  basePrice * numOfGrams; 
					taxedAmount = totalBTax * tax;  
					grandTotal = totalBTax + taxedAmount; 
					discountTotal = grandTotal - discountAmount;
					
					//Calculation Output 
					System.out.println("Your total Before tax is: $" + totalBTax);
					System.out.println("Taxed Amount : $" + taxedAmount); 
					System.out.println("Total(Before Discount):$" + grandTotal);
					System.out.println("Discount: $" + discountAmount);
					System.out.println("---------------------------------------------");
					System.out.println("Grand Total(After Discount): $" + discountTotal);
					
					//User is a Member and Chose 448 Grams 
				}else if (memberAnswer == 1 && numOfGrams == 448)
				{
					//Amount being taken off full price 
					double discountAmount = 1248.80; 
					
					//Equation
					totalBTax =  basePrice * numOfGrams; 
					taxedAmount = totalBTax * tax;  
					grandTotal = totalBTax + taxedAmount; 
					discountTotal = grandTotal - discountAmount;
					
					//Calculation Output 
					System.out.println("Your total Before tax is: $" + totalBTax);
					System.out.println("Taxed Amount : $" + taxedAmount); 
					System.out.println("Total(Before Discount):$" + grandTotal);
					System.out.println("Discount: $" + discountAmount);
					System.out.println("---------------------------------------------");
					System.out.println("Grand Total(After Discount): $" + discountTotal);
				}
			   
					/********************************************************************************************
					 * The Following Results in either Non-Member Option or If the amount isn't a Discount amount 
					 *******************************************************************************************/
			  
				else
				{
					//Money Format 
					NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); 
					
					//Equation 
					totalBTax =  basePrice * numOfGrams; 
					taxedAmount = totalBTax * tax;  
					grandTotal = totalBTax + taxedAmount;
					
					//Calculation Output With Formatting 
					String gTotalBTax = format.format(totalBTax); 
					System.out.println("Your total Before tax is: " + gTotalBTax);
					String gTaxedAmount = format.format(taxedAmount); 
					System.out.println("Taxed Amount : " + gTaxedAmount);
					System.out.println("---------------------------------------------");
					String gGrandTotal = format.format(grandTotal); 
					System.out.println("Grand Total: " + gGrandTotal);
					choice.close(); 
				} 
			
				 
				
		
			
		
		
	}
	
	public void Information() 
	{
		//Description 
		System.out.println("Blue ZKittles is an Indica Dominate cross of Blue Diamond and Zkitttlez. \r\n" + 
				"The taste you reciveve from the bud has been noted to be a cirtus, sweet earth, \r\n" + 
				"and wildflower, some have also reported the flower to taste sweet like skittlez \r\n" + 
				"with a hint of a blueberry/sweet fruit taste. \r\n" + 
				"");
		
		//
	}
}
