//Programmed by: Talha Naeem
//ID: 21801124
//Date: 17-December-2020.

public class TestLibraryBook {

    public static void main(String[] args) {
        
        //Declaration
        LibraryBook firstBook;
        LibraryBook secondBook;
        LibraryBook thirdBook;
        LibraryBook fourthBook;
        
        //Initialization with class type LibraryBook not java actual built-in library but our own 
        firstBook = new LibraryBook(); 
        thirdBook = new LibraryBook();
        fourthBook = new LibraryBook();
        
        
        //Initializing title, author and due date
        firstBook.title = "The Adventures of Sherlock Holmes -";
        firstBook.author = "Sir Arther Conan Doyal -";
        firstBook.dueDate = "dd/mm/yy - ";
        
        // two refrences pointing to the same object
        secondBook = firstBook;

        thirdBook.title = "The Adventures of Tom Sawyer -";
        thirdBook.author = "Mark Twain -";
        thirdBook.dueDate = "dd/mm/yy - ";
        
        fourthBook.title = "The Adventures of Tom Sawyer -";
        fourthBook.author = "Mark Twain -";
        fourthBook.dueDate = "dd/mm/yy - ";
        
        

            System.out.println("Loaning the book");

            //Loan the first book
            firstBook.loanBook();
            
            //Display the book1
            System.out.println("________________");
            System.out.println(firstBook);
            System.out.println("________________");
        
            //Check if book is loaned
            if (Boolean.TRUE.equals(firstBook.onLoan())) {
                
                System.out.println("The Book is on Loan");
            }
            else {
                
                System.out.println("The Book is not on Loan");
            }
            
            System.out.println("________________");
            
            //Get the amount of times the book has been loaned
            System.out.println("How many times the book has been loaned?");
            System.out.println(firstBook.getTimesLoaned());

            System.out.println("________________");
            System.out.println("Returning the Book");
            System.out.println("________________");
    
            //return the book
            firstBook.returnBook();
            System.out.println(firstBook);
            
            System.out.println("\n A:");  
            System.out.println(firstBook == secondBook);
            System.out.println(firstBook.equals(secondBook));
            
            System.out.println("________________");
            
            System.out.println("\n B:"); 
            System.out.println(firstBook == thirdBook);
            System.out.println(firstBook.equals(thirdBook));
            
            System.out.println("________________");
            
            //thirdBook = fourthBook;
            
            System.out.println("\n C:"); 
            System.out.println(thirdBook == fourthBook);
            System.out.println(thirdBook.equals(fourthBook));

    }




}
