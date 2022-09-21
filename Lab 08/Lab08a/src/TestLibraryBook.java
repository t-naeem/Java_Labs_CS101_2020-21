
/*
 * Lab08a, Objects and Refrences
 * 
 * @author Talha Naeem, Student ID: 21801124
 * @version 20th December 2020
 * 
 */

public class TestLibraryBook {

    

    public static void main(String[] args) {
        //Declaration
        LibraryBook book_1; 
        LibraryBook book_2; 
        LibraryBook book_3; 
        LibraryBook book_4; 
        LibraryBook instance_x;
        LibraryBook instance_y;
        
        //Initialization
        book_1 = new LibraryBook("The Adventures of Huckleberry Finn", "Mark Twain"); 
        book_2 = new LibraryBook("Sherloack Holmes","Sir Aurther Conan Doyle"); 
        book_3 = new LibraryBook("Sherloack Holmes", "Sir Aurther Conan Doyle"); 
        book_4 = new LibraryBook("The Adventures of Tom Sawyer", "Mark Twain"); 



        // Code
            System.out.println("---------Calling the function to lian the Book_1--------");

            //Loan the first book
            book_1.loanBook();
           
            System.out.println(book_1);
    
            System.out.println("---------Checking if the book is on Loan--------");
    
            //Check if book is loaned
            if (book_1.onLoan()) {
                System.out.println("The book is on Loan");
    
            }
            else {
                System.out.println("The Book is not on Loan");
    
            }
    
            //Get the amount of times the book has been loaned
            System.out.println("---------Checking how many times the book is on loan--------");
            System.out.println(book_1.getTimesLoaned());


            System.out.println("---------Calling the function to return the book--------");
    
            //return the book
            book_1.returnBook();
            System.out.println(book_1);

            System.out.println(book_1);


           //book_1.loanBook();
          

           instance_x = book_1;
           instance_y = book_1;

           System.out.println("---------Testing Part A--------");
            System.out.println("Two References to a Single Object With == " + ( instance_x ==  instance_y));
            System.out.println("two references to a single object with .equals: " + ( instance_x.equals( instance_y)));

            instance_y = book_4;

            System.out.println("---------Testing Part B--------");
            System.out.println("two references to two individual objects with different properties using ==: " + (instance_x ==  instance_y));
            System.out.println("two references to two individual objects with different properties using .equals: " + ( instance_x.equals( instance_y)));

            instance_x = book_2;
            instance_y = book_3;

            System.out.println("---------Testing Part C--------");
            System.out.println("two references to two individual objects with identical relevant properties ==: " + ( instance_x ==  instance_y));
            System.out.println("two references to two individual objects with identical relevant properties: " + ( instance_x.equals(instance_y)));

            //They reason in their difference is the memory location they are stored in.
            //When we specifically state that instance_x = instance_y, only then the pc knows they are the same object. Otherwise not.


            LibraryBook book_to_clone = new LibraryBook(book_2);
            System.out.println(book_to_clone);
 

            System.out.println("has same title " + (book_2.hasSameTitle(book_3)));

            System.out.println("has same Author " + (book_2.hasSameAuthor(book_1)));


    }




}
