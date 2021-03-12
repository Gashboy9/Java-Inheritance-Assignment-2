package assignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author("Gabriel","gabriel@gmail.com",'m');
		Book book = new Book("Toby's Story", author, 56.24, 1555);
		
		System.out.println(author);
		System.out.println(book);

	}

}


class Author{
	private String name;
	private String email;
	private char gender;

	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	
	
	public String toString() {
		return name + " ("+ gender+") "+ "at "+email;
	}
	
}



class Book{
	
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book (String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "' "+name+" ' "+ "by " + author.toString();

	}
	
}