import java.util.Scanner;

/*
 * Lab08c, Arrays
 * 
 * @author Talha Naeem, Student ID: 21801124
 * @version 20th December 2020
 * 
 */

public class LibraryTest {
    

    public static void main(String[] args) {
        
        //Decalaration
        Scanner scan;
        String user_input_command;
        Boolean exit_condition;
        
        scan = new Scanner(System.in);
        


        Library library = new Library();
        

    
    //System.out.println(library.isEmpty());
    //System.out.println(library.toString());



    //System.out.println(library.isEmpty());
    //System.out.println(library.toString());


    //System.out.print(library.remove("The Prophet"));
    //System.out.println(library.toString());

    exit_condition = false;
    
    //As long as exit condition is false
    while (!exit_condition) {
        
    System.out.println("________________________");
    System.out.println("Welcome to the Library!");
    System.out.println("Choose any one of the available options: Show (or s) , Find (or f), Add (or a) , Exit (or e) ");
    user_input_command = scan.nextLine(); 

    //for showing the data in teh library
    if (user_input_command.equals("s") || user_input_command.equals("Show") || user_input_command.equals("show")) {
        System.out.println("__________________________________________");
        System.out.println("These are all the available books in  the Library");
        System.out.println(library.toString());
        System.out.println("______________________________________");


    }

/*
 * Take the user input for
 * finding a book and run relevant metehods
 * 
 */
    else if (user_input_command.equals("f") || user_input_command.equals("Find") || user_input_command.equals("find") ) {
        System.out.println("-----------------------------------------");

        System.out.println("Please enter the Title of the Book you want to find");
        String input_for_findng_book = scan.nextLine();
      

        if (library.bookExists(input_for_findng_book)) {
            System.out.println("_____________________________________");

            System.out.println("Book EXISTS, What would you like to do ? Loan it = L , Return it = R, Remove it = X ");
            String input_for_loaning_book = scan.nextLine(); 

            if (input_for_loaning_book.equals("l") || input_for_loaning_book.equals("loan") || input_for_loaning_book.equals("Loan")){
                System.out.println("____________________________________");

                library.loanBook(input_for_findng_book);
                //Loan the book
            }
            if (input_for_loaning_book.equals("r") || input_for_loaning_book.equals("return")|| input_for_loaning_book.equals("Return")){
                System.out.println("__________________________________");

                library.returnBook(input_for_findng_book);
                //return the book
            }
            
            if (input_for_loaning_book.equals("x") || input_for_loaning_book.equals("remove") || input_for_loaning_book.equals("Remove")) {
            System.out.println("_________________________________");
            System.out.println(library.remove(input_for_findng_book));
            //remove the book

        }
      }
      
        /*
        * Report the following
        * if the book does not exist
        * 
        */
        else {
            System.out.println("No such book exists");

        }


    }
    else if (user_input_command.equals("a")|| user_input_command.equals("Add") || user_input_command.equals("add")) {
        System.out.println("________________________________________________________________________________________");
        System.out.println("Please type the Name of the Book, Followed by the Author on the next line to Add the book");
        String user_book_name_input = scan.nextLine(); 
        String user_book_author_input = scan.nextLine(); 
        library.add(user_book_name_input, user_book_author_input);

    }
    else if (user_input_command.equals("e") || user_input_command.equals("exit") || user_input_command.equals("Exit") ) {
        
        System.out.println("__________");
        System.out.println("Thank you for using the library. Have a good day.");
        System.out.println("_________");
        exit_condition = true;
    }
}

    }

}
