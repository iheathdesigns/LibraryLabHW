import java.util.ArrayList;
import java.util.List;

//The output when you run this program should be similar to the following: 
//
//Library hours:
//Libraries are open daily from 9am to 5pm.
//Library addresses:
//10 Main St.
//228 Liberty St.
//Borrowing The Lord of the Rings:
//You successfully borrowed The Lord of the Rings
//Sorry, this book is already borrowed.
//Sorry, this book is not in our catalog. 
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities 
//Books available in the second library:
//No book in catalog 
//Returning The Lord of the Rings:
//You successfully returned The Lord of the Rings 
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities
//The Lord of the Rings

public class Library {
	

	// Add the missing implementation to this class

	String addBook;
	String address;
	String printOpeningHours;
	String printAddress;
	boolean borrowBook;
	String printAvailableBooks;
	String returnBook;
	List<Book> availableBooks = new ArrayList<>();
	public Book bookTitle;
	
	
	
	
	public Library(String address) {
		this.address = address;
	}
	
	public Library(Book book) {
		this.bookTitle = book;
	}
	
	
	
	public static String Book(String bookTitle) {
		return bookTitle;
	}
	
	private void addBook(Book book) {
		this.bookTitle = book;
		availableBooks.add(book);
		
	}
	
	
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void getPrintAddress(String address) {
		this.printAddress = address;
	}
	
	private void printAddress() {
		
		String Library = "";
		System.out.println(Library);
	}
	
	
	
	public void borrowBook(String book) {
		
			if(Book.borrowed == true) {
				System.out.println("Sorry, this book is already borrowed.");
			} else {
				System.out.println("You successfully borrowed " + book);
			}
		
	}
	
	public void printAvailableBooks() {
		
		if(availableBooks.isEmpty()) {
			System.out.println("No books in catalog");
		} else {
			System.out.println(availableBooks);
		}
		
	}
	
	private void returnBook(String book) {
		System.out.println("You successfully returned " + book);
		
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }





	

	

	
}
