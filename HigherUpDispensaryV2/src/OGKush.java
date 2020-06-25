import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * The OG Kush Class Contains The Calculation Method which Calculates total after Reciving input for how many grams 
 * 
 * Also Contains information about the strand in the Information() method 
 *
 */
public class OGKush {

	//CalculateOGKush Method 
	public void CalculateOGKush()
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
	    
	        //Ask User For Gram Amount
		   System.out.println("How many Grams Woudld you Like?: "); 
		   numOfGrams = choice.nextDouble(); 
		   
		   //Gram Amount Output 
		   System.out.println("You Chose " + numOfGrams + " Grams of OG Kush"); 
		   if(numOfGrams == 3.5 || numOfGrams == 7 )
			   
		   if(numOfGrams == 3.5 || numOfGrams == 7 || numOfGrams == 14 || numOfGrams == 28 || numOfGrams == 448)
		   //User Member Status Input 
		   System.out.println("\n Are you A memeber? Yes or no? ");
		   memberAnswer = choice.nextInt();
		   
		   //User Is Member and Chose 3.5 
		   if (memberAnswer == 1 && numOfGrams == 3.5 )
			{
			   //Congratulate  User on Being Member And Qualifying For discount 
			System.out.println("Thank you for being a member! you Qualify for our discount!!");
				
			//Amount being taken off Full Price 
			double discountAmount = 12.10; 
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
			
		} 
		   //User Is a Member, Chose 7 Grams 
			else if (memberAnswer == 1 && numOfGrams == 7 )
		{
			//Amount Being Taken off the Full Price 
			double discountAmount = 19.20; 
			
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
			
			//User is a member And Chose 14 Grams 
		} else if (memberAnswer == 1 && numOfGrams == 14)
		{
			//Amount Being taken off full price 
			double discountAmount = 48.00; 
			
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
			
			//User is a Member And Chose 28 Grams 
		}else if (memberAnswer == 1 && numOfGrams == 28)
		{
			//Amount being taken off full price 
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
			
		 //User is A member and CHose 448 Grams 
		} else if (memberAnswer == 1 && numOfGrams == 448)
		{
			//Amount taken off total price 
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
			
		else
		{
			//Currency Format 
			NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); 
			//Equations 
			totalBTax =  basePrice * numOfGrams; 
			taxedAmount = totalBTax * tax;  
			grandTotal = totalBTax + taxedAmount;
			
			//Calculation Output 
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
	    /********************************************************************************
	    * Information() Method 
	    *******************************************************************************/
	public void Information() 
	{
		System.out.println("\r\n" + 
				"\r\n" + 
				"Gorilla Glue (A.K.A  GG4) was created by GG Strains. \r\n" + 
				"Gorilla Glue is a Sativa-Dominate Hybrid (Meaning it Is uplifting) \r\n" + 
				"It is famous for its High THC Content (usually Wielding around 18-25% THC Levels however Some is found\r\n" + 
				"at 32% THC). The smell of the bud is quite strong in my opinion. ");
	}
}
