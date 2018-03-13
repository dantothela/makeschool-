
/*** 
 * @ Daniela Monreal 
 * 
 */
	public class Book { 
	
	
	private String title; // will hold title of the book
	private String author;  // will hold the author of the book
	private int rating;	// what the user sends in as a rating
	private int totalRating; // will hold the total / sum rating of one book 
	private int numOfRatings = 0;  // number of ratings entered 
	private double price;  // will hold the sum of the ratings (WHY IS THIS HERE) 
	private boolean hardcover; 
	private String cover; 	//string form of hardcover
	private double  average; // will hold the average 
	private String BookSRecomm;	//holds the string for book recommendation

	/**Constructor: Sets initializes title and author values when the 
	 * user decides not to enter additional information 
	 * @param title 
	 * @param author
	 */
	public  Book(String title, String author) {
	this.title = title; 
	this.author = author; 
	 rating = 0; 
	 price = 7.00; 
	 hardcover = !hardcover; 
	}
	
	/** Constructor: Sets initial face value, when the user enters information aboout the 
	 * @param title 

	 * @param author
	 * @param price
	 * @param hardcover
	 */
	public  Book(String title, String author, double price, boolean hardcover) { 
	this.title = title;    
	this.author=author; 
	this.price = price; 
	this.hardcover = hardcover; 
	rating = 0; 
	 
	
	}
				// Rating Method  
	
	public int getRating (){
		return rating; 
	}
	public void setRating (int rating) { 
		this.rating = rating; 
		
	}
				// Price Method
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
				// Hardcover Method 
	public boolean getHardcover() {
		
		return hardcover; 	
	}

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
		if (hardcover == false )
		{ 
			cover = "no hardcover available ";
		}
		else 
		{ 
			cover = "Hardcover available "; 
		}
	}
				// Title Method 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
				// Author Method 
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
				// Adds rating 
	public void addRating () { 
		 numOfRatings++;
		 totalRating+=rating; 
	
	}
				// Divide the total SUM of ratings by the NUM of ratings entered 
	public double findAvgRating () { 
		 
		
		double average = (totalRating/numOfRatings);
		return average; 
		
	}
	
	
	
	// Book Recommondation:Returns a string based on the average rating of the book 
	public String BookRecommendation() { 
		  
		double  average = findAvgRating();  
	  
		if ( average>=1 && average<= 2) 
		{
			BookSRecomm = "Not Recommended"; 
			return BookSRecomm;	
		}
		else if (average>=3 && average <=4)
		{
			BookSRecomm = " Recommended"; 
			return BookSRecomm; 
		}
		else if (average >4 && average <5)
		{
			BookSRecomm = "Highly Recommended"; 
			return BookSRecomm; 
		}
		
		else 
		{ 		
			BookSRecomm = "Not enough information "; 
			return BookSRecomm; 
		}
	}
	
	
	/* Returns string representation of a Book object:
	title, author, number of ratings, average rating, price and book recommendation*/
	public String toString() 
	{
		numOfRatings --;
		
			return "Following book is added to the Amazon Database\n" + "Title: "+ title + "\n" +
			"Author: " + author + "\n" +
			"Total: "  + numOfRatings+ "\n"+
			"Average: " + findAvgRating() + "\n"+
			"Price: " + price + "\n"+
			" Hardcover: "+ cover + "\n"+
			"Book Recommendation: " + BookSRecomm;  
	}

	
	
}