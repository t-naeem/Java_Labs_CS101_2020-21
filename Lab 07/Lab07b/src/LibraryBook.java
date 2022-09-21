import java.util.Scanner;

public class LibraryBook {
    
    //Variables
    String title;
    String author;
    String dueDate;
    int timesLoaned;

    //Constructor
    public void libraryBookDetails() {
        title = "";
        author = "";
        dueDate = "";

    }

    //toString Method
    public String toString() {
        return title + " " + author + " " + dueDate + " " + timesLoaned;
    }

    //Loan Book method
    public void loanBook() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter due date for the book being loaned in dd/mm/yyyy format");
        dueDate = scan.nextLine(); 
        timesLoaned++; 
        scan.close();

    }

    //return book method
    public void returnBook() {
        dueDate = "dd/mm/yyyy";
        timesLoaned = 0;
    }

    //return the times loaned
    public int getTimesLoaned() {
        return timesLoaned;
    }

    //check if book is loaned
    public Boolean onLoan() {

        if( timesLoaned == 0) {
            return false;
        }
        else {
            return true;

        }   

    }



}
