import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LavaCake {

	/* CalculateLavaCake() method gets user input of how many grams and if they are a user.
	 *  As well as calculates pricing  
	 */
	public void CalculateLavaCake()
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
	    
	    
		   //Ask User How Many Grams 
		   System.out.println("How many Grams Woudld you Like?: "); 
		   numOfGrams = choice.nextDouble(); 
		   
		   //tells User The amount they inputed 
		   System.out.println("You Chose " + numOfGrams + " Grams of Lava Cake"); 
		   if(numOfGrams == 3.5 || numOfGrams == 7 || numOfGrams == 14 || numOfGrams == 28 || numOfGrams == 448)
		   {
		   //Asks User Member Status 
		   System.out.println("\n Are you A memeber? Yes or no? ");
		   memberAnswer = choice.nextInt();
		   } 
		   
		   if (memberAnswer == 1 && numOfGrams == 3.5  )
			{
			   //Congratulates User on being member and Qualified for Discount 
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
		   //User is Member and Chose 7 Grams 
		   else if (memberAnswer == 1 && numOfGrams == 7  )
			{
			    //Amount being taken off full price 
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
				
				//User is Member and Chose 14 Grams 
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
				
				//User is A Member and Chose 28 Grams 
			}else if (memberAnswer == 1 && numOfGrams == 28)
			{
				//Amount being taken from the full price 
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
				
				//User Is A Member and Chose 448 Grams 
			}else if (memberAnswer == 1 && numOfGrams == 448)
			{
				//
				double discountAmount = 1248.80; 
				
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
				//Currency Format Object
				NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); 
				
				//Equation 
				totalBTax =  basePrice * numOfGrams; 
				taxedAmount = totalBTax * tax;  
				grandTotal = totalBTax + taxedAmount;
				
				//Variable
				String gTotalBTax = format.format(totalBTax); 
				
				//Calculation Output 
				System.out.println("Your total Before tax is: " + gTotalBTax);
				String gTaxedAmount = format.format(taxedAmount); 
				System.out.println("Taxed Amount: " + gTaxedAmount);
				System.out.println("---------------------------------------------");
				String gGrandTotal = format.format(grandTotal); 
				System.out.println("Grand Total: " + gGrandTotal);
				choice.close(); 
			}
		
	}
	 public void Information()
	 {
		 
	 }
}
