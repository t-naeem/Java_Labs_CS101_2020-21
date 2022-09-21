public class TestLibraryBook {
    

    public static void main(String[] args) {
        
        //Initialization
        LibraryBook firstBook = new LibraryBook(); 
        
        //Initializing title, author and due date
        firstBook.title = "The Adventures of Sherlock Holmes -";
        firstBook.author = "Sir Arther Conan Doyal -";
        firstBook.dueDate = "dd/mm/yy - ";

        // Code
            System.out.println("Loaning the book");

            //Loan the first book
            firstBook.loanBook();
            //Display the name
            System.out.println(firstBook);
        
            //Check if book is loaned
            if (Boolean.TRUE.equals(firstBook.onLoan())) {
                System.out.println("The Book is on Loan");
    
            }
            else {
                System.out.println("The Book is not on Loan");
    
            }
    
            //Get the amount of times the book has been loaned
            System.out.println("How many times the book has been loaned?");
            System.out.println(firstBook.getTimesLoaned());


            System.out.println("Returning the Book");
    
            //return the book
            firstBook.returnBook();
            System.out.println(firstBook);

    }




}
