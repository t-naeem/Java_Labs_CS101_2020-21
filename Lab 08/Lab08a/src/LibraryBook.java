import java.util.Scanner;

/*
 * Lab8ab, Objects and Refrences
 * 
 * @author Talha Naeem, Student ID: 21801124
 * @version 20th December 2020
 * 
 */
public class LibraryBook {
    
    //Variables
    String title;
    String author;
    String dueDate;
    int timesLoaned;

    //Constructor - 1
    public LibraryBook(String title_book, String title_author) {
        title = title_book;
        author = title_author;
        dueDate = "dd/mm/yyyy";
        timesLoaned = 0;

    }
    
/*
 * Cloning method
 * to copy all the contents of a Object
 * 
 */

    //Copy Constructor
    LibraryBook(LibraryBook book_cloned){
        this.title = book_cloned.title;
        this.author = book_cloned.author;
        this.dueDate = book_cloned.dueDate;
        this.timesLoaned = book_cloned.timesLoaned;
    }

    //toString Method
    public String toString() {
        return title + " " + author + " " + dueDate + " " + " - Times Loaned - " + timesLoaned;
    }


/*
 * Loan the book by taking the user input
 * for the return dates and increment the
 * times borrowed
 */

    //Loan Book method
    public void loanBook() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter due date for the book being loaned in format dd/mm/yyyy: ");
        dueDate = scan.nextLine(); 
        timesLoaned ++; 
        scan.close();

    }
    
/*
 * Return the book by
 * resetting the date borrowed
 * and the times loaned
 */
    //return book method
    
    public void returnBook() {
        dueDate = "dd/mm/yyyy";
        timesLoaned --;
      
    }
/*
 * Get and return the number
 * of times loaned
 * 
 */
    //return the times loaned
    public int getTimesLoaned() {
        return timesLoaned;
    }

    //check if book is loaned
    public Boolean onLoan() {

        if (timesLoaned > 0) {
            return true;
        }
        else {
            return false;

        }   

    }

 /*
 * A person equals method
 * to match the title and author
 * of a book and return the result as Boolean
 */

    public Boolean equals(LibraryBook book) {
        if ((book.title == this.title) && (book.author == this.author))
           {
                return true;
            }

        else return false;
        
    }

/*
 * Check if the book has the same title
 * and return the boolean result
 * 
 */

    public Boolean hasSameTitle(LibraryBook book) {

        if (book.title == this.title) {
            return true;
        }
        
        else{
            return false;
        } 
    }

/*
 * Check if the book has the same author
 * and return the boolean result
 * 
 */

    public Boolean hasSameAuthor(LibraryBook book) {

        if (book.author == this.author) {
            return true;
        }
        else return false;



    }

}
