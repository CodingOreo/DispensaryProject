import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GorillaGlue {

	public void CalculateGorillaGlue()
	{
		//Variables 
	    double numOfGrams; //Number of Grams User inputs 
	    int memberAnswer = 0; 
		double tax = 0.06; // Default Tax Amount 
		double discountTotal; //The Total Amount with Discount 
		double grandTotal; //Final Sale Amount 
		double totalBTax; // Total Before Tax 
		double taxedAmount; //Amount that is taxed 
		double basePrice = 10.00; //Default Price 
		
		  //Scanner 
	    Scanner choice = new Scanner(System.in); 
	   
		 //Ask User Gram Amount 
		 System.out.println("How many Grams Woudld you Like?: "); 
		 numOfGrams = choice.nextDouble();
		 
		 
		   //If the user chooses the discount amount, they will be asked if they are a member or not 
		   if(numOfGrams == 3.5 || numOfGrams == 7 || numOfGrams == 14 || numOfGrams == 28 || numOfGrams == 448)
		   {
		   //Asks Member Status 
		   System.out.println("\n Are you A member? Yes or no? ");
		   memberAnswer = choice.nextInt();
		   } 

			//If-Else for Discount Prices 
		   
			/*******************************************************************************
			 * If the user is a member they get the Discount Price on the select amounts 
			 * However if the user Is not a member they pay regular Price no matter the amount listed   
			 *******************************************************************************/
			
			/*******************************************************************************
			*  The following Deals with Users 
			 * who are members buying the discount amounts  
			 *******************************************************************************/
		   
		   // User Is a Member And Chose 3.5
		   if (memberAnswer == 1 && numOfGrams == 3.5  )
			{
			   //Thanks User on being a member 
			System.out.println("Thank you for being a member! you Qualify for our discount!!");
			
			//Amount being taken off Full price 
			double discountAmount = 12.10; 
			
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
		    //User Is a Member And Chose 7 Grams 
		   else if (memberAnswer == 1 && numOfGrams == 7)
			{
			   //Amount being taken off Full price 
				double discountAmount = 19.20; 
				
				//Equations 
				totalBTax =  basePrice * numOfGrams; 
				taxedAmount = totalBTax * tax;  
				grandTotal = totalBTax + taxedAmount; 
				discountTotal = grandTotal - discountAmount; 
				
				//Calculation Output 
				System.out.println("Your total Before tax is: " + totalBTax);
				System.out.println("Taxed Amount : $" + taxedAmount); 
				System.out.println("Total(Before Discount):$" + grandTotal);
				System.out.println("Discount: $" + discountAmount);
				System.out.println("---------------------------------------------");
				System.out.println("Grand Total(After Discount): $" + discountTotal); 
				
				//User Is a Member and Chose 14 Grams 
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
				System.out.println("Your total Before tax is: $" + totalBTax);
				System.out.println("Taxed Amount : $" + taxedAmount); 
				System.out.println("Total(Before Discount):$" + grandTotal);
				System.out.println("Discount: $" + discountAmount);
				System.out.println("---------------------------------------------");
				System.out.println("Grand Total(After Discount): $" + discountTotal); 
				
				//User is a member and Chose 28 grams 
			}else if (memberAnswer == 1 && numOfGrams == 28)
			{
				//Amount being taken off full price 
				double discountAmount = 121.80; 
				
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
				/*********************************************************************************
				 * The Following else If Statements are all prices for Non-members with Discount bud amount
				 *********************************************************************************/
		  
			else
			{
				//Currency Formatter 
				NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); 
				//Equation 
				totalBTax =  basePrice * numOfGrams; 
				taxedAmount = totalBTax * tax;  
				grandTotal = totalBTax + taxedAmount;
				String gTotalBTax = format.format(totalBTax); 
				
				//Calculation Output 
				System.out.println("Your total Before tax is: " + gTotalBTax);
				String gTaxedAmount = format.format(taxedAmount); 
				System.out.println("Taxed Amount : " + gTaxedAmount);
				System.out.println("---------------------------------------------");
				String gGrandTotal = format.format(grandTotal); 
				System.out.println("Grand Total: " + gGrandTotal);
				choice.close(); 
			}
		 
		   
	}
	
	//Information Method Contaning Information About Gorilla Glue
	public void Information() 
	{
		System.out.println("Gorilla Glue (A.K.A  GG4) was created by GG Strains. \r\n" + 
				"Gorilla Glue is a Sativa-Dominate Hybrid (Meaning it Is uplifting) \r\n" + 
				"It is famous for its High THC Content (usually Wielding around 18-25% THC Levels however Some is found\r\n" + 
				"at 32% THC). The smell of the bud is quite strong in my opionon. ");
	}
}
