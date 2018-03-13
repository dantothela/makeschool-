import javax.swing.JOptionPane; 
import java.util.Random; 
import java.text.DecimalFormat; 

/** 
*This class tests the Book class 
* @DanielaMonreal 		
*/ 		
public class Amazon
	{ 
	public static void main(String[] args)
	{
		String Input2Top; 
		String InfoInput; 
		String InputHardC;
		boolean InputHardc;
		double average1; 
		String title;
		String author; 
		String rating; 
		int rating1;
 
		String price;
		double priceN; 
		
		
		
		Book b; 
	
		
		// Variables for Questions input 
		
		
		//Greeting
		JOptionPane.showMessageDialog(null, "Welcome"); 
		 
		
		do 
		{   // Enter name of of book and author 
			title = JOptionPane.showInputDialog(" Enter the title of the book");  
			author = JOptionPane.showInputDialog(" Enter the author of the book"); 
		 
			b  = new Book(title,author);
			
			// Ask if the user has more information for the book 
			InfoInput = JOptionPane.showInputDialog("Do you have more information "
					+ "for the book: Price, type of cover... etc"); 
			
			// If user enters that they have more information, they will go through this 
			if (InfoInput.equalsIgnoreCase("yes") || (InfoInput.equalsIgnoreCase("y")))
		{
				price = JOptionPane.showInputDialog(" Enter book price"); 
				priceN= Double.parseDouble(price); 
				b.setPrice(priceN); 
				
				InputHardC = JOptionPane.showInputDialog (" Is this Hardcover (y or n) "); 
				InputHardc = Boolean.parseBoolean(InputHardC);
				b.setHardcover(InputHardc);
				
			
				do {
				rating = JOptionPane.showInputDialog("Enter Rating (1-4) or 0 for no rating"); 
				rating1 = Integer.parseInt(rating); 
				b.setRating(rating1); 
				b.addRating(); 
					} while (rating1 != 0);
				
		}
			else 
				do {
				rating = JOptionPane.showInputDialog("Enter Rating (1-4) or 0 for no rating"); 
				rating1 = Integer.parseInt(rating); 
				b.setRating(rating1); 
				boolean hardcover = false;  
				b.setHardcover(hardcover);
				b.addRating(); 
					} while (rating1 !=  0); 
			
		b.BookRecommendation();
		
		// Ask the user if they want to enter another book? 
		Input2Top =  JOptionPane.showInputDialog(" Do you want to enter another"
				+ " book information? (Yes or No? )");
		average1 = b.findAvgRating();
		
		
		// Display the Information 
		JOptionPane.showMessageDialog(null, b.toString());
		
			
		}
		while (Input2Top.equalsIgnoreCase("yes") || (Input2Top.equalsIgnoreCase("y"))); 
		
		
		
		
		
	}

	
}