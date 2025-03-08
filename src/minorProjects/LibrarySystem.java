package minorProjects;
import java.util.*;
class objects
{
    private String title ;
    private String author ;
    objects(String title,String author)
    {
      this.title=title;
      this.author=author;
    }
    
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
	    }
    public void displayInfo()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }    

}
class Book extends  objects
{
    private double price;

    Book( String title,String author,double price)
    {
        super(title,author);
        this.price=price;
    }

    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    @Override
    public void displayInfo() 
    {
        System.out.println("Title of the book is  : "+getTitle());
        System.out.println("Author is  : "+getAuthor());
        System.out.println("Price of book is  : "+price);
    }
	   
}
public class LibrarySystem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  the number of books : ");
    int numberofBooks=sc.nextInt();

    Book books[] =new Book[numberofBooks];

    for(int i =0; i<numberofBooks;i++)
    {
      System.out.print("Title :");
      String title =sc.next();
      

      System.out.print("Author name :");
      String author =sc.next();
    

      System.out.print("Price  :");
      double price =sc.nextDouble();
      System.err.println("");

      books[i] = new Book(title, author,  price);
    

      
    }
    for (Book book : books) {
        System.out.println("Books details is given here");
        book.displayInfo();
        System.out.println();
    }
}
}
